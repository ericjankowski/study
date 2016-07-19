package com.ericjankowski.study.clrs.sorting;

import com.ericjankowski.study.utils.ArrayUtils;

public class BinaryInsertionSort {

    public static void main(String[] args) {
        int array[] = new int[] { 2, 12, 4, 10, 34, 23, 3, 9, 7, 8, 5, 6, 1, 11 };
        sort(array);
        ArrayUtils.print(array);
        test(array);
    }


    public static void sort(int array[]) {
        for (int i = 0; i < array.length; ++i) {
            int low = 0;
            int high = i;
            while (low < high) {
                int middle = (low + high) / 2;
                if (array[i] >= array[middle])
                    low = middle + 1;
                else
                    high = middle;
            }
            int key = array[i];
            for (int j = i; j > low; --j) {
                array[j] = array[j-1];
            }
            array[low] = key;
        }
    }

    private static void test(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                throw new RuntimeException("The array is not properly sorted.");
            }
        }
    }
}
