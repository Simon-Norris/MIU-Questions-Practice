package com.learning.java.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;

public class AdultData {
    public static Vector loadWages(String fileToReadFrom) throws IOException {
        Vector results = new Vector();
        BufferedReader lineReader = new BufferedReader(new FileReader(fileToReadFrom));
        try(CSVReader reader = new CSVReader(lineReader, false)){
            String[] row  = null;
            while ((row = reader.readRecord()) != null) {
                if (row.length == 15) {
                    results.add(Integer.parseInt(row[2].trim()));
                }
            }
        }
        return results;
    }
    public static void main(String[] args) throws IOException {
        String fileName = "src/com/learning/java/utils/Adult_Data.csv";
        Vector wages = AdultData.loadWages(fileName);
        long start = System.currentTimeMillis();
        int totalWage = 0, maxWage = 0, minWage = Integer.MAX_VALUE;
        for(Object wage: wages) {
            int wageObj = (int) wage;
            totalWage += wageObj;
            if (wageObj > maxWage) maxWage = wageObj;
            if (wageObj < minWage) minWage = wageObj;
        }
        System.out.printf("Read %d rows in %dms\n", wages.size(), System.currentTimeMillis() - start);
        System.out.printf("Average , Min and Max : %d, %d and %d",totalWage/ wages.size(), minWage, maxWage);
    }
}
