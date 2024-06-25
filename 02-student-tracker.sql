CREATE DATABASE  IF NOT EXISTS `user_tracker`;
USE `user_tracker`;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` int NOT NULL AUTO_INCREMENT,
  `first_name`varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

--
-- Table structure for table `income`
--

DROP TABLE IF EXISTS `income`;

CREATE TABLE `income` (
  `user_id` int NOT NULL,
  `id` int NOT NULL AUTO_INCREMENT ,
  `Local_Date` date DEFAULT NULL,
  `income_Price` float DEFAULT NULL,
  `income_Subject` varchar(45) DEFAULT NULL,
 `type_Cost` varchar(45) DEFAULT NULL,
 `price_Cost` float DEFAULT NULL,
`cost_Subject`varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
