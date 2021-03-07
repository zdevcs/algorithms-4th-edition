package dev.zdev.algs4.chapter1_1;

import edu.princeton.cs.algs4.StdOut;

public class Practise_1_1_18 {
    public static void main(String[] args) {
        StdOut.println(mystery(2, 25));
        StdOut.println(mystery(3, 11));
        StdOut.println(mystery2(2, 25));
        StdOut.println(mystery2(3, 11));
    }

    /**
     * 快速乘
     *
     * @param a
     * @param b
     * @return
     */
    public static int mystery(int a, int b) {
        if (b == 0) {
            return 0;
        }
        if (b % 2 == 0) {
            return mystery(a + a, b / 2);
        }
        return mystery(a + a, b / 2) + a;
    }

    /**
     * 快速幂
     *
     * @param a
     * @param b
     * @return
     */
    public static int mystery2(int a, int b) {
        if (b == 0) {
            return 1;
        }
        if (b % 2 == 0) {
            return mystery2(a * a, b / 2);
        }
        return mystery2(a * a, b / 2) * a;
    }
}
