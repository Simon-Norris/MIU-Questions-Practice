package com.learning.java.utils.Queue;

import java.util.Random;

public class EmailSender {
    public static void main(String[] args) throws InterruptedException {
        System.out.printf("Sending email to %s...\n", args[0]);
        Thread.sleep(new Random().nextInt(1000));
        System.out.printf("Email sent to %s!\n", args[0]);
    }
}
