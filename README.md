# Spring Boot User Management Demo

## Overview
This is a simple Spring Boot project that demonstrates basic concepts like dependency injection, annotations, and in-memory data storage.

## Technologies Used
- Java 17
- Spring Boot
- JUnit 5 for testing

## How to Run
1. Clone the repository
2. Run the project with the command:
./gradlew bootRun

3. The console will show user interactions.

## How to Test
1. Run tests with:
./gradlew test

## Project Structure
spring-boot-user-demo/ <br />
│ <br />
├── src/ <br />
│ │ <br />
│ ├── main/ <br />
│ │ ├── java/com/example/demo/ <br />
│ │ │ ├── DemoApplication.java <br />
│ │ │ ├── model/User.java <br />
│ │ │ ├── repo/FakeRepoInterface.java <br />
│ │ │ ├── repo/FakeRepo.java <br />
│ │ │ ├── service/UserService.java <br />
│ │ │ ├── service/UserServiceImpl.java <br />
│ │ └── test/ <br />
│ │ └── java/com/example/demo/ <br />
│ │ └── service/UserServiceTests.java <br />
│ <br />
├── build.gradle <br />
├── README.md <br />

## How It Works
1. **User Model**: Represents a user with `id`, `name`, and `surname`.
2. **Fake Repository**: Simulates a database with in-memory storage. It can insert, find, and delete users.
3. **User Service**: Implements business logic for adding, getting, and removing users.
4. **Controller (optional)**: (For advanced learners, not included in this example).

## Key Features
- **Dependency Injection**: Used to inject dependencies like `FakeRepo` into `UserService`.
- **Layered Architecture**: The project is divided into models, repository, and services.
- **Unit Testing**: Includes tests for service methods.

## Code Standards
- Use camelCase for variables and methods.
- Use PascalCase for class names.
- Follow OOP principles (Encapsulation, Abstraction).
- Write clear and meaningful code comments.
- Test edge cases (e.g., invalid inputs, empty states).

## Git Workflow
- **Main Branch**: Stable code.
- **Develop Branch**: For new features.
- **Feature Branches**: For individual features (e.g., `feature/add-user`).

### Commit Messages Format:
- `feat: Added FakeRepo with in-memory storage`
- `fix: Corrected method name in UserService`
- `test: Added unit tests for addUser`

## Conclusion
This project is a simple introduction to Spring Boot, focusing on core concepts like dependency injection and layered architecture. It's designed to help you understand the basics of Spring Boot and improve your Java development skills.

## Resources
- [Spring Boot Documentation](https://spring.io/projects/spring-boot)
- [Spring Dependency Injection](https://www.baeldung.com/inversion-control-and-dependency-injection-in-spring)
