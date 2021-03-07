package dev.zdev.algs4.chapter1_1;

import edu.princeton.cs.algs4.StdOut;

public class Practise_1_1_20 {

    public static void main(String[] args) {
        StdOut.println(factorialLn(10));
    }

    private static double factorialLn(int N) {
        if (N == 1)
            return 0;
        return Math.log(N) + factorialLn(N - 1);
    }
}
