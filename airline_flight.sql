-- MySQL dump 10.13  Distrib 8.0.31, for Win64 (x86_64)
--
-- Host: localhost    Database: airline
-- ------------------------------------------------------
-- Server version	8.0.31

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `flight`
--

DROP TABLE IF EXISTS `flight`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `flight` (
  `flyid` varchar(45) NOT NULL,
  `flightname` varchar(45) NOT NULL,
  `source` varchar(45) NOT NULL,
  `dept` varchar(45) NOT NULL,
  `date` varchar(45) NOT NULL,
  `arrvTime` varchar(45) NOT NULL,
  `deptTime` varchar(45) NOT NULL,
  `price` varchar(45) NOT NULL,
  PRIMARY KEY (`flyid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `flight`
--

LOCK TABLES `flight` WRITE;
/*!40000 ALTER TABLE `flight` DISABLE KEYS */;
INSERT INTO `flight` VALUES ('FID22001','SPICEJET','PATNA','DELHI','2022-11-30','10:30 AM','12:30 PM','3500'),('FID22002','AIRAISA','India','United States','2022-11-30','05:30 PM','12:30 PM','98000'),('FID22003','Air Asia Airlines','Japan','Brazil','2022-11-30','05:00 PM','11:00 PM','105000'),('FID22004','Tiger Airways','India','Germany','2022-12-05','03:45 PM','09:00 PM','75000'),('FID22005','Virgin Atlantic','India','Germany','2022-11-15','01:30 PM','09:30 PM','60000'),('FID22006','Indigo Airlines','India','United States','2022-11-30','05:30 PM','09:15 AM','100000'),('FID22007','Virgin Atlantic','India','Russia','2022-12-14','09:00 PM','01:00 PM','150000'),('FID22008','Air Asia','India','Russia','2022-12-22','10:30 AM','05:30 PM','65000'),('FID22009','Air Asia Airlines','India','United States','2022-12-31','10:30 PM','05:30 AM','55000');
/*!40000 ALTER TABLE `flight` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-12-01 16:21:13
