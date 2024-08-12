CREATE DATABASE IF NOT EXISTS hr_manager

USE hr_manager;

CREATE TABLE IF NOT EXISTS emploee (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    surname VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE,
    birth_date DATE NOT NULL,
);

CREATE TABLE IF NOT EXISTS role (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    description TEXT
);

Create TABLE IF NOT EXISTS DEPARTMENT (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    description TEXT
);

CREATE TABLE IF NOT EXISTS emploee_role (
    emploee_id INT,
    role_id INT,
    PRIMARY KEY (emploee_id, role_id),
    FOREIGN KEY (emploee_id) REFERENCES emploee(id),
    FOREIGN KEY (role_id) REFERENCES role(id)
);

CREATE TABLE IF NOT EXISTS emploee_department (
    emploee_id INT,
    department_id INT,
    PRIMARY KEY (emploee_id, department_id),
    FOREIGN KEY (emploee_id) REFERENCES emploee(id),
    FOREIGN KEY (department_id) REFERENCES department(id)
);

CREATE TABLE IF NOT EXISTS training_path(
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    description TEXT
);

create table if not exists epic(
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    description TEXT
);

create table if not exists epic_training_path(
    epic_id INT,
    training_path_id INT,
    PRIMARY KEY (epic_id, training_path_id),
    FOREIGN KEY (epic_id) REFERENCES epic(id),
    FOREIGN KEY (training_path_id) REFERENCES training_path(id)
);

create table if not exists eploee_training_path(
    emploee_id INT,
    training_path_id INT,
    PRIMARY KEY (emploee_id, training_path_id),
    FOREIGN KEY (emploee_id) REFERENCES emploee(id),
    FOREIGN KEY (training_path_id) REFERENCES training_path(id)
);