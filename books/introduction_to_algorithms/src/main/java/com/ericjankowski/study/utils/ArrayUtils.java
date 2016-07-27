package com.ericjankowski.study.utils;

public class ArrayUtils {
    public static void print(int[] array) {
        System.out.print("[");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j]);
            if (j != array.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println("]");
    }

    public static void verifySorted(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                throw new RuntimeException("The array is not properly sorted.");
            }
        }
    }
}
