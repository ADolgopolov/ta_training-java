package com.epam.training.student_andrii_dolhopolov.exceptions.catch_em_all;

import java.io.FileNotFoundException;
import java.io.IOException;

public class CatchEmAll {

    //You may set another exception in this field;
    static Exception exception = new ArithmeticException();

    public static void riskyMethod() throws Exception {
        throw exception;
    }

    public static void main(String[] args) throws Exception {
        try {
            riskyMethod();
            } catch (FileNotFoundException exp) {
                throw new IllegalArgumentException("Resource is missing", exp);
            } catch (IOException exp) {
                throw new IllegalArgumentException("Resource error", exp);
            } catch (ArithmeticException | NumberFormatException exp) {
                System.err.println(exp.getMessage()); }
    }
}
