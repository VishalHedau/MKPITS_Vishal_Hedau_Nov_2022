//procedure storage in sql


mysql> delimiter @
mysql> delimiter @ create procedure vis() begin select* from address end @
mysql> call vis@
ERROR 1305 (42000): PROCEDURE myfamilydb.vis does not exist
mysql> delimiter ;
mysql> call vis ;
ERROR 1305 (42000): PROCEDURE myfamilydb.vis does not exist
mysql> delimiter @
mysql> create procedure vis()
    -> begin
    -> select * from address
    -> end
    -> @
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near '' at line 4
mysql> delimiter @
mysql> create procedure vis()
    -> begin
    -> select * from address;
    -> end
    -> @
Query OK, 0 rows affected (0.00 sec)

mysql> call vis@
+------+----------+-------+---------+
| mid  | city     | state | pincode |
+------+----------+-------+---------+
|    1 | nag      | MH    | 0021    |
|    2 | shimla   | HP    | 0022    |
|    8 | varanasi | UP    | 0023    |
|    9 | bhopal   | MP    | 0024    |
|    1 | itarsi   | MP    | 0028    |
+------+----------+-------+---------+
5 rows in set (0.01 sec)

Query OK, 0 rows affected (0.02 sec)

mysql> delimiter ;
mysql> call vis ;
+------+----------+-------+---------+
| mid  | city     | state | pincode |
+------+----------+-------+---------+
|    1 | nag      | MH    | 0021    |
|    2 | shimla   | HP    | 0022    |
|    8 | varanasi | UP    | 0023    |
|    9 | bhopal   | MP    | 0024    |
|    1 | itarsi   | MP    | 0028    |
+------+----------+-------+---------+
5 rows in set (0.00 sec)

Query OK, 0 rows affected (0.02 sec)