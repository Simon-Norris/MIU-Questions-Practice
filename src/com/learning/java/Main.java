package com.learning.java;

import java.util.*;
public class Main
{

    public static void main(String[] args) {

        // Flood fill
        int[][] call = {{1,1,1},{1,1,0},{1,0,1}};
        System.out.println("Before Flood Fill");
        for (int i= 0; i < call.length; i++){
            for (int j=0; j < call[i].length; j++) {
                System.out.print(call[i][j]+ " ");
            }
            System.out.println();
        }
        int startRow = 1;
        int startColumn = 1;
        int color = 3;
        SearchDFSBFS searchDFSBFS = new SearchDFSBFS();
        int[][] response = searchDFSBFS.floodFill(call, startRow, startColumn, color);
        System.out.println("After Flood Fill");
        for (int[] row : response) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}

