🌱 Spring Dependency Injection Example

This project demonstrates how Dependency Injection (DI) works in the Spring Framework using XML configuration and Annotation-based configuration.

📌 Project Overview

This project explains the concept of Dependency Injection (DI) in the Spring Framework.

Dependency Injection is a design pattern where objects receive their dependencies from an external source rather than creating them internally. Spring provides a powerful IoC (Inversion of Control) container to manage object creation and dependency resolution.

🏗 Technologies Used

Java 17+

Spring Framework / Spring Boot

Maven

Eclipse / STS

Git

📂 Project Structure
Spring-DI-Example/
│
├── src/main/java/
│   ├── com.example.di/
│   │     ├── App.java
│   │     ├── Student.java
│   │     ├── Address.java
│
├── src/main/resources/
│   ├── applicationContext.xml  (for XML configuration)
│
├── pom.xml
└── README.md

💡 What is Dependency Injection?

Dependency Injection is a technique where:

The Spring Container creates objects.

The container injects required dependencies.

The object does not create its own dependencies.
