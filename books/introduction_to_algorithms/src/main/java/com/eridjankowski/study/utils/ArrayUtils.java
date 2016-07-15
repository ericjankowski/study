package com.eridjankowski.study.utils;

public class ArrayUtils {
    public static void print(int[] array){
        System.out.print("[");
        for(int j=0;j<array.length; j++){
            System.out.print(array[j]);
            if(j!=array.length-1){
                System.out.print(",");
            }
        }
        System.out.println("]");
    }
}
