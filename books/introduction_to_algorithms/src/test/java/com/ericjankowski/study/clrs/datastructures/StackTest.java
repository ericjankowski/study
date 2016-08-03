package com.ericjankowski.study.clrs.datastructures;

import static org.junit.Assert.*;

import org.junit.Test;

public class StackTest {

    @Test
    public void newStackIsEmpty() {
        Stack stack = new Stack();
        
        assertTrue(stack.isEmpty());
    }
    
    @Test
    public void newStackWithOneElementIsNotEmpty() {
        Stack stack = new Stack();
        
        stack.push(2);
        
        assertFalse(stack.isEmpty());
    }
    
    @Test
    public void newStackWithAllElementsRemovedIsEmpty() {
        Stack stack = new Stack();
        
        stack.push(2);
        stack.pop();
        
        assertTrue(stack.isEmpty());
    }
    
    @Test
    public void popReturnsTheLastAddedValue() {
        Stack stack = new Stack();
        
        int expected = 2;
        stack.push(expected);
        int actual = stack.pop();
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void errorOccursWhenPopIsCalledOnAnEmptyStack() {
        Stack stack = new Stack();
        
        try{
            stack.pop();
            fail("An error should occur when pop() is called on an empty stack.");
        }catch(Exception e){
            assertTrue(e instanceof IllegalStateException);
            assertEquals("Underflow Error - the stack is empty", e.getMessage());
        }
    }
    
    @Test
    public void stackSizeIsDynamic(){
        Stack stack = new Stack();
        int size = 268435456;  //Max value that doesn't throw a Heap Space error
        for(int i = 0; i<size; i++){
            stack.push(i);
        }
        for(int i = size-1; i>=0; i--){
            assertEquals(i, stack.pop());
        }
    }
}
