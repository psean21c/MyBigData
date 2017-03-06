
# Connect to MS SQL from node

### Structure

```
{root}
  |-- node_modules
  |-- run 
       |--- connect.js
```

### Steps
```
1) build a structure and place a cursor in {root}
2) install express/ mssql
   > npm install express 
3) cd(change directory) to {run} and create connect.js
4) run connect.js
   > node connect.js
```

### connect.js

```javascript
var express = require('express');
var app = express();

app.get('/', function (req, res) {

    var sql = require("mssql");

    // config for your database
    var config = {
        user: 'cccapp',
        password: 'cccapp',
        server: 'devsql001.autocapitalcanada.local:1433',
        database: 'cccdev01'
    };

    // connect to your database
    sql.connect(config, function (err) {

        if (err) console.log(err);

        // create Request object
        var request = new sql.Request();

        // query to the database and get the records
        request.query('select * from Student', function (err, recordset) {

            if (err) console.log(err)

            // send records as a response
            res.send(recordset);

        });
    });
});

var server = app.listen(5000, function () {
    console.log('Server is running..');
});

```
