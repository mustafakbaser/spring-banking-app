# Simple Banking Application REST APIs

This project aims to provide a simple yet efficient solution for managing basic banking operations through a RESTful API. Leveraging the power of Spring Boot, Spring Data JPA (backed by Hibernate), and MySQL database, it offers seamless integration and robustness for handling account-related functionalities.

## Features

- **Account Creation**: Users can easily create new bank accounts through the provided API endpoints.
- **Account Details**: Fetch comprehensive details about a specific bank account, including balance and transaction history.
- **Deposit/Withdrawal**: Perform deposit and withdrawal operations securely and efficiently.
- **Account Deletion**: Safely delete bank accounts when necessary, with proper validation and authorization.
- **More to Explore**: The application provides room for expansion with additional features to enhance banking operations.

## Technologies Used

- **Spring Boot**: Empowers rapid application development with its convention-over-configuration philosophy and embedded server capabilities.
- **Spring Data JPA (Hibernate)**: Simplifies database interactions by providing a high-level abstraction over JPA, reducing boilerplate code and enhancing productivity.
- **Spring Web**: Facilitates building flexible and extensible RESTful APIs with minimal effort, allowing seamless communication between the client and server.
- **MySQL Database**: Offers a reliable and scalable relational database management system, ensuring data integrity and consistency.
- **Lombok**: Streamlines Java code development by automatically generating boilerplate code (such as getters, setters, and constructors), reducing verbosity and improving readability.

## Getting Started

To get started with the project, follow these steps:

1. **Clone the Repository**: Clone this repository to your local machine using the following command:
   ```
   git clone https://github.com/mustafakbaser/spring-banking-app.git
   ```

2. **Set Up MySQL Database**: Create a MySQL database and configure the connection properties in the `application.properties` file.

3. **Run the Application**: Build and run the application using Maven or your preferred IDE. The application will start on the configured port (default: 8080).

4. **Explore the APIs**: Use tools like Postman or curl to interact with the RESTful APIs provided by the application. Refer to the API documentation for detailed endpoint information.

## API Documentation

For detailed API documentation and usage instructions, refer to the [API Documentation](api-documentation.md) file.

## Contribution Guidelines

Contributions to the project are welcome! To contribute, follow these guidelines:

- Fork the repository and create a new branch for your feature or bug fix.
- Ensure that your code adheres to the established coding standards and practices.
- Submit a pull request detailing the changes introduced and any relevant information.

## License

This project is licensed under the [MIT License](LICENSE).