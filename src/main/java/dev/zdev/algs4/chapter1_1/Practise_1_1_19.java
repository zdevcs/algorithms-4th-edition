package dev.zdev.algs4.chapter1_1;

import edu.princeton.cs.algs4.StdOut;

public class Practise_1_1_19 {
    public static void main(String[] args) {
        for (int N = 0; N < 100; N++) {
            StdOut.println(N + " " + NewF.F(N));
        }
    }

    public static long F(int N) {
        if (N == 0)
            return 0;
        if (N == 1)
            return 1;
        return F(N - 1) + F(N - 2);
    }

    public static class NewF {
        private static long[] Fib = new long[100];

        static {
            Fib[0] = 0;
            Fib[1] = 1;
        }

        public static long F(int N) {
            if (N < 2 || Fib[N] > 0)
                return Fib[N];
            return Fib[N] = F(N - 1) + F(N - 2);
        }
    }
}
