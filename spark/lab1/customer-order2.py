from pyspark import SparkConf, SparkContext

conf = SparkConf().setMaster("local").setAppName("CustomerAmount")
sc = SparkContext(conf = conf)


def parseLine(line):
    fields = line.split(',')
    customerID = fields[0]
    amount = fields[2]
    return (int(customerID), float(amount))
    
input = sc.textFile("customer-orders.csv")

parsedLines = input.map(parseLine)
# parsedLines.foreach(print)

reduceTemp = parsedLines.reduceByKey(lambda x,y: x+y)
# reduceTemp.foreach(print)

reducedSorted = reduceTemp.map(lambda x: (x[1], x[0])).sortByKey()
# reducedSorted.foreach(print)

results = reducedSorted.collect()

for result in results:
    print(result[1] , result[0])
