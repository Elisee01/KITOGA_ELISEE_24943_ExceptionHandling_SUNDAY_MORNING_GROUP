/**
 * Exception Handling
 *
 * This file contains programs for simulating and handling various exceptions in Java.
 * Each example demonstrates a meaningful scenario that triggers the exception,
 * with appropriate try-catch blocks and comments for clarity.
 */

import java.io.*;
import java.sql.*;

public class ExceptionHandling {

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

    // 2. FileNotFoundException
    public static void simulateFileNotFoundException() {
        try {
            FileInputStream file = new FileInputStream("file.txt");
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException caught: " + e.getMessage());
        }
    }

    // 3. EOFException
    public static void simulateEOFException() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("datafile.dat"))) {
            while (true) {
                ois.readObject();
            }
        } catch (EOFException e) {
            System.out.println("EOFException caught: End of file reached.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    // 4. SQLException
    public static void simulateSQLException() {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "root", "kitoga");
            Statement statement = connection.createStatement();
            statement.executeQuery("SELECT * FROM db");
        } catch (SQLException e) {
            System.out.println("SQLException caught: " + e.getMessage());
        }
    }

    // 5. ClassNotFoundException
    public static void simulateClassNotFoundException() {
        try {
            Class.forName("com.school.Class");
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException caught: " + e.getMessage());
        }
    }

    // 6. ArithmeticException
    public static void simulateArithmeticException() {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        }
    }

    // 7. NullPointerException
    public static void simulateNullPointerException() {
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e.getMessage());
        }
    }

    // 8. ArrayIndexOutOfBoundsException
    public static void simulateArrayIndexOutOfBoundsException() {
        try {
            int[] array = {1, 2, 3};
            int value = array[5];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        }
    }

    // 9. ClassCastException
    public static void simulateClassCastException() {
        try {
            Object obj = new String("Hello");
            Integer num = (Integer) obj;
        } catch (ClassCastException e) {
            System.out.println("ClassCastException caught: " + e.getMessage());
        }
    }

    // 10. IllegalArgumentException
    public static void simulateIllegalArgumentException() {
        try {
            Thread.sleep(-1000);
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught: " + e.getMessage());
        } catch (InterruptedException e) {
            System.out.println("InterruptedException caught: " + e.getMessage());
        }
    }

    // 11. NumberFormatException
    public static void simulateNumberFormatException() {
        try {
            int number = Integer.parseInt("NUMBER");
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: " + e.getMessage());
        }
    }
}
