package com.learning.java.exceptionHandling;

import java.io.IOException;

public class CatchOrSpecify {
    private static void myFunction() throws IOException {
        throw new IOException("Hello");
    }
    public static void main(String[] args){
        try {
            myFunction();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
