### 

```
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

### Report
(User)Simons-Air:lab simonpark$ spark-submit popular-movies-nicer.py 
('Kolya (1996)', 1)
('GoldenEye (1995)', 2)
('Star Wars (1977)', 2)
('Braveheart (1995)', 3)

```
