CREATE database IF NOT EXISTS game;

use game;

drop table if exists game;

CREATE TABLE job_class (
    id INT(3) NOT NULL AUTO_INCREMENT,
    name VARCHAR(15) NOT NULL,
    difficulty VARCHAR(10) NOT NULL,
    PRIMARY KEY (id)
);