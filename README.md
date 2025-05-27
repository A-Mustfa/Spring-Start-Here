# Spring-Start-Here
My own notes &amp; implemented Examples of Spring Start here by LAURENTIU SPILCA 

---


# 📘 Spring Start Here - Book Examples

This repository contains all examples implemented from the book **"Spring Start Here" by Laurentiu Spilca"**. Each folder follows the structure `ChX/exY` where `X` is the chapter number and `Y` is the example number in that chapter.

---

## 🔹 PART 1: Fundamentals

### [Ch1 - Spring in the Real World](./Ch1/)
Introduction to frameworks, the Spring ecosystem, and where Spring fits in real-world applications.

### [Ch2 - Defining Beans](./Ch2/)
Shows how to define beans using annotations, `@Bean` methods, and programmatic registration.

### [Ch3 - Wiring Beans](./Ch3/)
Covers different ways of injecting dependencies between beans using `@Autowired`, constructor, setter, etc.

### [Ch4 - Using Abstractions](./Ch4/)
Demonstrates how to use interfaces and stereotype annotations to decouple and manage components.

### [Ch5 - Bean Scopes and Life Cycle](./Ch5/)
Explains singleton and prototype scopes and the bean life cycle.

### [Ch6 - Spring AOP](./Ch6/)
Introduces aspects, advice types, and how to intercept logic using Spring AOP.

---

## 🔹 PART 2: Implementation

### [Ch7 - Spring Boot & Spring MVC](./Ch7/)
Explains what a web app is and how Spring Boot simplifies configuration and setup.

### [Ch8 - Building Web Apps](./Ch8/)
Demonstrates building web apps with Spring Boot, including view templates and form data handling.

### [Ch9 - Web Scopes](./Ch9/)
Covers request, session, and application scopes in a web context.

### [Ch10 - REST Services](./Ch10/)
Shows how to create REST endpoints, return data, handle errors, and use request/response bodies.

### [Ch11 - Consuming REST APIs](./Ch11/)
Uses OpenFeign, RestTemplate, and WebClient to call external REST APIs.

### [Ch12 - Data Sources](./Ch12/)
Configures data sources and interacts with databases using `JdbcTemplate`.

### [Ch13 - Transactions](./Ch13/)
Explains transaction management with Spring and how to use `@Transactional`.

### [Ch14 - Spring Data](./Ch14/)
Introduces Spring Data and how to simplify persistence using repositories.

### [Ch15 - Testing](./Ch15/)
Demonstrates unit and integration testing in Spring apps using JUnit and Spring Test.

---

## 🛠 How to Run Examples

Navigate to the desired chapter:
```bash
cd Ch3/ex1
./mvnw spring-boot:run
````

Or open the folder in your favorite IDE and run the main class.

---

## 📎 Requirements

* Java 17+
* Maven
* Spring Boot 3.x

---

## 📘 License

This code is for learning purposes. For full content, refer to the official book.



