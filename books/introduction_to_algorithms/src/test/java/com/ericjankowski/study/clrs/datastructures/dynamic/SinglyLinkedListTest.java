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

}
