package com.ericjankowski.study.clrs.sorting;

import com.ericjankowski.study.utils.ArrayUtils;

public class CountingSort {
    public static void main(String[] args) {
        int [] input = {1,1,1,1,1,5,3,4,2,9,8,7,6,1};
        int [] output = new int[input.length];
        countingSort(input, output, 10);
        ArrayUtils.print(output);
        

    }
    private static void countingSort(int [] input, int [] output, int k){
        int [] count = new int[k];
        for(int i = 0;i<input.length; i++){
            count[input[i]] = count[input[i]] +1;
        }
        for(int i = 1; i<k; i++){
            count[i] = count[i] + count[i-1];
        }
        for(int i = 0; i<input.length; i++){
            output[count[input[i]]-1] = input[i];
            count[input[i]]--;
        }
    }
}
