-- MySQL dump 10.13  Distrib 5.5.56, for Win32 (AMD64)
--
-- Host: localhost    Database: hrsystem
-- ------------------------------------------------------
-- Server version	5.5.56

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `application_tb`
--

DROP TABLE IF EXISTS `application_tb`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `application_tb` (
  `app_id` int(11) NOT NULL AUTO_INCREMENT,
  `attend_id` int(11) NOT NULL,
  `app_reason` varchar(255) DEFAULT NULL,
  `app_result` tinyint(1) DEFAULT NULL,
  `type_id` int(11) NOT NULL,
  PRIMARY KEY (`app_id`),
  KEY `type_id` (`type_id`),
  KEY `attend_id` (`attend_id`),
  CONSTRAINT `application_tb_ibfk_1` FOREIGN KEY (`type_id`) REFERENCES `attend_type_tb` (`type_id`),
  CONSTRAINT `application_tb_ibfk_2` FOREIGN KEY (`attend_id`) REFERENCES `attendence_tb` (`attend_id`)
) ENGINE=InnoDB AUTO_INCREMENT=38 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `application_tb`
--

LOCK TABLES `application_tb` WRITE;
/*!40000 ALTER TABLE `application_tb` DISABLE KEYS */;
INSERT INTO `application_tb` VALUES (12,6,'',1,2),(13,13,'ȥ',1,7),(14,5,'',1,1),(15,12,'ѧУ',1,2),(16,3,'',1,7),(17,10,'ȥ',1,7),(18,3,'',1,3),(19,20,'',1,2),(20,13,'',1,1),(21,22,'',1,1),(22,21,'',1,2),(23,12,'',1,1),(24,14,'',1,3),(25,29,'',1,7),(26,30,'forget to punch',1,1),(27,68,'l feel sick this morning',1,3),(28,37,'',1,5),(29,37,'ллO(',1,3),(30,69,'9',1,4),(31,70,'С',1,2),(32,67,'',1,1),(33,28,'',1,7),(34,36,'·',1,4),(35,36,'',1,4),(36,66,'',1,5),(37,36,'',1,1);
/*!40000 ALTER TABLE `application_tb` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `attend_type_tb`
--

DROP TABLE IF EXISTS `attend_type_tb`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `attend_type_tb` (
  `type_id` int(11) NOT NULL AUTO_INCREMENT,
  `amerce_amount` double NOT NULL,
  `type_name` varchar(50) NOT NULL,
  PRIMARY KEY (`type_id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `attend_type_tb`
--

LOCK TABLES `attend_type_tb` WRITE;
/*!40000 ALTER TABLE `attend_type_tb` DISABLE KEYS */;
INSERT INTO `attend_type_tb` VALUES (1,0,''),(2,-20,''),(3,-10,''),(4,-10,''),(5,-10,''),(6,-30,''),(7,10,'');
/*!40000 ALTER TABLE `attend_type_tb` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `attendence_tb`
--

DROP TABLE IF EXISTS `attendence_tb`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `attendence_tb` (
  `attend_id` int(11) NOT NULL AUTO_INCREMENT,
  `duty_day` varchar(50) NOT NULL,
  `punch_time` datetime DEFAULT NULL,
  `is_come` tinyint(1) NOT NULL,
  `type_id` int(11) NOT NULL,
  `emp_id` int(11) NOT NULL,
  PRIMARY KEY (`attend_id`),
  KEY `type_id` (`type_id`),
  KEY `emp_id` (`emp_id`),
  CONSTRAINT `attendence_tb_ibfk_1` FOREIGN KEY (`type_id`) REFERENCES `attend_type_tb` (`type_id`),
  CONSTRAINT `attendence_tb_ibfk_2` FOREIGN KEY (`emp_id`) REFERENCES `intern_tb` (`emp_id`)
) ENGINE=InnoDB AUTO_INCREMENT=71 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `attendence_tb`
--

LOCK TABLES `attendence_tb` WRITE;
/*!40000 ALTER TABLE `attendence_tb` DISABLE KEYS */;
INSERT INTO `attendence_tb` VALUES (1,'2017-05-09',NULL,1,6,1),(2,'2017-05-09',NULL,1,6,2),(3,'2017-05-09',NULL,1,3,3),(4,'2017-05-09',NULL,1,6,4),(5,'2017-05-09',NULL,1,1,6),(6,'2017-05-09',NULL,1,2,9),(7,'2017-05-09',NULL,1,6,19),(8,'2017-05-09',NULL,0,6,1),(9,'2017-05-09',NULL,0,6,2),(10,'2017-05-09',NULL,0,7,3),(11,'2017-05-09',NULL,0,6,4),(12,'2017-05-09',NULL,0,1,6),(13,'2017-05-09',NULL,0,1,9),(14,'2017-05-09',NULL,0,3,19),(15,'2017-05-10',NULL,0,6,1),(16,'2017-05-10',NULL,0,6,2),(17,'2017-05-10','2017-05-10 15:25:07',0,6,3),(18,'2017-05-10',NULL,0,6,4),(19,'2017-05-10',NULL,0,6,6),(20,'2017-05-10','2017-05-10 14:46:51',0,2,9),(21,'2017-05-10',NULL,0,2,19),(22,'2017-05-10',NULL,0,1,25),(23,'2017-05-11',NULL,1,6,1),(24,'2017-05-11',NULL,1,6,2),(25,'2017-05-11',NULL,1,6,3),(26,'2017-05-11',NULL,1,6,4),(27,'2017-05-11',NULL,1,6,6),(28,'2017-05-11',NULL,1,7,9),(29,'2017-05-11','2017-05-11 11:29:30',1,7,19),(30,'2017-05-11','2017-05-11 22:08:45',1,1,25),(31,'2017-05-11',NULL,0,6,1),(32,'2017-05-11',NULL,0,6,2),(33,'2017-05-11',NULL,0,6,3),(34,'2017-05-11',NULL,0,6,4),(35,'2017-05-11',NULL,0,6,6),(36,'2017-05-11',NULL,0,4,9),(37,'2017-05-11','2017-05-11 15:19:42',0,3,19),(38,'2017-05-11','2017-05-11 22:08:39',0,1,25),(39,'2017-05-06',NULL,1,1,19),(40,'2017-05-06',NULL,0,1,19),(41,'2017-05-05',NULL,1,1,19),(42,'2017-05-05',NULL,0,1,19),(43,'2017-05-04',NULL,1,1,19),(44,'2017-05-04',NULL,0,1,19),(45,'2017-05-03',NULL,1,1,19),(46,'2017-05-03',NULL,0,1,19),(47,'2017-05-02',NULL,1,1,19),(48,'2017-05-02',NULL,0,1,19),(49,'2017-05-01',NULL,1,1,19),(50,'2017-05-01',NULL,0,1,19),(51,'2017-04-30',NULL,1,1,19),(52,'2017-04-30',NULL,1,7,19),(53,'2017-04-30',NULL,0,4,19),(54,'2017-04-29',NULL,1,6,19),(55,'2017-04-29',NULL,0,5,19),(56,'2017-04-28',NULL,1,3,19),(57,'2017-04-28',NULL,0,3,19),(58,'2017-04-27',NULL,1,2,19),(59,'2017-04-27',NULL,0,4,19),(60,'2017-04-26',NULL,1,6,19),(61,'2017-04-36',NULL,0,4,19),(62,'2017-05-12',NULL,0,6,1),(63,'2017-05-12',NULL,0,6,2),(64,'2017-05-12',NULL,0,6,3),(65,'2017-05-12',NULL,0,6,4),(66,'2017-05-12',NULL,0,5,6),(67,'2017-05-12',NULL,0,1,9),(68,'2017-05-12',NULL,0,3,19),(69,'2017-05-12',NULL,0,4,25),(70,'2017-05-12',NULL,0,2,27);
/*!40000 ALTER TABLE `attendence_tb` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `checkback_tb`
--

DROP TABLE IF EXISTS `checkback_tb`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `checkback_tb` (
  `check_id` int(11) NOT NULL AUTO_INCREMENT,
  `app_id` int(11) NOT NULL,
  `check_result` tinyint(1) NOT NULL,
  `check_reason` varchar(255) DEFAULT NULL,
  `mgr_id` int(11) NOT NULL,
  PRIMARY KEY (`check_id`),
  KEY `app_id` (`app_id`),
  KEY `mgr_id` (`mgr_id`),
  CONSTRAINT `checkback_tb_ibfk_1` FOREIGN KEY (`app_id`) REFERENCES `application_tb` (`app_id`),
  CONSTRAINT `checkback_tb_ibfk_2` FOREIGN KEY (`mgr_id`) REFERENCES `intern_tb` (`emp_id`)
) ENGINE=InnoDB AUTO_INCREMENT=32 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `checkback_tb`
--

LOCK TABLES `checkback_tb` WRITE;
/*!40000 ALTER TABLE `checkback_tb` DISABLE KEYS */;
INSERT INTO `checkback_tb` VALUES (5,12,1,'',2),(6,13,1,'',2),(7,14,1,'ok,',2),(8,15,1,'',2),(9,16,1,'ף',1),(10,17,1,'û',1),(11,18,1,'',1),(12,19,1,'',2),(13,20,1,'',2),(14,21,1,'',2),(15,22,1,'OK',2),(16,23,1,'ok',2),(17,24,1,'take care',2),(18,25,1,'',2),(19,26,1,'fine,just remember to punch the next time',2),(20,27,1,'take care',2),(21,28,1,'û',2),(22,29,1,'ok',2),(23,30,1,'',2),(24,31,1,'',2),(25,32,1,'fine',2),(26,33,1,'ok',2),(28,34,0,'',2),(29,35,1,'',2),(30,36,1,'take care',2),(31,37,0,'',2);
/*!40000 ALTER TABLE `checkback_tb` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `intern_tb`
--

DROP TABLE IF EXISTS `intern_tb`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `intern_tb` (
  `emp_id` int(11) NOT NULL AUTO_INCREMENT,
  `emp_type` int(11) DEFAULT NULL,
  `emp_name` varchar(50) NOT NULL,
  `emp_pass` varchar(50) NOT NULL,
  `emp_salary` double NOT NULL,
  `mgr_id` int(11) DEFAULT NULL,
  `dept_name` varchar(50) DEFAULT NULL,
  `emp_board` datetime DEFAULT NULL,
  `emp_tel` varchar(50) DEFAULT NULL,
  `emp_mail` varchar(50) DEFAULT NULL,
  `emp_real_name` varchar(50) DEFAULT NULL,
  `emp_id_num` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`emp_id`),
  UNIQUE KEY `emp_name` (`emp_name`),
  KEY `mgr_id` (`mgr_id`)
) ENGINE=InnoDB AUTO_INCREMENT=32 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `intern_tb`
--

LOCK TABLES `intern_tb` WRITE;
/*!40000 ALTER TABLE `intern_tb` DISABLE KEYS */;
INSERT INTO `intern_tb` VALUES (1,2,'David','eded',4500,NULL,'DB','2016-01-03 01:01:01','34634563','David@163.com','David','1199508064678'),(2,2,'ppd','weblogic',4500,NULL,'Server','2016-01-03 01:01:01','34634563','ppd@163.com','ppd','2199508064678'),(3,1,'mysql','mysql',4500,1,NULL,'2016-01-03 01:01:01','34634563','mysql@163.com','mysql','3199508064678'),(4,1,'hsql','hsql',4500,1,NULL,'2016-01-03 01:01:01','34634563','hsql@163.com','hsql','4199508064678'),(6,1,'jetty','efw',4500,2,NULL,'2016-01-03 01:01:01','34634563','jetty@163.com','jetty','6199508064678'),(9,1,'John','123',4500,2,NULL,'2016-01-03 01:01:01','34634563','John@163.com','John','9199508064678'),(19,1,'fefre','bgs',4500,2,NULL,'2016-01-03 01:01:01','34634563','fefre@163.com','fefre','19199508064678'),(25,1,'vfd','dfc',4500,2,NULL,'2016-01-03 01:01:01','34634563','vfd@163.com','vfd','25199508064678'),(27,1,'steven','qwe',4500,2,NULL,'2016-01-03 01:01:01','34634563','steven@163.com','steven','27199508064678'),(29,1,'fdfd','345',4500,2,NULL,'2016-01-03 01:01:01','34634563','fdfd@163.com','fdfd','29199508064678'),(30,1,'night','123',4500,2,NULL,'2016-01-03 01:01:01','34634563','night@163.com','night','30199508064678'),(31,0,'admin','admin',4500,NULL,NULL,'2016-01-03 01:01:01','34634563','admin@163.com','admin','31199508064678');
/*!40000 ALTER TABLE `intern_tb` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `job_tb`
--

DROP TABLE IF EXISTS `job_tb`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `job_tb` (
  `job_id` int(11) NOT NULL AUTO_INCREMENT,
  `grade` int(11) NOT NULL,
  `finished` tinyint(1) NOT NULL,
  `task_id` int(11) NOT NULL,
  `intern_id` int(11) NOT NULL,
  `accepted` varchar(50) DEFAULT NULL,
  `accept_date` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`job_id`),
  KEY `task_id` (`task_id`),
  KEY `intern_id` (`intern_id`),
  CONSTRAINT `job_tb_ibfk_1` FOREIGN KEY (`task_id`) REFERENCES `task_tb` (`task_id`),
  CONSTRAINT `job_tb_ibfk_2` FOREIGN KEY (`intern_id`) REFERENCES `intern_tb` (`emp_id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `job_tb`
--

LOCK TABLES `job_tb` WRITE;
/*!40000 ALTER TABLE `job_tb` DISABLE KEYS */;
INSERT INTO `job_tb` VALUES (1,100,1,1,27,NULL,NULL),(2,0,0,1,9,NULL,NULL),(3,0,0,1,19,NULL,NULL);
/*!40000 ALTER TABLE `job_tb` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `salary_tb`
--

DROP TABLE IF EXISTS `salary_tb`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `salary_tb` (
  `pay_id` int(11) NOT NULL AUTO_INCREMENT,
  `pay_month` varchar(50) NOT NULL,
  `pay_amount` double NOT NULL,
  `emp_id` int(11) NOT NULL,
  PRIMARY KEY (`pay_id`),
  KEY `emp_id` (`emp_id`),
  CONSTRAINT `salary_tb_ibfk_1` FOREIGN KEY (`emp_id`) REFERENCES `intern_tb` (`emp_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `salary_tb`
--

LOCK TABLES `salary_tb` WRITE;
/*!40000 ALTER TABLE `salary_tb` DISABLE KEYS */;
INSERT INTO `salary_tb` VALUES (1,'2017-04',3435,6),(2,'2017-04',3435,9);
/*!40000 ALTER TABLE `salary_tb` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `task_tb`
--

DROP TABLE IF EXISTS `task_tb`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `task_tb` (
  `task_id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(50) NOT NULL,
  `content` varchar(255) NOT NULL,
  `assign` varchar(50) NOT NULL,
  `deadline` varchar(50) NOT NULL,
  `manager_id` int(11) NOT NULL,
  PRIMARY KEY (`task_id`),
  KEY `manager_id` (`manager_id`),
  CONSTRAINT `task_tb_ibfk_1` FOREIGN KEY (`manager_id`) REFERENCES `intern_tb` (`emp_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `task_tb`
--

LOCK TABLES `task_tb` WRITE;
/*!40000 ALTER TABLE `task_tb` DISABLE KEYS */;
INSERT INTO `task_tb` VALUES (1,'jenkins builder job','please build jenkins code on jenkins...','2017-05-16','2017-05-22',2);
/*!40000 ALTER TABLE `task_tb` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-06-03 16:05:59
