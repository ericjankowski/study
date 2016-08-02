package com.ericjankowski.study.clrs.selection;

import com.ericjankowski.study.utils.ArrayUtils;

public class RandomizedSelect {
    public static void main(String[] args) {
        int[] array = { 0,0,1,1,2,2,3,3};
        int orderStatistic = 8;
        System.out.println("The " + orderStatistic + "th order statistic of the array:");
        ArrayUtils.print(array);
        System.out.println("... is: " + randomizedSelect(array, 0, array.length-1, orderStatistic));

    }

    private static int randomizedSelect(int[] array, int p, int r, int i) {
        if(p == r){
            return array[p];
        }else{
            int q = randomizedPartition(array, p, r);
            int k = q-p+1;
            if(i == k){
                return array[q];
            }else if(i < k){
                return randomizedSelect(array, p, q-1, i);
            }else{
                return randomizedSelect(array, q+1, r, i-k);
            }
        }
    }
    
    private static int randomizedPartition(int[] array, int p, int r){
        int i = p + (int)(Math.random()*((r-p)+1));
        int temp = array[i];
        array[i] = array[r];
        array[r] = temp;
        return partition(array, p, r);
    }
    
    private static int partition(int[] array, int p, int r) {
        int value = array[r];
        int i = p-1;
        for(int j = p; j<=r-1; j++){
            if(array[j] <= value){
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp; 
            }
        }
        int temp = array[i+1];
        array[i+1] = array[r];
        array[r] = temp;
        return i+1;
    }
}
