package com.company;

import java.io.IOException;

public class Main1 {
    public static void main(String[] args) throws Exception {
        if (true) throw new IOException();
        System.err.println("1");
    }
}
