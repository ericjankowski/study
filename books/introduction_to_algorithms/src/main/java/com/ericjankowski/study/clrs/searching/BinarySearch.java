package com.ericjankowski.study.clrs.searching;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {1,13,14,54,65,67,78,89,90,123,345,456,567};
        int target = 15;
        
        int foundIndex = binarySearch(array, target, array.length-1, 0);
        System.out.println(foundIndex);
    }

    private static int binarySearch(int[] array, int target, int hi, int low) {
        if(low > hi){
            return -1;
        }
        
        int index = (hi + low)/2;
        if(array[index] == target){
            return (hi + low)/2;
        }else if(target < array[index]){
            return binarySearch(array, target, index-1, low);
        }else{
            return binarySearch(array, target, hi, index+1);
        }   
    }
}
