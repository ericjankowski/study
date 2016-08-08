package com.ericjankowski.study.clrs.datastructures.dynamic;

import static org.junit.Assert.*;

import org.junit.Test;

public class BinaryTreeTest {

    @Test
    public void insertIncreasesSize() {
        BinaryTree tree = new BinaryTree();

        tree.insert("Foo");

        assertEquals(1, tree.size());
    }
    
    @Test
    public void insertIncreasesSizeCorrectly() {
        BinaryTree tree = new BinaryTree();
        
        tree.insert("Foo");
        tree.insert("Bar");
        
        assertEquals(2, tree.size());
    }
    
    @Test
    public void insertIncreasesSizeAlright() {
        BinaryTree tree = new BinaryTree();
        
        tree.insert("Foo");
        tree.insert("Bar");
        tree.insert("Boo");
        tree.insert("Car");
        tree.insert("Moo");
        tree.insert("Mar");
        tree.insert("Sue");
        
        assertEquals(7, tree.size());
    }
}
