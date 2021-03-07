package dev.zdev.algs4.chapter1_1;

import edu.princeton.cs.algs4.StdOut;

public class Practise_1_1_24 {
    public static void main(String[] args) {
        StdOut.println(euclid(105, 24));
        StdOut.println(euclid(1111111, 1234567));
    }

    private static int euclid(int p, int q) {
        StdOut.println(p + " " + q);
        if (q == 0)
            return p;
        return euclid(q, p % q);
    }
}
