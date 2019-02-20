package com.company;

import java.io.EOFException;
import java.io.FileNotFoundException;

public class Main7 {
    public static void main(String[] args) throws EOFException, FileNotFoundException {
        System.err.println("1");
        f();
        f1();
        System.err.println("2");

    }

    public static void f() throws EOFException {}
    public static void f1() throws FileNotFoundException {}
}
