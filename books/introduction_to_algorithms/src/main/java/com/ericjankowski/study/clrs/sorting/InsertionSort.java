package com.ericjankowski.study.clrs.sorting;

import com.eridjankowski.study.utils.ArrayUtils;

public class InsertionSort {
    /*
     * Sorts an int array in place.  The first element is already sorted by itself.  We then compare the next element with all preceding elements an put it in its proper place, shifting the others in the array to make room.  The array between 0 and j is always sorted.
     * */
    public static void main(String[] args) {
        int[] array = {7,5,2,9,4,6,10,3,8,1};
        sortAscending(array);
        ArrayUtils.print(array);
        test(array);
        
        sortDescending(array);
        ArrayUtils.print(array);
    }
    
    private static void sortAscending(int[] array){
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
    
    private static void sortDescending(int[] array){
        for(int j=1; j<array.length; j++){
            int key = array[j];
            int i = j-1;
            while(i>=0 && array[i] < key){
                array[i +1] = array[i];
                i = i-1;
            }
            array[i+1] = key;
        }
    }
    
    private static void test(int[] array) {
        for(int i=1;i<array.length;i++){
            if(array[i] < array[i-1]){
                throw new RuntimeException("The array is not properly sorted.");
            }
        }
    }
}
