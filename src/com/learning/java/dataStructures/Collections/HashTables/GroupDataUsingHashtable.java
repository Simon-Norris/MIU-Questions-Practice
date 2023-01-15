package com.learning.java.dataStructures.Collections.HashTables;

import com.learning.java.utils.csvLearn.CSVReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Vector;

public class GroupDataUsingHashtable {
    public static Hashtable<String, Vector<Integer>> load(String filePath) throws IOException{
        Hashtable<String, Vector<Integer>> hashtable = new Hashtable<>();
        FileReader fileReader = new FileReader(filePath);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        CSVReader csvReader = new CSVReader(bufferedReader, false);
        String[] row = null;
        while ((row = csvReader.readRow()) != null) {
            if (row.length == 15) {
                String key = row[3].trim();
                Integer wage = Integer.parseInt(row[2].trim());
                Vector<Integer> wages = hashtable.getOrDefault(key, new Vector<>());
                wages.add(wage);
                hashtable.put(key, wages);
            }
        }
        return hashtable;
    }
    public static void main(String[] args) throws IOException {
        String filePath = "src/com/learning/java/utils/csvLearn/Adult_Data.csv";
        Hashtable<String, Vector<Integer>> entries = GroupDataUsingHashtable.load(filePath);
        for (Entry<String, Vector<Integer>> entry: entries.entrySet()) {
            Vector<Integer> wages = entry.getValue();
            String education = entry.getKey();
            int totalWage = 0;
            int minWage = Integer.MAX_VALUE;
            int maxWage = Integer.MIN_VALUE;
            for (int i = 0; i < wages.size(); i++) {
                int wage = wages.get(i);
                totalWage += wage;
                if (wage > maxWage) {
                    maxWage = wage;
                }
                if (wage < minWage) {
                    minWage = wage;
                }
            }

            System.out.printf("%d records found for education %s\n", wages.size(), education);
            System.out.printf("\tAverage, Min, Max: %d, %d, %d",totalWage,minWage,maxWage);
            System.out.println();
        }
    }
}
