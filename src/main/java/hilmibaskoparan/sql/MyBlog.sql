-- Create Database
CREATE SCHEMA `blog` DEFAULT CHARACTER SET utf8 ;

-- Delete Database
DROP DATABASE `blog`;

-- Eğer birden falza DB varsa sadece ilgili DB kullansın
use blog;

-- Create Table
CREATE TABLE `blog`.`register` (
    `id` INT NOT NULL AUTO_INCREMENT,
    `name` VARCHAR(255) NULL DEFAULT 'Adınızı girmediniz',
    `username` VARCHAR(255) NULL DEFAULT 'Soyadınızı girmediniz',
    `password` VARCHAR(255) NULL DEFAULT 'Şifre girmediniz',
    `created_date` TIMESTAMP NULL DEFAULT Current_TIMESTAMP,
    PRIMARY KEY (`id`))
ENGINE = InnoDB;