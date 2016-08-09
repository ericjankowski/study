package com.ericjankowski.study.clrs.datastructures.dynamic;

import static org.junit.Assert.*;

import org.junit.Test;

public class BinarySearchTreeTest {

    @Test
    public void toStringSimple() {
        BinarySearchTree tree = new BinarySearchTree();
        
        tree.insert(5);
        
        assertEquals("[5]", tree.toString());
    }
    
    @Test
    public void toStringWithTwoElements() {
        BinarySearchTree tree = new BinarySearchTree();
        
        tree.insert(5);
        tree.insert(2);
        
        assertEquals("[2,5]", tree.toString());
    }
    
    @Test
    public void toStringWithFourElements() {
        BinarySearchTree tree = new BinarySearchTree();
        
        tree.insert(5);
        tree.insert(2);
        tree.insert(3);
        tree.insert(6);
        
        assertEquals("[2,3,5,6]", tree.toString());
    }
    @Test
    public void toStringWithEightElements() {
        BinarySearchTree tree = new BinarySearchTree();
        
        tree.insert(5);
        tree.insert(2);
        tree.insert(3);
        tree.insert(6);
        tree.insert(1);
        tree.insert(7);
        tree.insert(4);
        tree.insert(8);
        
        assertEquals("[1,2,3,4,5,6,7,8]", tree.toString());
    }
}
