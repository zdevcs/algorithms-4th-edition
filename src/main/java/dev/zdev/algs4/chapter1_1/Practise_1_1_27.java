package dev.zdev.algs4.chapter1_1;

import edu.princeton.cs.algs4.StdOut;

public class Practise_1_1_27 {
    public static void main(String[] args) {
        StdOut.println("result: " + quickBinomial(100, 50, 0.25));
        StdOut.println("result: " + binomial(100, 50, 0.25) + ", count: " + count);
    }

    private static long count = 0;

    public static double binomial(int N, int k, double p) {
        count++;
        if (N == 0 && k == 0)
            return 1.0;
        if (N < 0 || k < 0)
            return 0.0;
        return (1.0 - p) * binomial(N - 1, k, p) + p * binomial(N - 1, k - 1, p);
    }

    private static double quickBinomial(int N, int k, double p) {
        double[][] binomialValue = new double[N + 1][k + 1];
        binomialValue[0][0] = 1.0;
        for (int i = 0; i <= N; i++) {
            binomialValue[i][0] = Math.pow(1.0 - p, i);
        }

        for (int i = 1; i < binomialValue.length; i++) {
            for (int j = 1; j < binomialValue[0].length; j++) {
                binomialValue[i][j] = (1.0 - p) * binomialValue[i - 1][j] + p * binomialValue[i - 1][j - 1];
            }
        }
        return binomialValue[N][k];
    }
}
