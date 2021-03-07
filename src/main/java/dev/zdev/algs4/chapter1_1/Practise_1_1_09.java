package dev.zdev.algs4.chapter1_1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Practise_1_1_09 {
    /**
     * 编写一段代码，将一个正整数 N 用二进制表示并转换为一个 String 类型的 s。
     *
     * @param args
     */
    public static void main(String[] args) {
        int N = StdIn.readInt();
        String s = "";
        do {
            s = (N & 1) + s;
            N >>>= 1;
        } while (N != 0);
        StdOut.println(s);
    }
}
