package dev.zdev.algs4.chapter1_1;

public class Practise_1_1_26 {
    public static void main(String[] args) {
        var a = 3;
        var b = 2;
        var c = 1;
        var t = 0;

        if (a > b) {
            t = a;
            a = b;
            b = t;
        } // 如果 a > b，那么 a, b 交换，保证 a <= b

        if (a > c) {
            t = a;
            a = c;
            c = t;
        } // 如果 b >= a > c，那么 a, c 交换，保证 a <= c <= b

        if (b > c) {
            t = b;
            b = c;
            c = t;
        } // 如果 a <= c <= b，那么 b, c 交换，保证 a <= b <= c
    }
}
