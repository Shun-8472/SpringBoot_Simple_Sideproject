CREATE TABLE user (
    uid INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(30) NOT NULL,
    password VARCHAR(40) NOT NULL,
    role VARCHAR(10) NOT NULL,
    insert_time TIMESTAMP,
    update_time TIMESTAMP
);

CREATE TABLE product (
    pid INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(30) NOT NULL,
    price INT NOT NULL,
    img VARCHAR(10) NOT NULL,
    description VARCHAR(10) NOT NULL,
    state VARCHAR(10) NOT NULL,
    insert_time TIMESTAMP,
    update_time TIMESTAMP
);