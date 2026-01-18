# SPRINT1.04 — Java Testing
📌 Exercise Statement

## TASK 1 - LEVEL 1

In this exercise, we work with a practical example: managing a collection of books in a library.

The main goal is to learn how to write unit tests with JUnit 5 to ensure that the application logic behaves correctly. JUnit is integrated into the project using Maven as a dependency manager.

Functional requirements

Create a Java class that manages a collection of books and provides the following features:

Add books to the collection.

Retrieve the complete list of books (preserving insertion order).

Get the title of a book by its position.

Insert a book at a specific position.

Remove a book by its title.

Return a sorted copy of the list (alphabetically).

Prevent duplicate book titles.

Required unit tests

The unit tests must verify at least the following cases:

The collection is not null after instantiating the class.

The collection size is correct after adding multiple books.

Books are stored at the expected positions.

Retrieving a book by index returns the correct title.

Inserting a book at a specific position updates the collection correctly.

Removing a book by title reduces the collection size.

The sorted list is returned alphabetically without modifying the original collection.

Duplicate book titles are not allowed.

## TASK 2 - LEVEL 1
📌 Exercise Statement

Exercise 2 — Parameterized Tests

This exercise introduces parameterized tests with JUnit 5, a powerful technique to validate the same functionality using multiple sets of input data.

We work with a concrete use case: calculating the letter of a Spanish DNI number.

Learning objectives

Write a testable method based on a mathematical formula.

Use @ParameterizedTest to validate multiple cases efficiently.

Analyze test results and detect errors when expected and actual values do not match.

Requirements

Create a class named CalculoDni containing a public method that calculates the corresponding DNI letter given a numeric DNI (without the letter).

Create a JUnit 5 test class using parameterized tests to validate the calculation.

The test must verify at least 10 different DNI numbers with their corresponding expected letters.

The method must properly handle invalid values, such as negative numbers or numbers out of range (for example, by throwing an exception).

## TASK 3 - LEVEL 1
📌 Exercise Statement

Exercise 3 — Exception Handling

In this exercise, we focus on throwing and testing exceptions in Java.

The objective is to understand how to handle expected errors using automated testing.

Requirements

Create a Java class containing a public method that intentionally throws an ArrayIndexOutOfBoundsException, for example by accessing an invalid index in an array.

Create a JUnit 5 test class that verifies the method throws the expected exception when executed.

🛠 Technologies

Java: 21 (LTS)

Testing Framework: JUnit 5

Build Tool: Maven

IDE: IntelliJ IDEA

Version Control: Git

Repository Hosting: GitHub

🚀 Installation and Execution
Prerequisites

Java Development Kit (JDK) 8 or higher

Maven installed

Clone the repository
git clone https://github.com/Dani87dev/S1T4-Java-Testing.git
