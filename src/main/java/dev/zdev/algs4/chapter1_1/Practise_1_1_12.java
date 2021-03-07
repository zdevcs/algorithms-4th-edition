package dev.zdev.algs4.chapter1_1;

import edu.princeton.cs.algs4.StdOut;

public class Practise_1_1_12 {
    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = 9 - i;
        }
        for (int i = 0; i < 10; i++) {
            a[i] = a[a[i]];
        }
        // 这里书中的代码应该错了，题目中应该是打印 a[i] 的值
        for (int i = 0; i < 10; i++) {
            StdOut.println(i);
        }
        for (int i = 0; i < 10; i++) {
            StdOut.println(a[i]);
        }
    }
}
