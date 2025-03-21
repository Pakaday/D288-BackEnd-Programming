# Travel Agency Back-End Migration Project

## Project Overview
This project involves migrating a legacy back-end system for a travel agency from an outdated architecture to a modern Spring Boot framework. The goal is to create a minimally viable product (MVP) that maintains mission-critical functionalities while ensuring seamless integration with an existing Angular front end and MySQL database.

## Technologies Used
- **Java** (Spring Boot Framework)
  - Spring Data JPA
  - Rest Repositories
  - MySQL Driver
  - Lombok
- **MySQL** (Database management)
- **Angular** (Front-end, unmodified)
- **GitLab** (Version control and repository management)
- **IntelliJ IDEA Ultimate** (Development environment)

## Project Structure
The project follows a structured package hierarchy:
- **controllers** – Contains REST controller classes
- **entities** – Defines entity classes and enums based on the UML diagram
- **dao** – Repository interfaces extending JpaRepository with cross-origin support
- **services** – Business logic implementation, including checkout services
- **config** – Includes the RestDataConfig.java file with necessary modifications

## Features Implemented
- Creation of entity classes with appropriate relationships
- Implementation of repository interfaces for database interactions
- Development of services for handling checkout processes
- RESTful APIs for placing vacation orders
- Input validation for the Angular front-end
- Programmatic addition of five sample customers

