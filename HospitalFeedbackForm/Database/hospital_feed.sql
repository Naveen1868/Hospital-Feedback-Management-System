--
CREATE DATABASE hospital_feed;
USE hospital_feed;
CREATE TABLE IF NOT EXISTS feed (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    age INT NOT NULL,
    visit_date DATE NOT NULL,
    city VARCHAR(100) NOT NULL,
    department VARCHAR(255) NOT NULL,
    staff_behaviour VARCHAR(50) NOT NULL,
    cleanliness VARCHAR(50) NOT NULL,
    overall_rating VARCHAR(50) NOT NULL,
    additional_comments TEXT,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
