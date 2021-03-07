package dev.zdev.algs4.chapter1_1;

import java.util.Arrays;

import edu.princeton.cs.algs4.StdOut;

public class Practise_1_1_30 {
    public static void main(String[] args) {
        var array = createArray(10);
        for (boolean[] bs : array) {
            StdOut.println(Arrays.toString(bs));
        }
    }

    private static boolean[][] createArray(int N) {
        boolean[][] result = new boolean[N][N];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                result[i][j] = gcd(i, j) == 1;
            }
        }
        return result;
    }

    private static int gcd(int p, int q) {
        if (q == 0)
            return p;
        return gcd(q, p % q);
    }
}
