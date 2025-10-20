# Housekeeping Student CRUD (Spring Boot + MySQL)

## Requirements
- JDK 17
- MySQL (XAMPP OK)

## Setup
1) Create DB: CREATE DATABASE housekeeping_db;
2) Edit src/main/resources/application.properties (username/password)
3) Run: mvnw spring-boot:run  (Windows: mvnw.cmd spring-boot:run)
4) Open: http://localhost:8080/students

## Features
- Create, Update, Delete, Display, Search (name/room)
- Table types: varchar, number, date (phoneNo, checkInDate)
- Thymeleaf UI

## Endpoints
- GET /students, GET /students/new
- POST /students/save
- GET /students/{id}/edit
- POST /students/{id}/delete
