package com.ericjankowski.study.clrs.datastructures;

public class Stack {
    private int [] array;
    private int top;
    
    public Stack(){
        array = new int[2];
        top = -1;
    }
    
    public boolean isEmpty(){
        return top == -1;
    }
    
    public void push(int value){
        if(top == array.length - 1){
            int [] largerArray = new int [array.length*2];
            for(int i = 0; i<array.length; i++){
                largerArray[i] = array[i];
            }
            array = largerArray;
        }
        top++;
        array[top] = value;
    }

    public int pop() {
        if(top == -1){
            throw new IllegalStateException("Underflow Error - the stack is empty");
        }else{
            top--;
            return array[top+1];
        }
    }
}
