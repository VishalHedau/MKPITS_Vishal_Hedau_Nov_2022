//select query in sql use to show table data.


mysql> select * from address;
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

mysql> select * from familymembers;
+------+-----------------+------+-------------+------------+
| mid  | NAME            | AGE  | RELATION    | PHONE      |
+------+-----------------+------+-------------+------------+
|    1 | Dhanraj Hedau   |   50 | father      | 9767037809 |
|    2 | Sunita Hedau    |   45 | mother      | 9766877447 |
|    3 | Roshni Hedau    |   30 | sister      | 9175166959 |
|    4 | Madhuri Hedau   |   28 | sister      | 9075166959 |
|    5 | Gangadhar Hedau |   70 | GrandFather | 9767037809 |
|    6 | Parvati Hedau   |   60 | GrandMother | 9766275594 |
+------+-----------------+------+-------------+------------+
6 rows in set (0.00 sec)

mysql> select * from myfriends;
+------+----------------+------+-----------------+------------+
| SR   | NAME           | AGE  | ADDRESS         | PHONE      |
+------+----------------+------+-----------------+------------+
|    1 | Pavan Mohankar |   21 | Buttibori       | 9552307590 |
|    2 | Sachin Kalambe |   23 | Narkhed         | 9552307590 |
|    3 | Bharat Gayki   |   22 | Aurangabad      | 9552307590 |
|    4 | Rahul Nivesh   |   25 | Wardhaman-Nagar | 9552307590 |
|    5 | Pranay Jumde   |   23 | Godhni          | 9552307590 |
+------+----------------+------+-----------------+------------+
5 rows in set (0.00 sec)