package com.ericjankowski.study.clrs.datastructures;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class QueueTest {

    @Test
    public void newQueueIsEmpty() {
        Queue queue = new Queue();
        
        assertEquals(0, queue.size());
    }
    
    @Test
    public void enqueueIncreasesSize() {
        Queue queue = new Queue();
        queue.enqueue(1);
        
        assertEquals(1, queue.size());
    }
    
    @Test
    public void dequeueReturnsFirstEnqueuedElement() {
        Queue queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(2);
        
        assertEquals(1, queue.dequeue());
        assertEquals(1, queue.size());
    }
    
    @Test
    public void dequeueReturnsFirstEnqueuedElementWithDynamicSize() {
        Queue queue = new Queue();
        for(int i = 0; i < 1000; i++){
            queue.enqueue(i);
        }
        for(int i = 0; i< 1000; i++){
            assertEquals(i, queue.dequeue());
        }
    }
    
    @Test
    @Ignore("Ignored for speed reasons")
    public void repeatedEnqueueAndDequeueOperationsDoNotCauseMemoryErrors(){
        Queue queue = new Queue();
        for(int i = 0; i < 2100000000; i++){
            queue.enqueue(i);
            queue.dequeue();
        }
        assertEquals(0, queue.size());
    }
    
    @Test
    public void cantDequeueFromAnEmptyQueye() {
        Queue queue = new Queue();
        
        try{
            queue.dequeue();
            fail("Should have thrown an IllegalStateException - Can't dequeue from an empty queue.");
        }catch(Exception e){
            assertTrue(e instanceof IllegalStateException);
            assertEquals("Dequeue from an empty queue not possible", e.getMessage());
        }
    }
}
