package hilmibaskoparan.sql;

public class My_SqlCommands {

    /*

    -- Create Database
    CREATE SCHEMA `blog` DEFAULT CHARACTER SET utf8 ;

    -- Eğer birden falza DB varsa sadece ilgili DB kullansın
    use blog;

    -- Delete Database
    DROP DATABASE `blog`;

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
    update blog.register set name="H", surname="Bas",email=h@gmail.com, password=123 where id=1;

    -- DELETE
    delete from blog.register where id=1;
    */

}
