package Lab11.Ex17;

import java.io.IOException;

public class ExceptionTest {
    public static void main(String[] args) {
        try {
            throw new ExceptionA();
        } catch (Exception exception) {
            exception.printStackTrace();
            StackTraceElement[] traceElements = exception.getStackTrace();

            System.out.printf("%nStack trace from getStackTrace:%n");
            System.out.println("Class\t\t\t\t\t\tFile\t\t\t\t\tLine\tMethod");

            for (StackTraceElement element : traceElements) {
                System.out.printf("%s\t", element.getClassName());
                System.out.printf("%s\t\t", element.getFileName());
                System.out.printf("%s\t\t", element.getLineNumber());
                System.out.printf("%s%n", element.getMethodName());
            }
        }

        try {
            throw new ExceptionB();
        } catch (Exception exception) {
            exception.printStackTrace();

            StackTraceElement[] traceElements = exception.getStackTrace();
            for (StackTraceElement element : traceElements) {
                System.out.printf("%s\t", element.getClassName());
                System.out.printf("%s\t\t", element.getFileName());
                System.out.printf("%s\t\t", element.getLineNumber());
                System.out.printf("%s%n", element.getMethodName());
            }
        }

        try {
            String str = null;
            if (str.equals(null))
                throw new NullPointerException();
        } catch (Exception exception) {
            exception.printStackTrace();

            StackTraceElement[] traceElements = exception.getStackTrace();
            for (StackTraceElement element : traceElements) {
                System.out.printf("%s\t", element.getClassName());
                System.out.printf("%s\t\t", element.getFileName());
                System.out.printf("%s\t\t", element.getLineNumber());
                System.out.printf("%s%n", element.getMethodName());
            }
        }

        try {
            throw new IOException();
        } catch (Exception exception) {
            exception.printStackTrace();

            StackTraceElement[] traceElements = exception.getStackTrace();
            for (StackTraceElement element : traceElements) {
                System.out.printf("%s\t", element.getClassName());
                System.out.printf("%s\t\t", element.getFileName());
                System.out.printf("%s\t\t", element.getLineNumber());
                System.out.printf("%s%n", element.getMethodName());
            }
        }


    }


}
