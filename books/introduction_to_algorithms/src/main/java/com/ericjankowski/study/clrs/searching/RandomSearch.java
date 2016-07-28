package com.ericjankowski.study.clrs.searching;

import com.ericjankowski.study.clrs.sorting.RandomizeInPlace;
import com.ericjankowski.study.utils.ArrayUtils;

public class RandomSearch {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,7,8,9};
        RandomizeInPlace.randomizeInPlace(array);
        int target = 11;
        int index = randomSearch(array, target);
        ArrayUtils.print(array);
        System.out.println(index);
    }

    private static int randomSearch(int[] array, int target) {
        int [] checked = new int[array.length];
        int allChecked = 0;
        while (allChecked < array.length){
            int candidateIndex = (int)(Math.random() * (array.length));
            if(array[candidateIndex] == target){
                return candidateIndex;
            }else if(checked[candidateIndex] == 0){
                allChecked++;
                checked[candidateIndex] = 1;
            }
        }
        return -1;
    }
}
