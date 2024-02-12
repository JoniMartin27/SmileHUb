-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: prdatos
-- ------------------------------------------------------
-- Server version	8.0.34

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
-- Table structure for table `consulta_cita`
--

DROP TABLE IF EXISTS `consulta_cita`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `consulta_cita` (
  `id_cita` int NOT NULL AUTO_INCREMENT,
  `id_tratamiento` int NOT NULL,
  `observaciones` varchar(300) DEFAULT NULL,
  `fecha` varchar(100) NOT NULL,
  `hora` varchar(100) NOT NULL,
  `nombrePaciente` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_cita`),
  KEY `fk_consulta_cita_tratamiento1_idx` (`id_tratamiento`),
  CONSTRAINT `fk_consulta_cita_tratamiento1` FOREIGN KEY (`id_tratamiento`) REFERENCES `tratamiento` (`id_tratamiento`)
) ENGINE=InnoDB AUTO_INCREMENT=42 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `consulta_cita`
--

LOCK TABLES `consulta_cita` WRITE;
/*!40000 ALTER TABLE `consulta_cita` DISABLE KEYS */;
INSERT INTO `consulta_cita` VALUES (1,2,'Consulta de rutina','2023-10-26','10:00:00','Ana Lisa'),(2,3,'Examen dental anual','2023-10-27','15:30:00','Rodrigo Matias'),(3,1,'Tratamiento de blanqueamiento','2023-10-28','09:15:00','Vicente Bancoco'),(14,2,'Testeo Procedimiento','2023-10-30','10:30:00','Miguel Tramas'),(39,1,'Subyugación Dental inferior','31/01/2024','9:00 AM','carlos López'),(40,1,'','25/01/2024','9:00 AM','CARLOS jerez'),(41,3,'Le pica un cojon','28/01/2024','10:00 AM','carlos jerez');
/*!40000 ALTER TABLE `consulta_cita` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dientes`
--

DROP TABLE IF EXISTS `dientes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `dientes` (
  `idDiente` int NOT NULL AUTO_INCREMENT,
  `nDiente` int DEFAULT NULL,
  `id_Paciente` int NOT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  `Estado` varchar(45) DEFAULT NULL,
  `protesis` int DEFAULT NULL,
  PRIMARY KEY (`idDiente`),
  KEY `fk_idPaciente` (`id_Paciente`),
  CONSTRAINT `fk_idPaciente` FOREIGN KEY (`id_Paciente`) REFERENCES `paciente` (`id_paciente`)
) ENGINE=InnoDB AUTO_INCREMENT=56 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dientes`
--

LOCK TABLES `dientes` WRITE;
/*!40000 ALTER TABLE `dientes` DISABLE KEYS */;
INSERT INTO `dientes` VALUES (42,11,1,'Descripción del diente 11','Sin riesgo',0),(43,12,1,'Descripción del diente 12','Sin riesgo',0),(44,13,1,'Descripción del diente 13','Sin riesgo',0),(45,14,1,'Sin riesgo','Bueno',0),(46,21,1,'Buen estado sin mas consideraciones','Buen estado',0),(47,22,1,'Descripción del diente 22','Sin riesgo',0),(48,23,1,'Descripción del diente 23','Sin riesgo',0),(49,24,1,'Descripción del diente 24','Sin riesgo',0),(50,31,1,'Descripción del diente 31','Sin riesgo',0),(51,32,1,'Descripción del diente 32','Sin riesgo',0),(52,33,1,'Descripción del diente 33','Sin riesgo',0),(53,41,1,'Descripción del diente 41','Sin riesgo',0),(54,42,1,'Descripción del diente 42','Sin riesgo',0),(55,43,1,'Descripción del diente 43','Sin riesgo',0);
/*!40000 ALTER TABLE `dientes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `doctor_administrador`
--

DROP TABLE IF EXISTS `doctor_administrador`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `doctor_administrador` (
  `id_doctor_administrador` int NOT NULL AUTO_INCREMENT,
  `id_especialidad` int DEFAULT NULL,
  `nombre` varchar(45) NOT NULL,
  `apellidos` varchar(45) NOT NULL,
  `direccion` varchar(45) NOT NULL,
  `fecha_alta` date DEFAULT NULL,
  `estado_baja` int NOT NULL,
  `genero` varchar(45) NOT NULL,
  `pass` varchar(45) NOT NULL,
  `tipo_usuario` int NOT NULL,
  `telefono` varchar(45) NOT NULL,
  `fecha_nacimiento` date DEFAULT NULL,
  `activo` int DEFAULT NULL,
  PRIMARY KEY (`id_doctor_administrador`),
  KEY `fk_doctor_administrador_especialidad1_idx` (`id_especialidad`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `doctor_administrador`
--

LOCK TABLES `doctor_administrador` WRITE;
/*!40000 ALTER TABLE `doctor_administrador` DISABLE KEYS */;
INSERT INTO `doctor_administrador` VALUES (1,57,'CAMBIADO','CAMBIADO','CAMBIADO223','2023-10-26',0,'CAMBIADO','CAMBIADO32',1,'CAMBIADO33','1980-03-15',NULL),(2,57,'CAMBIADO','CAMBIADO','CAMBIADO223','2023-10-26',0,'CAMBIADO','CAMBIADO32',0,'CAMBIADO33','1980-03-15',NULL),(3,58,'Dr.Carlos','López','Calle Secundaria 789','2023-10-26',0,'Masculino','contraseña3',1,'555-123-4567','1983-08-22',NULL),(4,NULL,'Dr.John','Smith','123 Main Street, Ciudad Dental','2023-10-26',0,'Masculino','password1',0,'123-456-7890','1980-03-15',NULL),(5,NULL,'Dra.Maria','García','456 Elm Street, Clínica Dental Sonrisas','2023-10-26',0,'Femenino','password2',0,'987-654-3210','1975-12-10',NULL),(9,2,'asdasd','asdasd','asdasd','2024-02-10',0,'Hombre','asdas',1,'asdasd','2024-10-23',NULL),(10,2,'asdasd','asdasd','asdasd','2024-02-10',1,'Mujer','asdas',1,'asdasd','2024-10-23',NULL),(11,2,'asdasd','asdasd','asdasd','2024-02-10',1,'Mujer','asdas',1,'asdasd','2024-10-23',NULL),(12,2,'asd','asdasdasd','asdasd','2024-02-10',0,'Hombre','asdasd',1,'asdasd','2024-10-12',NULL);
/*!40000 ALTER TABLE `doctor_administrador` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `especialidad`
--

DROP TABLE IF EXISTS `especialidad`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `especialidad` (
  `id_especialidad` int NOT NULL AUTO_INCREMENT,
  `nombre_especialidad` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_especialidad`)
) ENGINE=InnoDB AUTO_INCREMENT=59 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `especialidad`
--

LOCK TABLES `especialidad` WRITE;
/*!40000 ALTER TABLE `especialidad` DISABLE KEYS */;
INSERT INTO `especialidad` VALUES (2,'modificado'),(3,'Cirugía Oral'),(4,'odontologia'),(6,'odontologia'),(7,'odontologia'),(8,'odontologia'),(9,'odontologia'),(10,'odontologia'),(11,'Cirujano Maxilar'),(12,'Cirujia Maxilar'),(37,''),(38,'zxc'),(39,'sda'),(40,''),(41,''),(42,''),(43,'sda'),(44,''),(45,'asd'),(46,'asdss'),(47,'asdss'),(48,'asd'),(49,'asd'),(50,'asd'),(51,'asd'),(52,'asd'),(53,'asd'),(54,'asd'),(55,'asd'),(56,'asd'),(57,'gil'),(58,'MepicaElhuevo');
/*!40000 ALTER TABLE `especialidad` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `facturacion`
--

DROP TABLE IF EXISTS `facturacion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `facturacion` (
  `id_facturacion` int NOT NULL AUTO_INCREMENT,
  `id_cita` int NOT NULL,
  `total_factura` decimal(10,2) NOT NULL,
  `fecha` date NOT NULL,
  `tipo` varchar(45) NOT NULL,
  `importe` decimal(10,2) NOT NULL,
  `pagos_restantes` int DEFAULT NULL,
  `proximo_pago` date DEFAULT NULL,
  `cantidad` int NOT NULL,
  `tipo_de_pago` varchar(45) NOT NULL,
  PRIMARY KEY (`id_facturacion`),
  KEY `fk_facturacion_consulta_cita1_idx` (`id_cita`),
  CONSTRAINT `fk_facturacion_consulta_cita1` FOREIGN KEY (`id_cita`) REFERENCES `consulta_cita` (`id_cita`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `facturacion`
--

LOCK TABLES `facturacion` WRITE;
/*!40000 ALTER TABLE `facturacion` DISABLE KEYS */;
INSERT INTO `facturacion` VALUES (2,2,100.00,'2023-11-13','modificado',200.00,1,'2023-11-13',100,'modificado'),(3,3,300.00,'2023-10-28','Fraccionado',300.00,NULL,NULL,1,'Transferencia bancaria'),(4,1,150.00,'2023-10-26','Unico',150.00,NULL,NULL,1,'Efectivo'),(16,1,100.00,'2023-11-13','nuevo',200.00,1,'2023-11-13',100,'nuevo'),(17,1,100.00,'2023-11-13','nuevo',200.00,1,'2023-11-13',100,'nuevo'),(18,1,100.00,'2023-11-13','nuevo',200.00,1,'2023-11-13',100,'nuevo'),(19,1,100.00,'2023-11-13','nuevo',200.00,1,'2023-11-13',100,'nuevo'),(20,1,100.00,'2023-11-13','nuevo',200.00,1,'2023-11-13',100,'nuevo'),(21,1,100.00,'2023-11-13','nuevo',200.00,1,'2023-11-13',100,'nuevo'),(22,1,100.00,'2023-11-13','nuevo',200.00,1,'2023-11-13',100,'nuevo'),(23,1,100.00,'2023-11-13','nuevo',200.00,1,'2023-11-13',100,'nuevo'),(24,2,100.00,'2023-11-13','nuevo',200.00,1,'2023-11-13',100,'nuevo');
/*!40000 ALTER TABLE `facturacion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `historial`
--

DROP TABLE IF EXISTS `historial`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `historial` (
  `id_historial` int NOT NULL AUTO_INCREMENT,
  `id_paciente` int NOT NULL,
  `id_tratamiento` int NOT NULL,
  `id_odontograma` int NOT NULL,
  PRIMARY KEY (`id_historial`,`id_paciente`),
  KEY `fk_historial_odontograma1_idx` (`id_odontograma`),
  KEY `fk_historial_tratamiento1_idx` (`id_tratamiento`),
  KEY `fk_historial_paciente1_idx` (`id_paciente`),
  CONSTRAINT `fk_historial_odontograma` FOREIGN KEY (`id_odontograma`) REFERENCES `odontograma` (`id_odontograma`),
  CONSTRAINT `fk_historial_paciente` FOREIGN KEY (`id_paciente`) REFERENCES `paciente` (`id_paciente`),
  CONSTRAINT `fk_historial_tratamiento` FOREIGN KEY (`id_tratamiento`) REFERENCES `tratamiento` (`id_tratamiento`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `historial`
--

LOCK TABLES `historial` WRITE;
/*!40000 ALTER TABLE `historial` DISABLE KEYS */;
INSERT INTO `historial` VALUES (2,2,2,2),(3,3,3,3),(10,3,2,3),(11,2,3,2),(12,3,2,3),(13,2,3,2),(15,2,2,2),(16,2,2,2);
/*!40000 ALTER TABLE `historial` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `odontograma`
--

DROP TABLE IF EXISTS `odontograma`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `odontograma` (
  `id_odontograma` int NOT NULL AUTO_INCREMENT,
  `diente1` varchar(250) DEFAULT NULL,
  `diente2` varchar(250) DEFAULT NULL,
  `diente3` varchar(250) DEFAULT NULL,
  `diente4` varchar(250) DEFAULT NULL,
  `diente5` varchar(250) DEFAULT NULL,
  `diente6` varchar(250) DEFAULT NULL,
  `diente7` varchar(250) DEFAULT NULL,
  `diente8` varchar(250) DEFAULT NULL,
  `diente9` varchar(250) DEFAULT NULL,
  `diente10` varchar(250) DEFAULT NULL,
  PRIMARY KEY (`id_odontograma`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `odontograma`
--

LOCK TABLES `odontograma` WRITE;
/*!40000 ALTER TABLE `odontograma` DISABLE KEYS */;
INSERT INTO `odontograma` VALUES (2,'modificado','modificado','modificado','modificado','modificado','modificado','modificado','modificado','modificado','modificado'),(3,'Molar superior central en buen estado','Premolar superior central en buen estado','Incisivo central superior en buen estado','Canino superior central en buen estado','Molar inferior central en buen estado','Premolar inferior central en buen estado','Incisivo central inferior en buen estado','Canino inferior central en buen estado','Molar inferior izquierdo en buen estado','Premolar inferior izquierdo en buen estado'),(7,'nuevo','nuevo','nuevo','nuevo','nuevo','nuevo','nuevo','nuevo','nuevo','nuevo'),(8,'nuevo','nuevo','nuevo','nuevo','nuevo','nuevo','nuevo','nuevo','nuevo','nuevo'),(9,'nuevo','nuevo','nuevo','nuevo','nuevo','nuevo','nuevo','nuevo','nuevo','nuevo'),(10,'nuevo','nuevo','nuevo','nuevo','nuevo','nuevo','nuevo','nuevo','nuevo','nuevo'),(11,'nuevo','nuevo','nuevo','nuevo','nuevo','nuevo','nuevo','nuevo','nuevo','nuevo'),(12,'nuevo','nuevo','nuevo','nuevo','nuevo','nuevo','nuevo','nuevo','nuevo','nuevo');
/*!40000 ALTER TABLE `odontograma` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `paciente`
--

DROP TABLE IF EXISTS `paciente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `paciente` (
  `id_paciente` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  `apellidos` varchar(45) NOT NULL,
  `direccion` varchar(45) NOT NULL,
  `genero` varchar(45) NOT NULL,
  `telefono` varchar(45) NOT NULL,
  `fecha_alta` varchar(45) DEFAULT NULL,
  `fecha_nacimiento` varchar(45) NOT NULL,
  PRIMARY KEY (`id_paciente`)
) ENGINE=InnoDB AUTO_INCREMENT=32 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `paciente`
--

LOCK TABLES `paciente` WRITE;
/*!40000 ALTER TABLE `paciente` DISABLE KEYS */;
INSERT INTO `paciente` VALUES (1,'carlos','jerez','Calle Las palmeras','Masculino','6789546782','2023-11-13','2023-11-13'),(2,'Susana','Rios','Viviendas blancas p1','Femenino','675435020','2023-10-26','1990-10-01'),(3,'carlos','López','Calle Secundaria 789','Masculino','543678319','2023-10-26','1975-08-22'),(4,'Juan','Perez','Avenida Flores Rojas,3','Hombre','695475695','2023-11-20','27-10-1990'),(5,'albertoski','Saenz','Avenida estanques nº3','Hombre','605664532','2024-01-23','2024-01-30'),(27,'','','','','','2024-02-09',''),(28,'','','','','','2024-02-09',''),(29,'','','','','','2024-02-09',''),(30,'Marcos','García','Avenida Marques De Cáceres','Hombre','987345239','2024-02-12','2024-02-28'),(31,'Guillermo','Garcia','Pueblo de al lao','Hombre','938475634','2024-02-12','2024-02-29');
/*!40000 ALTER TABLE `paciente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `proveedor`
--

DROP TABLE IF EXISTS `proveedor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `proveedor` (
  `id_proveedor` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(100) NOT NULL,
  `direccion` varchar(100) NOT NULL,
  `telefono` varchar(15) NOT NULL,
  `correo` varchar(45) NOT NULL,
  PRIMARY KEY (`id_proveedor`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `proveedor`
--

LOCK TABLES `proveedor` WRITE;
/*!40000 ALTER TABLE `proveedor` DISABLE KEYS */;
INSERT INTO `proveedor` VALUES (1,'Suministros Dentales S.L.','Calle Mayor, 123, Madrid','+34 91 123 4567','example@gmail.com'),(2,'modificado','modificado','modificado','example@gmail.com'),(3,'Distribuciones Sanitarias S.L.','Calle Real, 67, Sevilla','+34 95 222 3333','example@gmail.com');
/*!40000 ALTER TABLE `proveedor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `solicitud`
--

DROP TABLE IF EXISTS `solicitud`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `solicitud` (
  `id_solicitud` int NOT NULL AUTO_INCREMENT,
  `id_cita` int DEFAULT NULL,
  `id_material` int DEFAULT NULL,
  `cantidad` int NOT NULL,
  `id_proveedor` int DEFAULT NULL,
  PRIMARY KEY (`id_solicitud`),
  KEY `fk_solicitud_consulta_cita1_idx` (`id_cita`),
  KEY `fk_solicitud_stock_material1_idx` (`id_material`),
  CONSTRAINT `fk_solicitud_consulta_cita1` FOREIGN KEY (`id_cita`) REFERENCES `consulta_cita` (`id_cita`),
  CONSTRAINT `fk_solicitud_stock_material1` FOREIGN KEY (`id_material`) REFERENCES `stock_material` (`id_material`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `solicitud`
--

LOCK TABLES `solicitud` WRITE;
/*!40000 ALTER TABLE `solicitud` DISABLE KEYS */;
INSERT INTO `solicitud` VALUES (1,2,1,3,1);
/*!40000 ALTER TABLE `solicitud` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `stock_material`
--

DROP TABLE IF EXISTS `stock_material`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `stock_material` (
  `id_material` int NOT NULL AUTO_INCREMENT,
  `id_proveedor` int DEFAULT NULL,
  `nombre` varchar(100) NOT NULL,
  `disponible` int NOT NULL,
  `solicitado` int NOT NULL,
  `bajo_pedido` int NOT NULL,
  `precio` decimal(10,2) NOT NULL,
  PRIMARY KEY (`id_material`),
  KEY `fk_stock_proveedor` (`id_proveedor`),
  CONSTRAINT `fk_stock_proveedor` FOREIGN KEY (`id_proveedor`) REFERENCES `proveedor` (`id_proveedor`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `stock_material`
--

LOCK TABLES `stock_material` WRITE;
/*!40000 ALTER TABLE `stock_material` DISABLE KEYS */;
INSERT INTO `stock_material` VALUES (1,1,'Resina dental A1',78,5,2,55.60),(2,2,'Bisturi clinico',6,1,1,22.10),(3,3,'Anestesia local',63,3,1,21.50),(4,1,'Cepillo Manual',11,1,1,30.10),(6,1,'Guantes de Latex',4,1,1,20.40);
/*!40000 ALTER TABLE `stock_material` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tratamiento`
--

DROP TABLE IF EXISTS `tratamiento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tratamiento` (
  `id_tratamiento` int NOT NULL AUTO_INCREMENT,
  `id_especialidad` int DEFAULT NULL,
  `nombre` varchar(45) NOT NULL,
  `precio` varchar(12) NOT NULL,
  PRIMARY KEY (`id_tratamiento`),
  KEY `fk_tratamiento_especialidad1_idx` (`id_especialidad`),
  CONSTRAINT `fk_tratamiento_especialidad1` FOREIGN KEY (`id_especialidad`) REFERENCES `especialidad` (`id_especialidad`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tratamiento`
--

LOCK TABLES `tratamiento` WRITE;
/*!40000 ALTER TABLE `tratamiento` DISABLE KEYS */;
INSERT INTO `tratamiento` VALUES (1,2,'Limpieza Dental','100.00'),(2,2,'modificado','100.00'),(3,3,'Extracción de Muelas','150.00'),(7,2,'nuevo','100.00'),(9,2,'nuevo','100.00'),(10,3,'nuevo','100.00'),(12,2,'nuevo','100.00'),(13,58,'Extracción molar','69.99'),(14,12,'Esmaltado','125.0');
/*!40000 ALTER TABLE `tratamiento` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-02-12  6:49:14
