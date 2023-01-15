package com.learning.java.utils.csvLearn;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class UseCSVReaderSample {
    public static void main (String[] args) throws IOException {
        String fileName = "src/com/learning/java/utils/sample.csv";
        FileReader fileReader = new FileReader(fileName);
        BufferedReader reader = new BufferedReader(fileReader);
        try(CSVReader csvReader = new CSVReader(reader, true)) {
            String[] row;
            while ((row = csvReader.readRow()) != null){
                System.out.printf("%d  %s  %s\n", csvReader.getLineCount(), row[1], row[2]);
            }
        }
    }
}
