package com.ericjankowski.study.clrs.sorting;

import com.ericjankowski.study.utils.ArrayUtils;

public class SelectionSort {
    public static void main(String[] args) {
        int [] array = {9,4,6,5,7,10,6,8,7,9};
        sortAscending(array);
        ArrayUtils.print(array);
    }

    private static void sortAscending(int[] array) {
        for(int i = 0; i<array.length-1; i++){
            int smallestElement = array[i];
            int smallestIndex = -1;
            for(int j = i + 1;j<array.length; j++){
                if(array[j]<smallestElement){
                    smallestElement = array[j];
                    smallestIndex = j;
                }
            }
            if(smallestIndex>-1 && array[i]>smallestElement){
                array[smallestIndex] = array[i];
                array[i] = smallestElement;
            }
        }
        
    }
}
