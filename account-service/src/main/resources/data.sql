DROP TABLE IF EXISTS customer;
DROP TABLE IF EXISTS accounts;


 
CREATE TABLE `customer` (
  `customer_id` int AUTO_INCREMENT  PRIMARY KEY,
  `name` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `mobile_number` varchar(20) NOT NULL,
  `create_date` date DEFAULT NULL
);

CREATE TABLE `accounts` (
  `id` int NOT NULL AUTO_INCREMENT  PRIMARY KEY,
  `customer_id` int NOT NULL,
  `account_number` int ,
  `account_type` varchar(100) NOT NULL,
  `account_address` varchar(200) NOT NULL,
  `create_date` date DEFAULT NULL
);


INSERT INTO `customer` (`name`,`email`,`mobile_number`,`create_date`)
 VALUES ('Anurag Upadhyay','test@upadhyay.com','9876548337',CURDATE());
 
INSERT INTO `accounts` (`customer_id`, `account_number`, `account_type`, `account_address`, `create_date`)
 VALUES (1, 186576453, 'paid', '123 Main Street, New York', CURDATE());
 

