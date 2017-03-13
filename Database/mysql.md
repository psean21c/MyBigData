
### mySQL

[Install mySQL]

[start/stop/restart DB]
```
sudo /usr/local/mysql/support-files/mysql.server start
sudo /usr/local/mysql/support-files/mysql.server stop
sudo /usr/local/mysql/support-files/mysql.server restart
```

```
sudo launchctl load -F /Library/LaunchDaemons/com.oracle.oss.mysql.mysqld.plist
sudo launchctl unload -F /Library/LaunchDaemons/com.oracle.oss.mysql.mysqld.plist
```

[Reset the password for root]
```
$ start {mysql}
$ mysqld --skip-grant-tables
```

Execute these statements.
```
$ mysql -u root mysql
$mysql> UPDATE user SET Password=PASSWORD(‘math****’) where USER='root';
$mysql> FLUSH PRIVILEGES;
```

[Create DB and User]
```
mysql> create database greeting;
$create user ‘greetusr’@‘localhost’ identified by ‘greetpwd’;
$grant all on greeting.* to ‘greetusr’@‘localhost’;
$flush privileges;
$exit;
```

-----------------------------
[Check port for mysql]
```
/usr/local/mysql/support-files/my-default.cnf

mysql> show global variables like 'port';
```

[Driver for SQL Developer]

Preferences > Database > 3 Party JDBC Drivers

