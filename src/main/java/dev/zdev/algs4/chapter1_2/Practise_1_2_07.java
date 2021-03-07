package dev.zdev.algs4.chapter1_2;

import edu.princeton.cs.algs4.StdOut;

public class Practise_1_2_07 {
    public static void main(String[] args) {
        String s = mystery("Hello World");
        StdOut.println(s);
    }

    public static String mystery(String s) {
        int N = s.length();
        if (N <= 1)
            return s;
        String a = s.substring(0, N / 2);
        String b = s.substring(N / 2, N);
        return mystery(b) + mystery(a);
    }
}
