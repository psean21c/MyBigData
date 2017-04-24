
### mySQL

[Install mySQL]

April-24: Uninstall and install : Corrupted and failed to restart 
version: 5.7.18
```
root@localhost:wJv7s_&qX,gu
How to Reset the Root Password in the MySQL reference manual.
```

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
$ mysql -u root -p
Enter password:
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

### Reference
[MySQL official](https://dev.mysql.com/doc/mysql-getting-started/en/)

[Install on Mac](https://dev.mysql.com/doc/refman/5.7/en/osx-installation-pkg.html)

