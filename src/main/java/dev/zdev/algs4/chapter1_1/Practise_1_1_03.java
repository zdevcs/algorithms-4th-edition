package dev.zdev.algs4.chapter1_1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Practise_1_1_03 {
    /**
     * 编写一个程序，从命令行得到的三个整数参数。如果它们都相等则打印equal,否则打印not equal。
     *
     * @param args
     */
    public static void main(String[] args) {
        int a = StdIn.readInt();
        int b = StdIn.readInt();
        int c = StdIn.readInt();
        StdOut.println(a == b && b == c ? "equal" : "not equal");
    }
}
