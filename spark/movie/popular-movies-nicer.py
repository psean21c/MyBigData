from pyspark import SparkConf, SparkContext

'''
open("u.item", encoding="utf-8") with open('u.item', encoding = "ISO-8859-1")

## u.item
1|Toy Story (1995)|01-Jan-1995||http://us.imdb.com/M/title-exact?Toy%20Story%20(1995)|0|0|0|1|1|1|0|0|0|0|0|0|0|0|0|0|0|0|0
2|GoldenEye (1995)|01-Jan-1995||http://us.imdb.com/M/title-exact?GoldenEye%20(1995)|0|1|1|0|0|0|0|0|0|0|0|0|0|0|0|0|1|0|0
3|Braveheart (1995)|16-Feb-1996||http://us.imdb.com/M/title-exact?Braveheart%20(1995)|0|1|0|0|0|0|0|0|1|0|0|0|0|0|0|0|0|1|0
5|Kolya (1996)|24-Jan-1997||http://us.imdb.com/M/title-exact?Kolya%20(1996)|0|0|0|0|0|1|0|0|0|0|0|0|0|0|0|0|0|0|0
6|Star Wars (1977)|01-Jan-1977||http://us.imdb.com/M/title-exact?Star%20Wars%20(1977)|0|1|1|0|0|0|0|0|0|0|0|0|0|0|1|1|0|1|0


## u.data
### UserID, Movie ID, Rating, Timestamp
196	2	3	881250949
186	3	3	891717742
22	3	1	878887116
244	5	2	880606923
166	2	1	886397596
298	6	4	884182806
498	3	4	884182806
398	6	4	884182806

('Contact (1997)', 509)
('Star Wars (1977)', 583)

'''

def loadMovieNames():
    movieNames = {}
    with open("u.ITEM", encoding = "ISO-8859-1") as f:
        for line in f:
            fields = line.split('|')
            movieNames[int(fields[0])] = fields[1]
    return movieNames

conf = SparkConf().setMaster("local").setAppName("PopularMovies")
sc = SparkContext(conf = conf)

nameDict = sc.broadcast(loadMovieNames())

lines = sc.textFile("u.data")
movies = lines.map(lambda x: (int(x.split()[1]), 1))
movieCounts = movies.reduceByKey(lambda x, y: x + y)

flipped = movieCounts.map( lambda x : (x[1], x[0]))
sortedMovies = flipped.sortByKey()

sortedMoviesWithNames = sortedMovies.map(lambda countMovie : (nameDict.value[countMovie[1]], countMovie[0]))

results = sortedMoviesWithNames.collect()

for result in results:
    print (result)
