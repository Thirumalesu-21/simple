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


Without DI
Student student = new Student();

With DI

Spring creates the object and injects dependencies automatically.

🔄 Types of Dependency Injection in Spring
1️⃣ Constructor Injection

Dependencies are injected through constructor.

public Student(Address address) {
    this.address = address;
}

2️⃣ Setter Injection

Dependencies are injected using setter methods.

public void setAddress(Address address) {
    this.address = address;
}

🧩 Configuration Methods
1️⃣ XML-Based Configuration
<bean id="address" class="com.example.di.Address">
    <property name="city" value="Hyderabad"/>
</bean>

<bean id="student" class="com.example.di.Student">
    <property name="address" ref="address"/>
</bean>

2️⃣ Annotation-Based Configuration
@Component
public class Student {

    @Autowired
    private Address address;
}

▶️ How to Run the Project

Clone the repository:

git clone https://github.com/your-username/spring-di-example.git


Open project in STS / Eclipse.

Update Maven dependencies:

Right Click Project → Maven → Update Project


Run:

Right Click → Run As → Java Application

🧠 Key Concepts Covered

Inversion of Control (IoC)

Spring Container

Bean Lifecycle

Constructor Injection

Setter Injection

Autowiring

@Component, @Autowired annotations

🎯 Advantages of Dependency Injection

✔ Loose Coupling
✔ Better Testability
✔ Easier Maintenance
✔ Reusable Code
✔ Cleaner Architecture

📖 References

Official Spring Documentation

Spring Boot Reference Guide

👨‍💻 Author

THIRUMALESU GUTURU
