package com.ericjankowski.study.clrs.datastructures;

import com.ericjankowski.study.utils.ArrayUtils;

public class PriorityQueue {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,7,8,9};
        buildMaxHeap(array);
        heapIncreaseKey(array, 4, 20);
        for(int i = 0; i<array.length; i++){
            int max = heapExtractMaximum(array, array.length-i);
            System.out.println("Maximum: " + max);
            ArrayUtils.print(array);
        }
        
        
    }
    
    private static int heapExtractMaximum (int [] array, int heapSize){
        if(heapSize < 1){
            throw new IllegalArgumentException("Heap is empty, there is no valid maximum");
        }
        int max = array[0];
        array[0] = array[heapSize-1];
        maxHeapify(array, 0, heapSize-1);
        return max;
    }
    
    private static void maxHeapify(int [] array, int index, int heapSize){
        int largestIndex = index;
        int leftChildIndex = 2*index + 1;
        int rightChildIndex = 2*index + 2;
        if(leftChildIndex < heapSize && array[leftChildIndex] > array[index]){
            largestIndex = leftChildIndex;
        }
        if(rightChildIndex < heapSize && array[rightChildIndex] > array[largestIndex]){
            largestIndex = rightChildIndex;
        }
        if(largestIndex != index){
            int temp = array[largestIndex];
            array[largestIndex] = array[index];
            array[index] = temp;
            maxHeapify(array, largestIndex, heapSize);
        }
    }
    
    private static void buildMaxHeap(int [] array){
        for(int i = array.length / 2; i>= 0; i--){
            maxHeapify(array, i, array.length);
        }
    }
    
    private static void heapIncreaseKey(int [] array, int index, int key){
        if(key<array[index]){
            throw new IllegalArgumentException("New key is smaller than current key.  This is not a valid increase.");
        }
        array[index] = key;
        while(index > 0 && array[(int)(Math.floor((index-1)/2))] < array[index]){
            int temp = array[index];
            array[index] = array[(int)(Math.floor((index-1)/2))];
            array[(int)(Math.floor((index-1)/2))] = temp;
            index = (int)(Math.floor((index-1)/2));
        }
    }
}
