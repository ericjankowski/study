package com.ericjankowski.study.clrs.datastructures.dynamic;

import static org.junit.Assert.*;

import org.junit.Test;

public class SinglyLinkedListTest {

    @Test
    public void insertIncreasesSize() {
        SinglyLinkedList list = new SinglyLinkedList();
        
        list.insert("Foo");
        
        assertEquals(1, list.size());
    }
    
    @Test
    public void insertIncreasesSizeCorrectly() {
        SinglyLinkedList list = new SinglyLinkedList();
        
        list.insert("Foo");
        list.insert("Bar");
        
        assertEquals(2, list.size());
        assertEquals("[Bar, Foo]", list.toString());
    }
    
    @Test
    public void deleteDecreasesSize() {
        SinglyLinkedList list = new SinglyLinkedList();
        
        list.insert("Foo");
        list.insert("Bar");
        
        list.delete("Bar");
        
        assertEquals(1, list.size());
        assertEquals("[Foo]", list.toString());
    }
    
    @Test
    public void deleteDecreasesSizeCorrectly() {
        SinglyLinkedList list = new SinglyLinkedList();
        
        list.insert("Foo");
        list.insert("Bar");
        list.insert("Baz");
        
        list.delete("Bar");
        
        assertEquals(2, list.size());
        assertEquals("[Baz, Foo]", list.toString());
    }

}
