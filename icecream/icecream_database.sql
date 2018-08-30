-- phpMyAdmin SQL Dump
-- version 4.8.0.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Jun 17, 2018 at 09:32 PM
-- Server version: 10.1.32-MariaDB
-- PHP Version: 7.2.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `IceCreamStore`
--
CREATE DATABASE IF NOT EXISTS `IceCreamStore` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `IceCreamStore`;

-- --------------------------------------------------------

--
-- Table structure for table `detailTransaction`
--

DROP TABLE IF EXISTS `detailTransaction`;
CREATE TABLE `detailTransaction` (
  `TransactionID` varchar(5) NOT NULL,
  `ProductID` varchar(5) NOT NULL,
  `Qty` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `headerTransaction`
--

DROP TABLE IF EXISTS `headerTransaction`;
CREATE TABLE `headerTransaction` (
  `TransactionID` varchar(5) NOT NULL,
  `UserID` varchar(5) NOT NULL,
  `TransactionDate` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `product`
--

DROP TABLE IF EXISTS `product`;
CREATE TABLE `product` (
  `ProductID` varchar(5) NOT NULL,
  `ProductName` text NOT NULL,
  `ProductPrice` int(11) NOT NULL,
  `ProductStock` int(11) NOT NULL,
  `ProductImage` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `product`
--

INSERT INTO `product` (`ProductID`, `ProductName`, `ProductPrice`, `ProductStock`, `ProductImage`) VALUES
('PR001', 'ice cream strawberry', 1000, 10, 'strawberry.jpg'),
('PR002', 'ice cream chocolate', 2000, 10, 'chocolate.jpg'),
('PR003', 'ice cream vanilla', 3000, 10, 'vanilla.jpg');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `UserID` varchar(5) NOT NULL,
  `UserEmail` text NOT NULL,
  `UserPassword` text NOT NULL,
  `UserGender` text NOT NULL,
  `UserDOB` date NOT NULL,
  `UserPhone` text NOT NULL,
  `UserAddress` text NOT NULL,
  `Role` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`UserID`, `UserEmail`, `UserPassword`, `UserGender`, `UserDOB`, `UserPhone`, `UserAddress`, `Role`) VALUES
('CU001', 'admin@gmail.com', '123abc', 'Male', '1990-09-11', '12345678901', 'jkt', 'Customer'),
('CU002', 'test@gmail.com', '123abc', 'Male', '1990-10-11', '12345678901', 'jkt', 'Admin');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `detailTransaction`
--
ALTER TABLE `detailTransaction`
  ADD KEY `tr_fk` (`TransactionID`),
  ADD KEY `product_fk` (`ProductID`);

--
-- Indexes for table `headerTransaction`
--
ALTER TABLE `headerTransaction`
  ADD PRIMARY KEY (`TransactionID`),
  ADD KEY `userid_fk` (`UserID`);

--
-- Indexes for table `product`
--
ALTER TABLE `product`
  ADD PRIMARY KEY (`ProductID`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`UserID`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `detailTransaction`
--
ALTER TABLE `detailTransaction`
  ADD CONSTRAINT `product_fk` FOREIGN KEY (`ProductID`) REFERENCES `product` (`ProductID`),
  ADD CONSTRAINT `tr_fk` FOREIGN KEY (`TransactionID`) REFERENCES `headerTransaction` (`TransactionID`);

--
-- Constraints for table `headerTransaction`
--
ALTER TABLE `headerTransaction`
  ADD CONSTRAINT `userid_fk` FOREIGN KEY (`UserID`) REFERENCES `user` (`UserID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
