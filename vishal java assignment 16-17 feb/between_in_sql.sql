// between in sql  


mysql> select * from familymembers where mid between 1 and 3;
+------+---------------+------+----------+------------+
| mid  | NAME          | AGE  | RELATION | PHONE      |
+------+---------------+------+----------+------------+
|    1 | Dhanraj Hedau |   50 | father   | 9767037809 |
|    2 | Sunita Hedau  |   45 | mother   | 9766877447 |
|    3 | Roshni Hedau  |   30 | sister   | 9175166959 |
+------+---------------+------+----------+------------+
3 rows in set (0.00 sec)