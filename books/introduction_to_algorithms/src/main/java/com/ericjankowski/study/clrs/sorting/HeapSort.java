package com.ericjankowski.study.clrs.sorting;

import com.ericjankowski.study.utils.ArrayUtils;

public class HeapSort {
    public static void main(String[] args) {
        int[] array = {9,8,7,6,5,4,3,2,1};
        heapsort(array);
        ArrayUtils.print(array);
    }
    
    private static void heapsort(int [] array){
        buildMaxHeap(array);
        int heapsize = array.length;
        for(int i=array.length-1; i>=1; i--){
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            heapsize--;
            maxHeapify(array, 0, heapsize);
        }
    }
    
    private static void buildMaxHeap(int [] array){
        for(int i = array.length / 2; i>= 0; i--){
            maxHeapify(array, i, array.length);
        }
    }
    
    private static void buildMinHeap(int [] array){
        for(int i = array.length / 2; i>= 0; i--){
            minHeapify(array, i, array.length);
        }
    }
    
    /*
     * The function of  Max-Heapify is to let the value at array[index] "float down" in the max heap so that the subtree rooted at index becomes a max-heap.  
     * It is assumed that the binary trees rooted at left and right are max-heaps.
     */
    
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
    
    private static void minHeapify(int [] array, int index, int heapSize){
        int smallestIndex = index;
        int leftChildIndex = 2*index + 1;
        int rightChildIndex = 2*index + 2;
        if(leftChildIndex < heapSize && array[leftChildIndex] < array[index]){
            smallestIndex = leftChildIndex;
        }
        if(rightChildIndex < heapSize && array[rightChildIndex] < array[smallestIndex]){
            smallestIndex = rightChildIndex;
        }
        if(smallestIndex != index){
            int temp = array[smallestIndex];
            array[smallestIndex] = array[index];
            array[index] = temp;
            minHeapify(array, smallestIndex, heapSize);
        }
    }
    
    
}
