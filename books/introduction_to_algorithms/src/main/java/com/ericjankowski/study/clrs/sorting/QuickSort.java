package com.ericjankowski.study.clrs.sorting;

import com.ericjankowski.study.utils.ArrayUtils;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = {0,9,10,8,11,7,12,7,13,7,14,6,15,5,16,4,17,3,18,2,1};
        quicksort(array, 0, array.length-1);
        ArrayUtils.print(array);
    }
    
    public static void quicksort(int [] array, int p, int r){
        if(p<r){
            int q = partition(array, p, r);
            quicksort(array, p, q-1);
            quicksort(array, q+1, r);
        }
    }

    private static int partition(int[] array, int p, int r) {
        int value = array[r];
        int i = p-1;
        for(int j = p; j<=r-1; j++){
            if(array[j] <= value){
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp; 
            }
        }
        int temp = array[i+1];
        array[i+1] = array[r];
        array[r] = temp;
        return i+1;
    }
}
