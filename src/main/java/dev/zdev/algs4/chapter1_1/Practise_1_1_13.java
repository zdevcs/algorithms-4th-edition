package dev.zdev.algs4.chapter1_1;

import edu.princeton.cs.algs4.StdOut;

public class Practise_1_1_13 {
    public static void main(String[] args) {
        int[][] matrix = new int[][] { { 0, 1, 2, 3 }, { 2, 3, 4, 5 }, };
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                StdOut.printf("%d ", matrix[j][i]);
            }
            StdOut.println();
        }
    }
}
