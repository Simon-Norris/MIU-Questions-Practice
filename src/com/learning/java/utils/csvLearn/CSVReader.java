package com.learning.java.utils.csvLearn;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;

public class CSVReader implements Closeable {

    private final BufferedReader reader;
    private final String[] headers;
    private int lineCount = 0;

    public CSVReader(BufferedReader reader) throws IOException {
        this.reader = reader;
        String header = reader.readLine();
        this.headers = header.split(",");
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
