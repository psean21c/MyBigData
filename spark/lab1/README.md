
Assignment: Tally up amount spent by customer using Spark

### Requirement

```
CustemerID, product ID , amount
44,8602,39.19
35,5368,65.89
44,3391, 40.64
47,6694,14.98
35,680,13.08

=>
44, 77.83
35, 78.97
47, 14.98
```

### Strategy
```
Split each comma-delimited line into fields
Map each line to key/value pairs of customer ID and dollar amount
Use reduceByKey to add up about spent by customer ID
Collect() the results and print them

* Split comma-delimited fields: 
 >> fields = line.split(‘,’)
* Treat field 0 as an integer, and field 2 s a floating point number; 
  >> return (int(fields[0]), float(fields[2])
```


Assignment: Sort your results by amount spent per customer
