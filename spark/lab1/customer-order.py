from pyspark import SparkConf, SparkContext

conf = SparkConf().setMaster("local").setAppName("CustomerAmount")
sc = SparkContext(conf = conf)

'''
44,8602,39.19
35,5368,65.89
44,3391, 40.64
47,6694,14.98
35,680,13.08

('44', ' 40.64')
('35', '13.08')
('47', '14.98')

'''
def parseLine(line):
    fields = line.split(',')
    customerID = fields[0]
    amount = fields[2]
    return (int(customerID), float(amount))
    
input = sc.textFile("customer-orders2.csv")

parsedLines = input.map(parseLine)
# parsedLines.foreach(print)

reduceTemp = parsedLines.reduceByKey(lambda x,y: x+y)
# reduceTemp.foreach(print)

results = reduceTemp.collect();
for result in results:
    print(result[0] , result[1])
