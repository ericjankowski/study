package com.ericjankowski.study.clrs.sorting;

import com.ericjankowski.study.utils.ArrayUtils;

public class BubbleSort {
    public static void main(String[] args) {
        int [] array = {2,4,8,6,1,5,3,7,9};
        for(int i = 0; i<array.length;i++){
            for(int j = array.length-1; j>i; j--){
                if(array[j] < array[j-1]){
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
        }
        ArrayUtils.print(array);
        ArrayUtils.verifySorted(array);
    }
}
