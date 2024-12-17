# KITOGA_ELISEE_24943_ExceptionHandling_SUNDAY_MORNING_GROUP
# Exception Handling in Java

This project demonstrates various exception handling scenarios in Java. Each example simulates and handles specific exceptions in a meaningful way, showcasing the use of try-catch blocks and best practices for error management.

## Overview

The project covers the following exceptions:

### Checked Exceptions
1. **IOException**
   - Scenario: Attempt to read a file that may not exist or may cause an I/O error.
   - Method: `simulateIOException()`

2. **FileNotFoundException**
   - Scenario: Try to open a file that does not exist.
   - Method: `simulateFileNotFoundException()`

3. **EOFException**
   - Scenario: Attempt to read beyond the content of a file.
   - Method: `simulateEOFException()`

4. **SQLException**
   - Scenario: Execute an invalid SQL query or connect to a non-existent database.
   - Method: `simulateSQLException()`

5. **ClassNotFoundException**
   - Scenario: Load a class that does not exist at runtime.
   - Method: `simulateClassNotFoundException()`

### Unchecked Exceptions
6. **ArithmeticException**
   - Scenario: Perform a division by zero operation.
   - Method: `simulateArithmeticException()`

7. **NullPointerException**
   - Scenario: Attempt to access a null reference.
   - Method: `simulateNullPointerException()`

8. **ArrayIndexOutOfBoundsException**
   - Scenario: Access an invalid index in an array.
   - Method: `simulateArrayIndexOutOfBoundsException()`

9. **ClassCastException**
   - Scenario: Perform an invalid type cast.
   - Method: `simulateClassCastException()`

10. **IllegalArgumentException**
    - Scenario: Pass an invalid argument to a method.
    - Method: `simulateIllegalArgumentException()`

11. **NumberFormatException**
    - Scenario: Convert a string to a number with an invalid format.
    - Method: `simulateNumberFormatException()`

## Getting Started

### Prerequisites
- Java Development Kit (JDK) 8 or above.
- A Java IDE or text editor.

### Running the Program
1. Clone or download the repository.
2. Open the project in your preferred IDE.
3. Compile and run the `ExceptionHandling` class.
4. Observe the console output for messages describing each caught exception.

## Code Structure

### Main Class
The `main` method sequentially calls the following methods to simulate and handle exceptions:
```java
public static void main(String[] args) {
    simulateIOException();
    simulateFileNotFoundException();
    simulateEOFException();
    simulateSQLException();
    simulateClassNotFoundException();
    simulateArithmeticException();
    simulateNullPointerException();
    simulateArrayIndexOutOfBoundsException();
    simulateClassCastException();
    simulateIllegalArgumentException();
    simulateNumberFormatException();
}
```

### Exception Simulation Methods
Each method demonstrates the triggering and handling of a specific exception with appropriate comments to explain the logic. Example:

```java
// 1. IOException
public static void simulateIOException() {
    try {
        FileReader reader = new FileReader("file.txt");
        reader.read();
        reader.close();
    } catch (IOException e) {
        System.out.println("IOException caught: " + e.getMessage());
    }
}
```

## Exception Details

### Checked Exceptions
- **IOException**: Signals that an I/O operation failed.
- **FileNotFoundException**: A specific type of `IOException` indicating a file was not found.
- **EOFException**: Signals the end of a file unexpectedly.
- **SQLException**: Indicates a database access error or issues with SQL queries.
- **ClassNotFoundException**: Thrown when a class cannot be found at runtime.

### Unchecked Exceptions
- **ArithmeticException**: Indicates errors in arithmetic operations, like division by zero.
- **NullPointerException**: Occurs when referencing a null object.
- **ArrayIndexOutOfBoundsException**: Triggered by accessing an invalid array index.
- **ClassCastException**: Signals an invalid type cast.
- **IllegalArgumentException**: Indicates invalid arguments passed to a method.
- **NumberFormatException**: Triggered when parsing an invalid numeric string.

## Output Example
Each exception simulation provides a console output, such as:
```
IOException caught: file.txt (No such file or directory)
FileNotFoundException caught: file.txt (No such file or directory)
EOFException caught: End of file reached.
SQLException caught: No suitable driver found for jdbc:mysql://localhost:3306/db
ClassNotFoundException caught: com.school.Class
ArithmeticException caught: / by zero
NullPointerException caught: Cannot invoke "String.length()" because "str" is null
ArrayIndexOutOfBoundsException caught: Index 5 out of bounds for length 3
ClassCastException caught: java.lang.String cannot be cast to java.lang.Integer
IllegalArgumentException caught: timeout value is negative
NumberFormatException caught: For input string: "NUMBER"
```

## Conclusion
This project provides a comprehensive guide to understanding and handling exceptions in Java. It highlights the importance of robust error management to create resilient applications.


