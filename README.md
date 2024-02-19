This is a simple todo application built with Spring Boot and uses an H2 in-memory database.

## Prerequisites

Before you begin, ensure you have the following installed:

- Java Development Kit (JDK) 17 or higher
- Maven
- Git (optional)

## Installation

1. Clone the repository:

   ```
   git clone https://github.com/your_username/todo-app.git

Alternatively, you can download the repository as a ZIP file and extract it.

1. Navigate to the project directory:
   ```
   cd todo-app

2. Build the application using Maven:
   ```
   mvn clean package

## Usage

1. Run the application:
   ```
   java -jar target/todo-app.jar

2. Once the application is running, open your web browser and go to http://localhost:8080 to access the todo application.
3. You can add, edit, delete, and mark tasks as complete in the todo list.

## Configuration
The application uses an H2 in-memory database by default. You can configure the database settings in the application.properties file located in the src/main/resources directory.

## License
This project is licensed under the MIT License.


