Excellent Work- MarieLouise!
# PostgreSQL JDBC Project 🚀

## Prerequisites 📋
- **Java 11** or higher ☕
- **PostgreSQL 16** installed 💾
- **PostgreSQL JDBC Driver (42.x.x)** 🐘

## Setup Instructions ⚙️

### Step 1: Install PostgreSQL and Create Database
1. Install PostgreSQL.
2. Create the `employees` table and insert data with:
   ```sql
   CREATE DATABASE test1;
   \c test1;
   CREATE TABLE employees (id SERIAL PRIMARY KEY, name VARCHAR(100), age INT);
   INSERT INTO employees (name, age) VALUES ('Alice', 30), ('Bob', 25), ('Charlie', 35);
   ```

### Step 2: Download JDBC Driver 📥
1. Download the PostgreSQL JDBC driver from [jdbc.postgresql.org](https://jdbc.postgresql.org).
2. Place the `.jar` file in the `lib/` folder.

### Step 3: Compile and Run 🖥️
1. Compile the Java program:
   ```bash
   javac -cp "lib/postgresql-<version>.jar:src" src/TestJDBC.java
   ```
2. Run the program:
   ```bash
   java -cp "lib/postgresql-<version>.jar:src" TestJDBC
   ```

### Expected Output 🔍
```text
Alice is 30 years old
Bob is 25 years old
Charlie is 35 years old
```
