-- Create Database
CREATE SCHEMA `blog` DEFAULT CHARACTER SET utf8 ;

-- Delete Database
DROP DATABASE `blog`;

-- Eğer birden falza DB varsa sadece ilgili DB kullansın
use blog;

-- Create Table
CREATE TABLE `blog`.`register` (
   `id` INT NOT NULL AUTO_INCREMENT,
   `name` VARCHAR(255) NULL DEFAULT 'Adını girmediniz',
   `surname` VARCHAR(255) NULL DEFAULT 'Soyadını girmediniz',
   `email` VARCHAR(255) NULL DEFAULT 'Email girmediniz',
   `password` VARCHAR(255) NULL DEFAULT 'Şifre girmediniz',
   `created_date` TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP,
   PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- INSERT
INSERT INTO blog.register (name, surname, email, password) VALUES ("Hilmi", "Başkoparan", "hb@gmail.com", "123456");

-- UPDATE
UPDATE blog.register SET name="H", surname="Bas",email=h@gmail.com, password=123 WHERE id=1;

-- DELETE
delete from blog.register WHERE id=1;

-- Select
SELECT * FROM blog.register;

-- Count
select count(*) from blog.register;

-- find
select * from blog.register where id =1;

-- find sadece name
select name from blog.register where id = 1;

-- #### LIKE ###########################################################################
-- like
-- name kolonunda p ile başlayan değerleri bul
select * from blog.register where name like 'H%';
-- name kolonunda p ile biten değerleri bul
select * from blog.register where name like '%t';
-- name kolonunda ikinci harfi a olan
select * from blog.register where name like '_a%';
-- name kolonunda hmt geçenolan
select * from blog.register where name like '[hmt]%';
-- name ve surname
select * from blog.register where name like 'H%' or surname like 'm%'