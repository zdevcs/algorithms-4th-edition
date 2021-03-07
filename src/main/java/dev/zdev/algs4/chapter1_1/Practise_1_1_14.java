package dev.zdev.algs4.chapter1_1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Practise_1_1_14 {
    public static void main(String[] args) {
        try {
            StdOut.println(lg(StdIn.readInt()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    // log N中，N的取值范围为(0, +∞)

    /**
     *
     * @param N "log N中，N的取值范围为(0, +∞)"
     * @return Int type 返回不大于 logN 的最大整数
     * @throws Exception
     */
    private static int lg(int N) throws Exception {
        if (N <= 0)
            throw new Exception("log N中，N的取值范围为(0, +∞)");
        int count = 0;
        while (N != 1) {
            count++;
            N >>>= 1;
        }
        return count;
    }
}
