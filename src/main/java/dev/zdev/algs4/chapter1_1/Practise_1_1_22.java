package dev.zdev.algs4.chapter1_1;

import edu.princeton.cs.algs4.StdOut;

public class Practise_1_1_22 {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 6, 7, 8, 9, 12 };
        int pos = rank(2, a);
        StdOut.printf("%s\n", pos == -1 ? "not found!" : "position=" + pos);
    }

    private static int rank(int key, int[] a) {
        return rank(key, a, 0, a.length - 1, 0);
    }

    private static int rank(int key, int[] a, int lo, int hi, int depth) {
        for (int i = 0; i < depth; i++) {
            StdOut.print("  ");
        }
        StdOut.println("lo=" + lo + ", hi=" + hi);
        if (lo > hi)
            return -1;
        int mid = lo + (hi - lo) / 2;
        if (key < a[mid])
            return rank(key, a, lo, mid - 1, depth + 1);
        else if (key > a[mid])
            return rank(key, a, mid + 2, hi, depth + 1);
        else
            return mid;
    }
}
