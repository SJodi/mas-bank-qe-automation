# Automation Project - Bank MAS QE

This project is an automation framework for testing System using Selenium, Cucumber, JUnit, and Serenity BDD. It includes test scenarios written in Gherkin language and API testing using RestAssured.

## Prerequisites

Before running the tests, ensure you have the following:

1. Java Development Kit (JDK) version 15 or higher installed on your machine.
2. Maven installed on your machine.

## Setup and Execution

Follow the steps below to set up the project and execute the tests:

1. Clone the project repository to your local machine.

2. Open a terminal or command prompt and navigate to the project directory.

3. To run the tests, use the following command:

mvn clean verify



## Project Structure

The project follows the standard Maven project structure:

- `src/test/java`: Contains the Java test code and step definitions.
- `src/test/resources/features`: Contains the Gherkin feature files with the test scenarios.
- `pom.xml`: The Maven POM (Project Object Model) file that defines the project dependencies and configurations.

## Dependencies

The project includes the following major dependencies:

- Selenium WebDriver: For web UI automation.
- Cucumber: For writing and executing BDD scenarios.
- JUnit: For test execution and assertions.
- Serenity BDD: For generating comprehensive test reports.
- RestAssured: For API testing.

## Reporting

The Serenity BDD reports will be generated in the `target/site/serenity` directory after running the tests. The reports include detailed information about the test execution, including test outcomes, steps, and screenshots.

![image](https://github.com/SJodi/mas-bank-qe-automation/assets/34503972/16915caf-7d2d-4c49-b09c-f6791a454df2)
