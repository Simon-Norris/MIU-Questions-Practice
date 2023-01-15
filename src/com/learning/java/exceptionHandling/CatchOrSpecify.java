package com.learning.java.exceptionHandling;

import java.io.IOException;

public class CatchOrSpecify {
    private static void myFunction() throws IOException {
        throw new IOException("Hello");
    }
    public static void main(String[] args){
        /**
         * checked Exception: Any class that is not direct descendent of Error or RunTimeException
         * class are checked exception.
         * Unchecked Exception: Class that are direct descendent of Error or RunTimeException are
         * unchecked exception
         * Throwable is child of Object class and has three subclass: Error , Exception and StackRecorder
         * ctrl+H  for more info on Throwable variable down
         * **/
        try {
            myFunction();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Throwable t;
    }
}
