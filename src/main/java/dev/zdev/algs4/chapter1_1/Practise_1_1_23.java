package dev.zdev.algs4.chapter1_1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Practise_1_1_23 {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 6, 7, 8, 9, 12 };
        StdOut.print("+ or - ? ");
        char ch = StdIn.readChar();
        StdOut.print("Input keys: ");
        int key = StdIn.readInt();
        int pos = rank(key, a);
        StdOut.printf("%s\n", pos == -1 ? ch == '+' ? key : "" : "position=" + pos);
    }

    private static int rank(int key, int[] a) {
        return rank(key, a, 0, a.length - 1);
    }

    private static int rank(int key, int[] a, int lo, int hi) {
        if (lo > hi)
            return -1;
        int mid = lo + (hi - lo) / 2;
        if (key < a[mid])
            return rank(key, a, lo, mid - 1);
        else if (key > a[mid])
            return rank(key, a, mid + 2, hi);
        else
            return mid;
    }
}
