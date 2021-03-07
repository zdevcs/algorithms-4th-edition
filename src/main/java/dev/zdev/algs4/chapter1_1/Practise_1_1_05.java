package dev.zdev.algs4.chapter1_1;

import java.util.function.DoublePredicate;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Practise_1_1_05 {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        double x = StdIn.readDouble();
        double y = StdIn.readDouble();
        DoublePredicate m = c -> c > 0 && c < 1;
        StdOut.println(m.test(x) && m.test(y));
    }
}
