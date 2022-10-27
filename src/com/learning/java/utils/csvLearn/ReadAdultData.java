package com.learning.java.utils.csvLearn;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;

public class ReadAdultData {

    public static Vector loadWages(String filePath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        Vector wages = new Vector();
        try(CSVReader csvReader = new CSVReader(reader, false)){
            String[] row = null;
            while ((row = csvReader.readRow()) != null){
                if (row.length == 15) {
                    int wage = Integer.parseInt(row[2].trim());
                    wages.add(wage);
                }
            }
        }
        return wages;
    }

    public static void main(String[] args) throws IOException {
        String filePath = "src/com/learning/java/utils/csvLearn/Adult_Data.csv";
        Vector wages = loadWages(filePath);
        int total = 0, maximum = Integer.MIN_VALUE, minimum = Integer.MAX_VALUE;
        for (int i = 0; i < wages.size(); i++) {
            int wage = (int) wages.get(i);
            total += wage;
            if (wage > maximum) {
                maximum = wage;
            }

            if (wage < minimum) {
                minimum = wage;
            }
        }

        System.out.println("Total wage = "+total);
        System.out.println("Maximum wage = "+maximum);
        System.out.println("Minimum wage = "+minimum);
    }
}
