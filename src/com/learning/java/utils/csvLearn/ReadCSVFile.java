package com.learning.java.utils.csvLearn;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Files can be split into two basic groups: binary and text
 *
 * Binary Files are used when human interaction with the files will only be indirect such as executable files.
 * We can't read those files they contain unreadable characters. These files are structured so that computers
 * can read them quickly.
 *
 * Text Files contain readable characters by human. Example: CSV
 *
 * Java has two basic set of classes : Stream(to read binary files) & Reader(to read text files)
 * FileReader and BufferedReader are used here by piping to read csv file
 * **/
public class ReadCSVFile {

    public static void main(String[] args) throws IOException {
        String fileName = "src/com/learning/java/utils/sample.csv";
        FileReader fileReader = new FileReader(fileName);
        try(BufferedReader reader = new BufferedReader(fileReader)){
            String line;
            int lineCounter = -1;
            System.out.println("ID |\tName |\tEmail");
            while ((line = reader.readLine()) != null) {
                lineCounter++;
                if (lineCounter == 0) continue;
                String[] split = line.split(",");
                System.out.printf("%s | %s | %s\n", split[0], split[1], split[2]);
            }
        }
    }
}
