# Student Database App

A simple terminal-based Java application to manage student records using *MySQL*.  
Users can *add, **list, **delete, and **update* students.

---

## Features

1. *Add student* – Save student name, age, email, and index number to MySQL.  
2. *List students* – Display all students from the database.  
3. *Delete student* – Remove a student by their index number.  
4. *Update student* – Modify a student’s name, age, and email by index number.  
5. Terminal-based menu for easy navigation.  

---

## Requirements

- *Java 8* or later  
- *MySQL Server* installed locally  
- *MySQL Connector/J 9.4.0* (JAR file)  

---

## Setup Instructions

1. *Install MySQL Server* if not installed.  
2. *Create the database and table*:

```sql
CREATE DATABASE IF NOT EXISTS studentdb;

USE studentdb;

CREATE TABLE IF NOT EXISTS students (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    age INT,
    email VARCHAR(100),
    index_no VARCHAR(100)
);
```

Download MySQL Connector/J:
https://dev.mysql.com/downloads/connector/j/

Place the JAR (mysql-connector-j-9.4.0.jar) in your project folder.

Compile Java files in terminal/PowerShell:

powershell
```cmd
javac -cp ".;mysql-connector-j-9.4.0.jar" *.java
```
Run the application:

powershell
```cmd
java -cp ".;mysql-connector-j-9.4.0.jar" App
```
Usage
Run the program and follow the terminal prompts.

Menu options:

mathematica
Copy code
1) Add student
2) List students
3) Delete student
4) Update student
5) Exit
Enter the appropriate number to perform an action.

Assumptions / Notes
The column index_no is unique for each student.

All database connection details (username, password, DB name) are hard-coded in DBUtil.java.

No GUI; purely terminal-based.

MySQL must be running before starting the application.

The app uses prepared statements to prevent SQL injection.
