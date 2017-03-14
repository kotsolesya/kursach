-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Хост: 127.0.0.1
-- Время создания: Мар 04 2017 г., 09:58
-- Версия сервера: 5.7.14
-- Версия PHP: 5.6.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- База данных: `autobazar`
--

-- --------------------------------------------------------

--
-- Структура таблицы `auto`
--

CREATE TABLE `auto` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `marka` char(20) NOT NULL,
  `model` char(20) NOT NULL,
  `color` char(20) NOT NULL,
  `year` Data NOT NULL,
  `price` double NOT NULL,
  `name_type` char(20) NOT NULL,
  `city` char(20) NOT NULL,
  `username` char(20) NOT NULL,
  PRIMARY KEY(`id`);
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Структура таблицы `city`
--

CREATE TABLE `city` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `city` char(20) NOT NULL,
  `region` char(20) NOT NULL,
  PRIMARY KEY(`id`);
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Структура таблицы `order`
--

CREATE TABLE `order` (
  `id_user` int(11) NOT NULL,
  `name_order` char(20) NOT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_auto` int(11) NOT NULL,
  `city` int(11) NOT NULL,
  PRIMARY KEY(`id`);
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Структура таблицы `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` char(20) NOT NULL,
  `mobile_number` int(11) NOT NULL,
  PRIMARY KEY(`id`);
) ENGINE=MyISAM DEFAULT CHARSET=latin1;


/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
