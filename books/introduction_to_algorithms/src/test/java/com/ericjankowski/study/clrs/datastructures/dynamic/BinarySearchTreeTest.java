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
    
    @Test
    public void searchSimpleFound() {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(5);
        
        boolean result = tree.search(5);
        
        assertTrue(result);
    }
    @Test
    public void searchSimpleNotFound() {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(5);
        
        boolean result = tree.search(4);
        
        assertFalse(result);
    }
    
    @Test
    public void searchTwoElementsFound() {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(5);
        tree.insert(2);
        
        boolean result = tree.search(2);
        
        assertTrue(result);
    }
    @Test
    public void searchTwoElementsNotFound() {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(5);
        tree.insert(2);
        
        boolean result = tree.search(4);
        
        assertFalse(result);
    }
    
    @Test
    public void searchFourElementsFound() {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(5);
        tree.insert(2);
        tree.insert(3);
        tree.insert(6);
        
        boolean result = tree.search(6);
        
        assertTrue(result);
    }
    @Test
    public void searchFourElementsNotFound() {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(5);
        tree.insert(2);
        tree.insert(3);
        tree.insert(6);
        
        boolean result = tree.search(7);
        
        assertFalse(result);
    }
    
    @Test
    public void searchEightElementsFound() {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(5);
        tree.insert(2);
        tree.insert(3);
        tree.insert(6);
        tree.insert(1);
        tree.insert(7);
        tree.insert(4);
        tree.insert(8);
        
        boolean result = tree.search(8);
        
        assertTrue(result);
    }
    @Test
    public void searchEightElementsNotFound() {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(5);
        tree.insert(2);
        tree.insert(3);
        tree.insert(6);
        tree.insert(1);
        tree.insert(7);
        tree.insert(4);
        tree.insert(8);
        
        boolean result = tree.search(9);
        
        assertFalse(result);
    }
    
    @Test
    public void minimumSimple() {
        BinarySearchTree tree = new BinarySearchTree();
        
        tree.insert(5);
        
        assertEquals(5, tree.minimum());
    }
    
    @Test
    public void minimumWithTwoElements() {
        BinarySearchTree tree = new BinarySearchTree();
        
        tree.insert(5);
        tree.insert(2);
        
        assertEquals(2, tree.minimum());
    }
    
    @Test
    public void minimumWithFourElements() {
        BinarySearchTree tree = new BinarySearchTree();
        
        tree.insert(5);
        tree.insert(2);
        tree.insert(3);
        tree.insert(6);
        
        assertEquals(2, tree.minimum());
    }
    @Test
    public void minimumWithEightElements() {
        BinarySearchTree tree = new BinarySearchTree();
        
        tree.insert(5);
        tree.insert(2);
        tree.insert(3);
        tree.insert(6);
        tree.insert(1);
        tree.insert(7);
        tree.insert(4);
        tree.insert(8);
        
        assertEquals(1, tree.minimum());
    }
    
    @Test
    public void cantCallMinimumOnAnEmptyTree(){
        BinarySearchTree tree = new BinarySearchTree();
        
        try{
            tree.minimum();
            fail("Should have thrown an illegal state exception.  An empty tree has no minimum.");
        }catch(Exception e){
            assertTrue(e instanceof IllegalStateException);
            assertEquals("An empty tree has no minimum.", e.getMessage());
        }
        
    }
    
    @Test
    public void maximumSimple() {
        BinarySearchTree tree = new BinarySearchTree();
        
        tree.insert(5);
        
        assertEquals(5, tree.maximum());
    }
    
    @Test
    public void maximumWithTwoElements() {
        BinarySearchTree tree = new BinarySearchTree();
        
        tree.insert(5);
        tree.insert(2);
        
        assertEquals(5, tree.maximum());
    }
    
    @Test
    public void maximumWithFourElements() {
        BinarySearchTree tree = new BinarySearchTree();
        
        tree.insert(5);
        tree.insert(2);
        tree.insert(3);
        tree.insert(6);
        
        assertEquals(6, tree.maximum());
    }
    @Test
    public void maximumWithEightElements() {
        BinarySearchTree tree = new BinarySearchTree();
        
        tree.insert(5);
        tree.insert(2);
        tree.insert(3);
        tree.insert(6);
        tree.insert(1);
        tree.insert(7);
        tree.insert(4);
        tree.insert(8);
        
        assertEquals(8, tree.maximum());
    }
    
    @Test
    public void cantCallMaximumOnAnEmptyTree(){
        BinarySearchTree tree = new BinarySearchTree();
        
        try{
            tree.maximum();
            fail("Should have thrown an illegal state exception.  An empty tree has no maximum.");
        }catch(Exception e){
            assertTrue(e instanceof IllegalStateException);
            assertEquals("An empty tree has no maximum.", e.getMessage());
        }
        
    }
}
