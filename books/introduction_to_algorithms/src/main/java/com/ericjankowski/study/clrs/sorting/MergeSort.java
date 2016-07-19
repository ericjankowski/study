package com.ericjankowski.study.clrs.sorting;

import com.ericjankowski.study.utils.ArrayUtils;

public class MergeSort {
    public static void main(String[] args) {
        int [] array = {4,10,8,1,2,5,3,9,7,6,10,1,9,2,8,3,7,4,6,5};
        mergeSort(array, 0, array.length-1);
        ArrayUtils.print(array);
    }
    
    public static void mergeSort(int [] array, int p, int r){
        if(p < r){
            int q = (p + r)/2;
            mergeSort(array, p, q);
            mergeSort(array, q + 1, r);
            merge(array, p, q, r);
        }
    }
    
    public static void merge(int [] array, int p, int q, int r){
        
        int [] left = new int[q-p+1];
        int [] right = new int[r-q];
        for(int i = 0;i<left.length; i++){
            left[i] = array[p+i];
        }
        for(int i = 0; i<right.length; i++){
            right[i] = array[q+i+1];
        }
        int leftIndex = 0;
        int rightIndex = 0;
        for(int i = p ; i <= r; i++){
            if(isFull(left, leftIndex) && isEmpty(right, rightIndex)){
                array[i] = left[leftIndex];
                leftIndex++;
            }else if(isFull(right, rightIndex) && isEmpty(left, leftIndex)){
                array[i] = right[rightIndex];
                rightIndex++;
            }else if(left[leftIndex] <= right[rightIndex]){
                array[i] = left[leftIndex];
                leftIndex++;
            }else{
                array[i] = right[rightIndex];
                rightIndex++;
            }
        }
    }


    private static boolean isEmpty(int[] array, int index) {
        return index >= array.length;
    }


    private static boolean isFull(int[] array, int index) {
        return index < array.length;
    }
}
