# Zand MS Identity

Zand MS Identity is a microservice designed for managing identity and authentication within the Zand system. It provides features like user registration, login, and token management, integrated with third-party services for enhanced security and compliance.

## Features

- **User Onboarding**: Handles the registration of new users.
- **Authentication**: Supports secure login using JWT tokens.
- **Third-party Integrations**: Integrated with third-party services for KYC and AML.
- **Token Management**: Includes token creation, validation, and renewal functionalities.

## Technologies

- **Java 21**
- **Spring Boot**
- **Microservices Architecture**
- **JWT (JSON Web Token) for authentication**
- **Integration with third-party services for decision making (AML/KYC)**

## Requirements

Before running the project, ensure you have the following installed:

- Java 21
- Gradle

## Installation

1. Clone the repository:

   ```bash
   git clone https://github.com/JhonatanMota/zand-ms-identity.git

2. Navigate to the project directory:
    ```bash
    cd zand-ms-identity
3. Build the project:
    ```bash
   ./gradlew build

4. Run the application:
    ```bash
   ./gradlew bootRun

## Usage
Once the application is running, you can access the following endpoints:
1. Identity verification: `http://localhost:8081/api/identity/verification` (POST)

