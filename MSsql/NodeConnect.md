
### server.js


```javascript
// Directly retreive the data records
var express = require('express');
var app = express();

var server = app.listen(5000, function () {
    console.log('Server is running..');
    var sql = require("mssql");

    var config = {
        user: 'user-ccc.app',
        password: '********',
        server: '10.94.128.113',
        port: '1439',
        database: 'EDW'
    };

    sql.connect(config, function (err) {

        if (err) console.log(err);

        var request = new sql.Request();

        request.query('select * from CAF.Customer', function (err, recordset) {

            if (err) console.log(err)

            console.log(recordset);

        });
    });

});


```
