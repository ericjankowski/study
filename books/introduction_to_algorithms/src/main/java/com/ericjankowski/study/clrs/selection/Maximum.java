package com.ericjankowski.study.clrs.selection;

import com.ericjankowski.study.utils.ArrayUtils;

public class Maximum {
    public static void main(String[] args) {
        int [] array = {2,4,3,5,4,6,5,7,6,8,7,9,8,0};
        int min = maximum(array);
        System.out.println("The minimum elelment of array:");
        ArrayUtils.print(array);
        System.out.println("... is: " + min);
        
    }

    private static int maximum(int[] array) {
        int max = array[0];
        for (int i: array){
            if(i > max){
                max = i;
            }
        }
        return max;
    }
}
