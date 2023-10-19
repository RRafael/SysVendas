/*
SQLyog Enterprise - MySQL GUI v8.05 
MySQL - 5.1.31-community : Database - loja
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

CREATE DATABASE /*!32312 IF NOT EXISTS*/`loja` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `loja`;

/*Table structure for table `tab_itens_venda` */

DROP TABLE IF EXISTS `tab_itens_venda`;

CREATE TABLE `tab_itens_venda` (
  `id` int(12) NOT NULL AUTO_INCREMENT,
  `id_produto_estoque` int(12) NOT NULL,
  `id_vendas` int(12) NOT NULL,
  `quantidade` int(12) NOT NULL,
  `valor_unitario` float(10,2) NOT NULL,
  `valor_total` float(10,2) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `id_vendas` (`id_vendas`),
  KEY `id_produto_estoque` (`id_produto_estoque`),
  CONSTRAINT `tab_itens_venda_ibfk_1` FOREIGN KEY (`id_vendas`) REFERENCES `tab_vendas` (`id`),
  CONSTRAINT `tab_itens_venda_ibfk_2` FOREIGN KEY (`id_produto_estoque`) REFERENCES `tab_produto_estoque` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=106 DEFAULT CHARSET=latin1;

/*Data for the table `tab_itens_venda` */

insert  into `tab_itens_venda`(`id`,`id_produto_estoque`,`id_vendas`,`quantidade`,`valor_unitario`,`valor_total`) values (78,45517,81,1,3.60,104.00),(79,45517,82,3,3.60,428.00),(80,45518,83,5,2.80,795.00),(81,45519,84,1,4.11,450.00),(82,45520,85,1,4.50,712.00),(83,45517,86,1,3.60,848.00),(84,45517,87,1,3.60,147.00),(85,45517,88,1,3.60,182.00),(86,45517,89,1,3.60,809.00),(87,45517,90,1,3.60,645.00),(88,45517,91,1,3.60,661.00),(89,45517,92,1,3.60,632.00),(90,45517,93,1,3.60,406.00),(91,45518,93,1,2.80,406.00),(92,45519,93,1,4.11,406.00),(93,45520,93,1,4.50,406.00),(94,45521,93,1,2.30,406.00),(95,45517,94,1,3.60,458.00),(98,45520,97,1,4.50,606.00),(99,45520,98,1,4.50,287.00),(100,45519,99,1,4.11,107.00),(101,45519,100,1,4.11,688.00),(102,45517,101,1,3.60,542.00),(103,45517,102,1,3.60,811.00),(104,45520,103,3,4.50,43.00),(105,45517,104,1,3.60,575.00);

/*Table structure for table `tab_produto_estoque` */

DROP TABLE IF EXISTS `tab_produto_estoque`;

CREATE TABLE `tab_produto_estoque` (
  `id` int(12) NOT NULL AUTO_INCREMENT,
  `codigo` int(20) NOT NULL,
  `nome` varchar(200) NOT NULL,
  `quantidade` int(6) NOT NULL,
  `valor` double(10,2) NOT NULL,
  `data_cadastro` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=45522 DEFAULT CHARSET=latin1;

/*Data for the table `tab_produto_estoque` */

insert  into `tab_produto_estoque`(`id`,`codigo`,`nome`,`quantidade`,`valor`,`data_cadastro`) values (45517,1,'sabao omo',-5,3.60,NULL),(45518,2,'arroz tio jorge',-1,2.80,NULL),(45519,3,'feijao do carvalho',1,4.11,NULL),(45520,4,'banana prata',0,4.50,NULL),(45521,5,'maca',-1,2.30,NULL);

/*Table structure for table `tab_vendas` */

DROP TABLE IF EXISTS `tab_vendas`;

CREATE TABLE `tab_vendas` (
  `id` int(12) NOT NULL AUTO_INCREMENT,
  `total` float(10,2) NOT NULL,
  `data_venda` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=105 DEFAULT CHARSET=latin1;

/*Data for the table `tab_vendas` */

insert  into `tab_vendas`(`id`,`total`,`data_venda`) values (81,104.00,'2014-09-20 12:19:38'),(82,428.00,'2014-09-20 12:42:26'),(83,795.00,'2014-09-20 12:42:33'),(84,450.00,'2014-09-20 12:42:56'),(85,712.00,'2014-09-20 12:43:10'),(86,848.00,'2014-09-20 12:49:44'),(87,147.00,'2014-09-20 12:49:56'),(88,182.00,'2014-09-20 12:49:58'),(89,809.00,'2014-09-20 12:49:58'),(90,645.00,'2014-09-20 12:49:58'),(91,661.00,'2014-09-20 12:49:58'),(92,632.00,'2014-09-20 12:50:00'),(93,406.00,'2014-09-20 13:10:42'),(94,458.00,'2014-09-20 13:11:01'),(95,713.00,'2014-09-20 13:11:20'),(96,443.00,'2014-09-20 13:11:24'),(97,606.00,'2014-09-20 13:11:46'),(98,287.00,'2014-09-20 13:11:58'),(99,107.00,'2014-09-20 13:12:09'),(100,688.00,'2014-09-20 13:17:46'),(101,542.00,'2014-09-20 13:17:49'),(102,811.00,'2014-09-20 13:28:06'),(103,43.00,'2014-09-20 13:28:23'),(104,575.00,'2014-09-20 13:28:34');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
