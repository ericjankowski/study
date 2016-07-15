package com.ericjankowski.study.clrs.searching;

public class LinearSearch {
    public static void main(String[] args) {
        int [] array = {2,6,3,6,4,7,6,7,6,8,7,9};
        int target = 5;
        int index = search(array, target);
        test(array, target, index);
    }

    private static void test(int[] array, int target, int index) {
        if(index < 0){
            for(int i = 0; i< array.length; i++){
                if(array[i] == target){
                    throw new RuntimeException("Search failed to find value " + target + " at index " + i);
                }
            }
            System.out.println("The array does not contain value " + target);
        }else if(index < array.length && array[index] == target){
            System.out.println("Search correctly found value " + target + " at index " + index);
        }
    }

    private static int search(int[] array, int target) {
        for(int i = 0; i<array.length; i++){
            if(array[i] == target){
                return i;
            }
        }
        return -1;
    }
}
