package dev.zdev.algs4.chapter1_1;

import java.util.Arrays;

import edu.princeton.cs.algs4.StdOut;

public class Practise_1_1_15 {
    public static void main(String[] args) {
        int a[] = { 1, 1, 1, 1, 1, 5, 5, 5, 5 };
        StdOut.println(Arrays.toString(histogram(a, 6)));
    }

    /**
     *
     * @param a 接受一个整型数组 a[]
     * @param M 一个整数 M
     * @return 一个大小为 M 的数组
     */
    private static int[] histogram(int[] a, int M) {
        int[] result = new int[M];
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= 0 && a[i] < M) {
                result[a[i]]++;
            }
        }
        return result;
    }
}
