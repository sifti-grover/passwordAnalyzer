# Password Strength Analyzer (Java | Swing | OOP)

A Java-based desktop application that evaluates password strength using predefined security rules and generates strong passwords automatically.
This project demonstrates core Java concepts, object-oriented programming, and event-driven GUI development, making it suitable for placements, internships, and academic evaluation.

## Why This Project Is Relevant ?

- Demonstrates strong understanding of Core Java

- Applies Object-Oriented Programming principles

- Uses Java Swing for GUI-based application development

- Implements real-world password security logic

- Follows modular and maintainable design

- Shows practical experience with event handling and regex

## Key Features

1. Desktop GUI developed using Java Swing

2. Password strength evaluation (Weak / Medium / Strong)

3. Rule-based validation using regular expressions

4. Automatic strong password generation

5. Instant feedback on user input

6. Clean separation of UI and business logic

## Tech Stack
Category	Technology
|Programming Language	Java
|GUI Framework	Java Swing
|IDE	Visual Studio Code
|JDK	17 or above
|Concepts Used	OOP, Event Handling, Regex

## Password Strength Evaluation Logic

The application assigns a score based on the following rules:

Rule	                         Points

Password length ≥ 8	             2

Contains uppercase letter      	 1

Contains lowercase letter	       1

Contains digit	                 1

Contains special character	     2

Strength Classification

Weak: Score less than 4

Medium: Score between 4 and 6

Strong: Score 7 or above

Project Architecture
passwordAnalyzer/
│
├── PasswordAnalyzerApp.java   // GUI and event handling
├── PasswordChecker.java       // Password validation logic
├── PasswordGenerator.java    // Random password generation
├── .gitignore
└── README.md


The architecture follows separation of concerns, making the project easy to understand, test, and extend.

How to Run the Project
git clone https://github.com/sifti-grover/passwordAnalyzer.git
cd passwordAnalyzer
javac *.java
java PasswordAnalyzerApp

Screenshots
Application Interface

Password Strength Checking

Strong Password Generation

Password Evaluation Rules

Code Structure and GUI Integration

Skills Demonstrated

Core Java programming

Java Swing GUI development

Object-Oriented Programming

Event-driven programming

Regular expressions for validation

Debugging and JVM execution

Git and GitHub version control

Limitations

Passwords are not stored or encrypted

Rule-based logic only (no AI-based evaluation)

Desktop application only

No database integration

Future Enhancements

Real-time password strength indicator

Password hashing and encryption

Show/Hide password feature

Database connectivity

Web-based version using Spring Boot

Improved UI using JavaFX

Author

Sifti Grover
Computer Science Student | Java Developer (Fresher)
GitHub: https://github.com/sifti-grover

