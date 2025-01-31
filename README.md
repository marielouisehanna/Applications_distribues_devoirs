
# JDBC PostgreSQL Project

This project demonstrates how to connect a Java application to a PostgreSQL database using JDBC (Java Database Connectivity). 

The application performs basic database operations such as querying a table from the PostgreSQL database and displaying the results in the console.

## Prerequisites

Before running the project, ensure that you have the following software installed:

- **JDK 11 or higher**: Java Development Kit for compiling and running the Java code.
- **PostgreSQL 16**: PostgreSQL database version 16 installed on your machine.
- **PostgreSQL JDBC Driver (version 42.x.x)**: The driver that allows Java to communicate with PostgreSQL.

### Step 1: Install PostgreSQL and Create Database

1. Install PostgreSQL on your system.
2. Create a PostgreSQL database and a table called `employees` with some sample data. You can use the following SQL commands to create the table and insert data:

   ```sql
   -- Connect to PostgreSQL
   CREATE DATABASE your_database;

   -- Switch to your database
   \c your_database;

   -- Create employees table
   CREATE TABLE employees (
       id SERIAL PRIMARY KEY,
       name VARCHAR(100),
       age INT
   );

   -- Insert some sample data
   INSERT INTO employees (name, age) VALUES 
   ('Alice', 30),
   ('Bob', 25),
   ('Charlie', 35);
   ```

### Step 2: Download PostgreSQL JDBC Driver

1. Download the appropriate PostgreSQL JDBC driver (version 42.x.x) from [PostgreSQL JDBC](https://jdbc.postgresql.org/download.html).
2. Place the downloaded `.jar` file into the `lib/` folder of this project. The JDBC driver is required to establish a connection between Java and PostgreSQL.

### Step 3: Compile and Run the Java Program

1. **Compile the Java Program:**

   Open a terminal or command prompt and navigate to the `src/` folder. Run the following command to compile the `TestJDBC.java` file:
   
   ```bash
   javac -cp "lib/postgresql-<version>.jar" src/TestJDBC.java
   ```

2. **Run the Program:**

   After compiling, you can run the program by executing the following command:
   
   ```bash
   java -cp "lib/postgresql-<version>.jar:src" TestJDBC
   ```

   Make sure to replace `<version>` with the actual version number of the PostgreSQL JDBC driver.

### Step 4: Expected Output

If everything is set up correctly, you should see an output similar to the following in your terminal or console:

```
Alice is 30 years old
Bob is 25 years old
Charlie is 35 years old
```
