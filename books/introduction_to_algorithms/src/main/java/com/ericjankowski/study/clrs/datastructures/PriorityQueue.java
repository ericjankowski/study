package com.ericjankowski.study.clrs.datastructures;

import com.ericjankowski.study.utils.ArrayUtils;

public class PriorityQueue {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19};
        buildMaxHeap(array);
        for(int i = 0; i<array.length; i++){
            int max = heapExtractMaximum(array, array.length-i);
            System.out.println("Maximum: " + max);
            ArrayUtils.print(array);
        }
    }
    
    public static int heapMaximum (int [] array){
        return array[0];
    }
    
    public static int heapExtractMaximum (int [] array, int heapSize){
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
}
