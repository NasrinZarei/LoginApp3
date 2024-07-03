CREATE DATABASE  IF NOT EXISTS `user_tracker`;
USE `user_tracker`;

--
-- Table structure for table `comment`
--

DROP TABLE IF EXISTS `comment`;

CREATE TABLE `comment` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name`varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `subject` varchar(45) DEFAULT NULL,
  `comment` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;


