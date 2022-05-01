create database if not exists users;

use users;

drop table if exists Comment;
drop table if exists Post;
drop table if exists User;

CREATE TABLE user (
    id INT(11) NOT NULL AUTO_INCREMENT,
    user_name VARCHAR(20) NOT NULL UNIQUE,
    password VARCHAR(64) NOT NULL,
    email VARCHAR(80) NOT NULL,
    first_name VARCHAR(20) NOT NULL,
    last_name VARCHAR(20) NOT NULL,
    phone_number VARCHAR(13) NOT NULL,
    street VARCHAR(50),
    city VARCHAR(20),
    state VARCHAR(20),
    zip INT(9),
    country VARCHAR(56) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE post (
    id INT(11) NOT NULL AUTO_INCREMENT,
    user_id INT(11) NOT NULL,
    content TINYTEXT,
    post_date DATETIME DEFAULT CURRENT_TIMESTAMP,
    post_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    post_update TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    PRIMARY KEY (id),
    FOREIGN KEY (user_id)
        REFERENCES user (id)
);

CREATE TABLE comment (
    id INT(11) NOT NULL AUTO_INCREMENT,
    post_id INT(11) NOT NULL,
    user_id INT(11) NOT NULL,
    content TINYTEXT,
    comment_date DATETIME DEFAULT CURRENT_TIMESTAMP,
    comment_update TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    PRIMARY KEY (id),
    FOREIGN KEY (user_id)
        REFERENCES user (id),
    FOREIGN KEY (post_id)
        REFERENCES post (id)
);