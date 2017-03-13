
var express = require('express');
var app = express();

var server = app.listen(5005, function () {
    console.log('Server is running..');
    var sql = require("mssql");

    // config for your database
    var connection = new sql.Connection({
        user: 'cccapp',
        password: 'cccapp',
        server: 'devsql001.autocapitalcanada.local', 
        database: 'cccdev01' 
    }); 

    // connect to your database
    connection.connect(function (err) {
        if (err) console.log(err);
        console.log('connectd as id :' + connection.threadId);
    }); 
   
   var transaction = new sql.Transaction(connection);

   transaction.begin(function(err) {
      var request = new sql.Request(transaction);
      request.query("insert into phx_authority(name) values('STAFF')", function(err,recordset) {
         transaction.commit(function(err,recordset){
            if (err) console.log(err); 
            console.log("Transaction committed"); 
         }); 
     }); 

   });  

   //connection.close();
});

