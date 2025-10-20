CREATE DATABASE IF NOT EXISTS housekeeping_db;
USE housekeeping_db;

CREATE TABLE IF NOT EXISTS student (
                                       id BIGINT PRIMARY KEY AUTO_INCREMENT,
                                       name VARCHAR(100) NOT NULL,
    room_no VARCHAR(10) NOT NULL,
    phone_no BIGINT,
    check_in_date DATE,
    cleanliness_score TINYINT UNSIGNED DEFAULT 0,  -- ⭐ New column (1–5)
    remarks VARCHAR(255)
    );
