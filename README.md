# SPRINT 1.04 — Java Testing

This unit introduces the basics of **automated testing in Java** using **JUnit 5**, focusing on unit tests, parameterized tests, and exception handling.

## TASK 1 - LEVEL 1
📌 **Exercise 1 — Unit Tests with JUnit**

Create a Java class that manages a library of books and write unit tests to validate its behavior.  
The class must allow adding books, retrieving them in insertion order, accessing titles by position, inserting books at a specific index, removing books by title, returning a sorted copy of the list, and preventing duplicate titles.

The tests must verify:
- The collection is not null after instantiation
- Correct collection size after adding books
- Books are stored at expected positions
- Correct title retrieval by index
- Correct insertion at a specific position
- Correct deletion by title
- Sorted list correctness without modifying the original list
- Duplicate titles are not allowed

## TASK 2 - LEVEL 1
📌 **Exercise 2 — Parameterized Tests**

Create a class `CalculoDni` with a method that calculates the letter of a Spanish DNI from its numeric value.  
Write a JUnit 5 parameterized test that validates the calculation using **at least 10 different DNI numbers** and their expected letters.

The method must also handle invalid values (negative or out-of-range numbers), for example by throwing an exception.

## TASK 3 - LEVEL 1
📌 **Exercise 3 — Exception Handling**

Create a Java class with a method that intentionally throws an `ArrayIndexOutOfBoundsException`, for example by accessing an invalid index in an array.  
Write a JUnit 5 test that verifies the method throws the expected exception.

## 🛠 Technologies
- Java 21 (LTS)
- JUnit 5
- Maven
- IntelliJ IDEA
- Git & GitHub

## 🚀 Installation and Execution

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- Maven installed

### Clone the repository
```bash
git clone https://github.com/Dani87dev/S1T4-Java-Testing.git
