package com.company;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main9 {
    public static void main(String[] args) throws IOException {
        System.err.println("1");
        f();
        f1();
        System.err.println("2");
    }

    public static void f() throws EOFException{}
    public static void f1() throws FileNotFoundException{}
}
