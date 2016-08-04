package com.ericjankowski.study.clrs.datastructures;

import com.ericjankowski.study.utils.ArrayUtils;

public class Queue {

    private int [] array;
    private int head;
    private int tail;
    
    public Queue(){
        array = new int[2];
        head = 0;
        tail = -1;
    }

    public int size() {
        if(head > tail){
            return 0;
        }else{
            return tail-head + 1;
        }
    }

    public void enqueue(int value) {
        int size = this.size();
        if(tail == array.length-1){
            int [] largerArray = new int [(size*2) + 2];
            if(size != 0){
                for(int i = 0; i<this.size(); i++){
                    largerArray[i] = array[head+i];
                }
            }
            head = 0;
            tail = size-1;
            array = largerArray;
        }
        tail++;
        array[tail] = value;
    }

    public int dequeue() {
        if(this.size() <= 0){
            throw new IllegalStateException("Dequeue from an empty queue not possible");
        }
        int result = array[head];
        head++;
        return result;
    }

    public void print() {
       ArrayUtils.print(array);
    }

}
