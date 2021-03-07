package dev.zdev.algs4.chapter1_2;

import edu.princeton.cs.algs4.StdOut;

public class Practise_1_2_06 {
    public static void main(String[] args) {
        StdOut.println(isCircular(null, null));
    }

    private static boolean isCircular(String s, String t) {
        return s != null && t != null && s.length() == t.length() && s.concat(s).indexOf(t) >= 0;
    }
}
