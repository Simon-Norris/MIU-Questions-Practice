package com.learning.java.utils.csvLearn;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;

public class CSVReader implements Closeable {

    private final BufferedReader reader;
    private String[] headers;
    private int lineCount = 0;

    private CSVReader(BufferedReader reader) throws IOException {
        this(reader, true);
    }

    public CSVReader(BufferedReader reader, boolean hasHeader) throws IOException{
        this.reader = reader;
        if (hasHeader) {
            String header = reader.readLine();
            this.headers = header.split(",");
        }
    }

    public void close() throws IOException{
        this.reader.close();
    }

    public String[] readRow() throws IOException {
        String line = this.reader.readLine();
        if (line == null) return null;
        this.lineCount++;
        return line.split(",");
    }

    public int getLineCount(){
        return this.lineCount;
    }
    public String[] getHeaders(){
        return this.headers;
    }
}
