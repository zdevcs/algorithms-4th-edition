package dev.zdev.algs4.chapter1_2;

import edu.princeton.cs.algs4.Point2D;

public class Practise_1_2_01 {
    public static void main(String[] args) {
        // int length = Integer.parseInt(args[0]);
        int length = 10000000;
        Point2D[] points = new Point2D[length];
        for (int i = 0; i < length; i++) {
            points[i] = new Point2D(Math.random(), Math.random());
            points[i].draw();
        }
        if (length > 1) {
            double min = points[0].distanceTo(points[1]);
            for (int i = 0; i < length - 1; i++) {
                for (int j = i + 1; j < length; j++) {
                    if (points[i].distanceTo(points[j]) < min) {
                        min = points[i].distanceTo(points[j]);
                    }
                }

            }
            System.out.println("");
            System.out.println("Min distance: " + min);
        }
    }
}
