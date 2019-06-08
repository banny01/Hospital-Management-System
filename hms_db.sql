-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Sep 10, 2018 at 06:41 AM
-- Server version: 5.7.14
-- PHP Version: 5.6.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hms_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `admitpatient_room`
--

CREATE TABLE `admitpatient_room` (
  `AdmitID` int(5) NOT NULL,
  `PatientID` int(5) NOT NULL,
  `Disease` varchar(100) NOT NULL,
  `AdmitDate` varchar(15) NOT NULL,
  `RoomNo` int(5) NOT NULL,
  `DoctorID` int(5) NOT NULL,
  `AP_Remarks` varchar(300) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `admitpatient_ward`
--

CREATE TABLE `admitpatient_ward` (
  `AdmitID` int(5) NOT NULL,
  `PatientID` int(5) NOT NULL,
  `Disease` varchar(100) NOT NULL,
  `AdmitDate` varchar(15) NOT NULL,
  `WardType` varchar(30) NOT NULL,
  `DoctorID` int(5) NOT NULL,
  `AP_Remarks` varchar(300) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admitpatient_ward`
--

INSERT INTO `admitpatient_ward` (`AdmitID`, `PatientID`, `Disease`, `AdmitDate`, `WardType`, `DoctorID`, `AP_Remarks`) VALUES
(1, 1, 'Fever', '13/08/2018', 'Room (AC)', 1, '');

-- --------------------------------------------------------

--
-- Table structure for table `bill_room`
--

CREATE TABLE `bill_room` (
  `DischargeID` int(5) NOT NULL,
  `BillingDate` date NOT NULL,
  `RoomCharges` double NOT NULL,
  `ServiceCharges` double NOT NULL,
  `PaymentMode` varchar(20) NOT NULL,
  `PaymentModeDetails` varchar(100) NOT NULL,
  `ChargesPaid` double NOT NULL,
  `DueCharges` double NOT NULL,
  `TotalCharges` double NOT NULL,
  `NoOfDays` int(11) NOT NULL,
  `TotalRoomCharges` double NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `bill_ward`
--

CREATE TABLE `bill_ward` (
  `DischargeID` int(5) NOT NULL,
  `BillingDate` date NOT NULL,
  `BedCharges` double NOT NULL,
  `ServiceCharges` double NOT NULL,
  `PaymentMode` varchar(20) NOT NULL,
  `PaymentModeDetails` varchar(100) NOT NULL,
  `ChargesPaid` double NOT NULL,
  `DueCharges` double NOT NULL,
  `TotalCharges` double NOT NULL,
  `NoOfDays` int(11) NOT NULL,
  `TotalBedCharges` double NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `dischargepatient_room`
--

CREATE TABLE `dischargepatient_room` (
  `ID` int(11) NOT NULL,
  `AdmitID` int(5) NOT NULL,
  `DischargeDate` varchar(15) NOT NULL,
  `DP_Remarks` varchar(300) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `dischargepatient_ward`
--

CREATE TABLE `dischargepatient_ward` (
  `ID` int(11) NOT NULL,
  `AdmitID` int(5) NOT NULL,
  `DischargeDate` varchar(15) NOT NULL,
  `DP_Remarks` varchar(300) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `doctor`
--

CREATE TABLE `doctor` (
  `DoctorID` int(5) NOT NULL,
  `Doctorname` varchar(50) NOT NULL,
  `FatherName` varchar(50) NOT NULL,
  `Email` varchar(30) NOT NULL,
  `ContactNo` int(10) NOT NULL,
  `Qualifications` varchar(300) NOT NULL,
  `Specialization` varchar(300) NOT NULL,
  `Gender` varchar(6) NOT NULL,
  `BloodGroup` varchar(3) NOT NULL,
  `DateOfJoining` varchar(15) NOT NULL,
  `Address` varchar(200) NOT NULL,
  `username` varchar(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `doctor`
--

INSERT INTO `doctor` (`DoctorID`, `Doctorname`, `FatherName`, `Email`, `ContactNo`, `Qualifications`, `Specialization`, `Gender`, `BloodGroup`, `DateOfJoining`, `Address`, `username`) VALUES
(1, 'Y G S A Kumara', 'Kumara shalitha', 'a@w.d', 710347777, 'sssssss', 'aaaaaa', 'M', 'O+', '2008-01-16', 'Pemaduwa, Wilachchiya', '');

-- --------------------------------------------------------

--
-- Table structure for table `medicines`
--

CREATE TABLE `medicines` (
  `MedicineID` int(5) NOT NULL,
  `MedicineName` varchar(30) NOT NULL,
  `MedicinePrice` float NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `medicines`
--

INSERT INTO `medicines` (`MedicineID`, `MedicineName`, `MedicinePrice`) VALUES
(1, 'Parasitamol', 1.5),
(2, 'Citrazin', 1),
(3, 'Vitamin C', 1),
(4, 'Amoxiline', 2),
(5, 'Piriton', 1.75);

-- --------------------------------------------------------

--
-- Table structure for table `operationreg`
--

CREATE TABLE `operationreg` (
  `OperationID` int(5) NOT NULL,
  `OperationName` varchar(30) NOT NULL,
  `OperationCharge` float NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `operationreg`
--

INSERT INTO `operationreg` (`OperationID`, `OperationName`, `OperationCharge`) VALUES
(1, 'Normal Serjarry', 300);

-- --------------------------------------------------------

--
-- Table structure for table `operations`
--

CREATE TABLE `operations` (
  `POID` int(5) NOT NULL,
  `OperationID` int(5) NOT NULL,
  `OperationName` varchar(30) NOT NULL,
  `OperationDate` varchar(20) NOT NULL,
  `PatientID` int(5) NOT NULL,
  `Charge` float NOT NULL,
  `Status` varchar(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `operations`
--

INSERT INTO `operations` (`POID`, `OperationID`, `OperationName`, `OperationDate`, `PatientID`, `Charge`, `Status`) VALUES
(1, 1, 'Normal Serjarry', '16/08/2018', 1, 300, 'Not Issued');

-- --------------------------------------------------------

--
-- Table structure for table `patientregistration`
--

CREATE TABLE `patientregistration` (
  `PatientID` int(5) NOT NULL,
  `Patientname` varchar(30) NOT NULL,
  `FatherName` varchar(30) DEFAULT NULL,
  `Email` varchar(20) DEFAULT NULL,
  `ContactNo` int(10) NOT NULL,
  `Age` int(3) NOT NULL,
  `Date` varchar(15) NOT NULL,
  `Remarks` varchar(100) NOT NULL,
  `Gen` varchar(100) NOT NULL,
  `BG` varchar(3) NOT NULL,
  `Address` varchar(200) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `patientregistration`
--

INSERT INTO `patientregistration` (`PatientID`, `Patientname`, `FatherName`, `Email`, `ContactNo`, `Age`, `Date`, `Remarks`, `Gen`, `BG`, `Address`) VALUES
(1, 'R M G Rajapakshe', 'Rajapakshe', 'k@w.aa', 714444444, 23, '13/08/2018', 'Psycho', 'M', 'O+', 'Nilwakka, Kegalle'),
(2, 'Sathindri Goonathilake', 'K H M J C Goonathilake', 'gdhsgd@f.c', 710000000, 23, '15/08/2018', 'Mongal', 'F', 'O+', 'ghfgdflkjghdkjg');

-- --------------------------------------------------------

--
-- Table structure for table `registration`
--

CREATE TABLE `registration` (
  `username` varchar(15) NOT NULL,
  `password` varchar(16) NOT NULL,
  `nameofuser` varchar(50) NOT NULL,
  `Email` varchar(30) NOT NULL,
  `ContactNo` int(10) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `registration`
--

INSERT INTO `registration` (`username`, `password`, `nameofuser`, `Email`, `ContactNo`) VALUES
('krishan.chamara', '12345678', 'N D Krishan Chamara', 'n.d.krishankola@gmail.com', 710347725);

-- --------------------------------------------------------

--
-- Table structure for table `room`
--

CREATE TABLE `room` (
  `WardNo` int(5) NOT NULL,
  `No` int(3) NOT NULL,
  `WardType` varchar(50) NOT NULL,
  `NoofBeds` int(3) NOT NULL,
  `WardCharges` double NOT NULL,
  `WardStatus` varchar(300) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `room`
--

INSERT INTO `room` (`WardNo`, `No`, `WardType`, `NoofBeds`, `WardCharges`, `WardStatus`) VALUES
(1, 1, 'General', 5, 2000, 'Vacant'),
(2, 1, 'Room (AC)', 1, 5000, 'Vacant'),
(3, 2, 'General', 10, 2000, 'Vacant'),
(4, 1, 'Deluxe', 2, 2500, 'Vacant'),
(5, 1, 'Room (Non-AC)', 2, 2500, 'Vacant'),
(6, 2, 'Room (AC)', 1, 5000, 'Vacant');

-- --------------------------------------------------------

--
-- Table structure for table `servicereg`
--

CREATE TABLE `servicereg` (
  `ServiceID` int(5) NOT NULL,
  `ServiceName` varchar(20) NOT NULL,
  `ServiceCharge` double NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `servicereg`
--

INSERT INTO `servicereg` (`ServiceID`, `ServiceName`, `ServiceCharge`) VALUES
(1, 'Paracitamol', 1.25),
(2, 'X-Ray', 200);

-- --------------------------------------------------------

--
-- Table structure for table `services`
--

CREATE TABLE `services` (
  `PSID` int(5) NOT NULL,
  `ServiceID` int(5) NOT NULL,
  `ServiceName` varchar(20) NOT NULL,
  `ServiceDate` varchar(15) NOT NULL,
  `PatientID` int(5) NOT NULL,
  `QTY` int(3) NOT NULL,
  `Charge` int(10) NOT NULL,
  `Status` varchar(20) NOT NULL,
  `Work` varchar(10) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `services`
--

INSERT INTO `services` (`PSID`, `ServiceID`, `ServiceName`, `ServiceDate`, `PatientID`, `QTY`, `Charge`, `Status`, `Work`) VALUES
(6, 2, 'X-Ray', '16/08/2018', 2, 3, 600, 'Not Paid', 'Not Issued'),
(7, 2, 'X-Ray', '16/08/2018', 1, 2, 400, 'Not Paid', 'Not Issued');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `username` varchar(15) NOT NULL,
  `user_password` varchar(20) NOT NULL,
  `Status` varchar(15) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`username`, `user_password`, `Status`) VALUES
('krishan.chamara', '12345678', 'User'),
('sanath', '111111', 'Doctor'),
('krishan', '123456', 'Doctor');

-- --------------------------------------------------------

--
-- Table structure for table `wardboy_nurse_tbl`
--

CREATE TABLE `wardboy_nurse_tbl` (
  `ID` int(5) NOT NULL,
  `W_N_name` varchar(50) NOT NULL,
  `Category` varchar(20) NOT NULL,
  `Email` varchar(20) NOT NULL,
  `ContactNo` int(10) NOT NULL,
  `Qualifications` varchar(300) NOT NULL,
  `BloodGroup` varchar(3) NOT NULL,
  `DateOfJoining` varchar(15) NOT NULL,
  `Address` varchar(200) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `wardboy_nurse_tbl`
--

INSERT INTO `wardboy_nurse_tbl` (`ID`, `W_N_name`, `Category`, `Email`, `ContactNo`, `Qualifications`, `BloodGroup`, `DateOfJoining`, `Address`) VALUES
(1, 'Kanchana Senarathne', 'Nurse', 'kan.se@test.com', 710000000, 'Certificate', 'O+', '10/07/2018', 'Kuliyapitiya, Sri Lanka');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admitpatient_room`
--
ALTER TABLE `admitpatient_room`
  ADD PRIMARY KEY (`AdmitID`),
  ADD KEY `DoctorID` (`DoctorID`),
  ADD KEY `RoomNo` (`RoomNo`),
  ADD KEY `PatientID` (`PatientID`);

--
-- Indexes for table `admitpatient_ward`
--
ALTER TABLE `admitpatient_ward`
  ADD PRIMARY KEY (`AdmitID`);

--
-- Indexes for table `dischargepatient_room`
--
ALTER TABLE `dischargepatient_room`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `dischargepatient_ward`
--
ALTER TABLE `dischargepatient_ward`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `doctor`
--
ALTER TABLE `doctor`
  ADD PRIMARY KEY (`DoctorID`);

--
-- Indexes for table `medicines`
--
ALTER TABLE `medicines`
  ADD PRIMARY KEY (`MedicineID`);

--
-- Indexes for table `operationreg`
--
ALTER TABLE `operationreg`
  ADD PRIMARY KEY (`OperationID`);

--
-- Indexes for table `operations`
--
ALTER TABLE `operations`
  ADD PRIMARY KEY (`POID`);

--
-- Indexes for table `patientregistration`
--
ALTER TABLE `patientregistration`
  ADD PRIMARY KEY (`PatientID`);

--
-- Indexes for table `registration`
--
ALTER TABLE `registration`
  ADD PRIMARY KEY (`username`,`password`,`Email`);

--
-- Indexes for table `room`
--
ALTER TABLE `room`
  ADD PRIMARY KEY (`WardNo`);

--
-- Indexes for table `servicereg`
--
ALTER TABLE `servicereg`
  ADD PRIMARY KEY (`ServiceID`);

--
-- Indexes for table `services`
--
ALTER TABLE `services`
  ADD PRIMARY KEY (`PSID`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`username`);

--
-- Indexes for table `wardboy_nurse_tbl`
--
ALTER TABLE `wardboy_nurse_tbl`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admitpatient_room`
--
ALTER TABLE `admitpatient_room`
  MODIFY `AdmitID` int(5) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `admitpatient_ward`
--
ALTER TABLE `admitpatient_ward`
  MODIFY `AdmitID` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `dischargepatient_room`
--
ALTER TABLE `dischargepatient_room`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `dischargepatient_ward`
--
ALTER TABLE `dischargepatient_ward`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `medicines`
--
ALTER TABLE `medicines`
  MODIFY `MedicineID` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT for table `operations`
--
ALTER TABLE `operations`
  MODIFY `POID` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `services`
--
ALTER TABLE `services`
  MODIFY `PSID` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
