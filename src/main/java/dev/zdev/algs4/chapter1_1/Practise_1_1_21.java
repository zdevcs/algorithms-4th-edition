package dev.zdev.algs4.chapter1_1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Practise_1_1_21 {
    public static void main(String[] args) {
        while (StdIn.hasNextLine()) {
            String name = StdIn.readString();
            int a = StdIn.readInt();
            int b = StdIn.readInt();
            StdOut.printf("|%4s|%4d|%4d|%6.3f|\n", name, a, b, a * 1.0 / b);
        }
    }
}
