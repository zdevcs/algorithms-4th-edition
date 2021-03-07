package dev.zdev.algs4.chapter1_1;

import edu.princeton.cs.algs4.StdOut;

public class Practise_1_1_11 {
    public static void main(String[] args) {
        boolean[][] bool = { { false, false }, { false, true }, };
        StdOut.print(' ');
        for (int i = 0; i < bool.length; i++) {
            StdOut.printf("%d", i);
        }
        StdOut.println();

        for (int i = 0; i < bool.length; i++) {
            StdOut.printf("%d", i);
            for (int j = 0; j < bool.length; j++) {
                StdOut.printf("%c", bool[i][j] ? '*' : ' ');
            }
            StdOut.println();
        }
    }
}
