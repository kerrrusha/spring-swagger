CREATE DATABASE IF NOT EXISTS spring_swagger;
USE spring_swagger;

CREATE TABLE IF NOT EXISTS product (
    id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255),
    price BIGINT
);
