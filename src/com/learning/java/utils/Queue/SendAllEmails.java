package com.learning.java.utils.Queue;

import com.learning.java.utils.csvLearn.CSVReader;
import com.learning.java.utils.csvLearn.User;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Random;

public class SendAllEmails {
    private static Process runningProcess = null;
    private static void sendEmailWhenReady(ArrayDeque<String> queue) throws Exception{
        // If running, return
        if (runningProcess != null && runningProcess.isAlive()) {
            System.out.print(".");
            return;
        }
        System.out.print("\nSending email");
        String email = queue.poll();
        String classPath = System.getProperty("java.class.path");
        String[] command = new String[]{
                "java", "-cp", classPath, "EmailSender", email
        };
        runningProcess = Runtime.getRuntime().exec(command);
    }
    public static void main(String[] args) throws Exception {
        String filePath = "src/com/learning/java/utils/csvLearn/sample.csv";
        ArrayDeque<String> queue = new ArrayDeque<>();
        FileReader fileReader = new FileReader(filePath);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        try(CSVReader reader = new CSVReader(bufferedReader, true)) {
            String[] row;
            while((row = reader.readRow()) != null) {
                User user = User.fromValues(row);
                queue.offer(user.email);
            }
        }
        while (!queue.isEmpty()) {
            sendEmailWhenReady(queue);

            // wait before checking again
            while (runningProcess.isAlive()) {
                System.out.print(".");
                Thread.sleep(100);
            }
            System.out.println("\nDone sending emails!");
        }
    }
}
