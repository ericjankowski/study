package com.ericjankowski.study.clrs.datastructures.dynamic;

import static org.junit.Assert.*;

import org.junit.Test;

public class DoublyLinkedListTest {

    @Test
    public void insertIncreasesSize() {
        DoublyLinkedList list = new DoublyLinkedList();

        list.insert("Foo");

        assertEquals(1, list.size());
    }
    
    @Test
    public void insertIncreasesSizeCorrectly() {
        DoublyLinkedList list = new DoublyLinkedList();
        
        list.insert("Foo");
        list.insert("Bar");
        
        assertEquals(2, list.size());
        assertEquals("[Bar, Foo]", list.toString());
    }
    
    @Test
    public void deleteDecreasesSize() {
        DoublyLinkedList list = new DoublyLinkedList();
        
        list.insert("Foo");
        list.insert("Bar");
        
        list.delete("Bar");
        
        assertEquals(1, list.size());
        assertEquals("[Foo]", list.toString());
    }
    
    @Test
    public void deleteDecreasesSizeCorrectly() {
        DoublyLinkedList list = new DoublyLinkedList();
        
        list.insert("Foo");
        list.insert("Bar");
        list.insert("Baz");
        
        list.delete("Bar");
        
        assertEquals(2, list.size());
        assertEquals("[Baz, Foo]", list.toString());
    }
    
    @Test
    public void deleteDecreasesSizeCorrectlyWhenItemToBeDeletedIsAtTheEndOfTheList() {
        DoublyLinkedList list = new DoublyLinkedList();
        
        list.insert("Foo");
        list.insert("Bar");
        list.insert("Baz");
        
        list.delete("Foo");
        
        assertEquals(2, list.size());
        assertEquals("[Baz, Bar]", list.toString());
    }

}
