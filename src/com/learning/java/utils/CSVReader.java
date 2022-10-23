package com.learning.java.utils;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader implements Closeable {

    private final BufferedReader reader;
    private int lineCount = 0;

    public CSVReader(BufferedReader reader) throws IOException {
        this.reader = reader;
        reader.readLine();
    }

    @Override
    public void close() throws IOException {
        this.reader.close();
    }

    public String[] readRecord() throws IOException{
        String line = reader.readLine();
        if (line == null) return null;
        lineCount++;
        return line.split(",");
    }

    public int getLineCount(){
        return lineCount;
    }

    public static void main(String[] args) throws IOException{
        String fileName = "src/com/learning/java/utils/sample.csv";

        FileReader fileReader = new FileReader(fileName);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        try(CSVReader csvReader = new CSVReader(bufferedReader)){
            String[] row;
            while ((row = csvReader.readRecord()) != null) {
                System.out.printf("%d - %s\n", csvReader.getLineCount(), row[1]);
            }
        }
    }
}
