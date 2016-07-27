package com.ericjankowski.study.clrs.sorting;

import com.ericjankowski.study.utils.ArrayUtils;

public class InsertionSort {
    /*
     * Sorts an int array in place.  The first element is already sorted by itself.  We then compare the next element with all preceding elements an put it in its proper place, shifting the others in the array to make room.  The array between 0 and j is always sorted.
     * 
     * The best case running time occurs when the array is already sorted.  When that occurs, the running time is linear with n - O(n) - see CLRS page 25
     * 
     * The worst case running time occurs when the array is sorted but the order is reversed from what is desired.  When that occurs, the running time is a quadratic function of n - O(n^2) - see CLRS page 25
     * */
    public static void main(String[] args) {
        int[] array = {7,5,2,9,4,6,10,3,8,1};
        sort(array);
        ArrayUtils.print(array);
        ArrayUtils.verifySorted(array);
    }
    
    private static void sort(int[] array){
        for(int j=1; j<array.length; j++){
            int key = array[j];
            int i = j-1;
            while(i>=0 && array[i] > key){
                array[i +1] = array[i];
                i = i-1;
            }
            array[i+1] = key;
        }
    }
}
