package com.ericjankowski.study.clrs.datastructures.dynamic;

import static org.junit.Assert.*;

import org.junit.Test;

import com.ericjankowski.study.clrs.datastructures.dynamic.BinarySearchTree.Node;

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
        
        Node result = tree.search(5);
        
        assertEquals(5, result.key);
    }
    @Test
    public void searchSimpleNotFound() {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(5);
        
        Node result = tree.search(4);
        
        assertNull(result);
    }
    
    @Test
    public void searchTwoElementsFound() {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(5);
        tree.insert(2);
        
        Node result = tree.search(2);
        
        assertEquals(2, result.key);
    }
    @Test
    public void searchTwoElementsNotFound() {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(5);
        tree.insert(2);
        
        Node result = tree.search(4);
        
        assertNull(result);
    }
    
    @Test
    public void searchFourElementsFound() {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(5);
        tree.insert(2);
        tree.insert(3);
        tree.insert(6);
        
        Node result = tree.search(6);
        
        assertEquals(6, result.key);
    }
    @Test
    public void searchFourElementsNotFound() {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(5);
        tree.insert(2);
        tree.insert(3);
        tree.insert(6);
        
        Node result = tree.search(7);
        
        assertNull(result);
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
        
        Node result = tree.search(8);
        
        assertEquals(8, result.key);
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
        
        Node result = tree.search(9);
        
        assertNull(result);
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
    
    @Test
    public void treeOfSizeOneHasNoSuccessor() {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(5);

        Node node = tree.root;
        
        assertNull(node.successor());
    }
    
    @Test
    public void successorWithTwoElements() {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(5);
        tree.insert(2);
        Node node = tree.search(2); 
               
        assertEquals(5, node.successor().key);
    }
    
    @Test
    public void successorWithFourElements() {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(5);
        tree.insert(2);
        tree.insert(3);
        tree.insert(6);
        Node node = tree.search(2); 
        
        assertEquals(3, node.successor().key);
    }

    @Test
    public void successorWithEightElements() {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(5);
        tree.insert(2);
        tree.insert(3);
        tree.insert(6);
        tree.insert(1);
        tree.insert(7);
        tree.insert(4);
        tree.insert(8);
        Node one = tree.search(1);
        Node two = tree.search(2);
        Node three = tree.search(3);
        Node four = tree.search(4);
        Node five = tree.search(5);
        Node six = tree.search(6);
        Node seven = tree.search(7);
        Node eight = tree.search(8);
        
        assertEquals(2, one.successor().key);
        assertEquals(3, two.successor().key);
        assertEquals(4, three.successor().key);
        assertEquals(5, four.successor().key);
        assertEquals(6, five.successor().key);
        assertEquals(7, six.successor().key);
        assertEquals(8, seven.successor().key);
        assertNull(eight.successor());
    }
    
    @Test
    public void treeOfSizeOneHasNoPredecessor() {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(5);

        Node node = tree.root;
        
        assertNull(node.predecessor());
    }
    
    @Test
    public void predecessorWithTwoElements() {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(5);
        tree.insert(2);
        Node node = tree.search(5); 
               
        assertEquals(2, node.predecessor().key);
    }
    
    @Test
    public void predecessorWithFourElements() {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(5);
        tree.insert(2);
        tree.insert(3);
        tree.insert(6);
        Node node = tree.search(5); 
        
        assertEquals(3, node.predecessor().key);
    }

    @Test
    public void predecessorWithEightElements() {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(5);
        tree.insert(2);
        tree.insert(3);
        tree.insert(6);
        tree.insert(1);
        tree.insert(7);
        tree.insert(4);
        tree.insert(8);
        Node one = tree.search(1);
        Node two = tree.search(2);
        Node three = tree.search(3);
        Node four = tree.search(4);
        Node five = tree.search(5);
        Node six = tree.search(6);
        Node seven = tree.search(7);
        Node eight = tree.search(8);
        
        assertNull(one.predecessor());
        assertEquals(1, two.predecessor().key);
        assertEquals(2, three.predecessor().key);
        assertEquals(3, four.predecessor().key);
        assertEquals(4, five.predecessor().key);
        assertEquals(5, six.predecessor().key);
        assertEquals(6, seven.predecessor().key);
        assertEquals(7, eight.predecessor().key);
    }
    
    @Test
    public void simpleDelete() {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(5);
        Node node = tree.root;
        tree.delete(node);
        
        assertEquals("[]", tree.toString());
    }
    
    @Test
    public void deleteWithTwoElements() {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(5);
        tree.insert(2);
        Node node = tree.search(5);
        tree.delete(node);
               
        assertEquals(2, tree.root.key);
        assertEquals("[2]", tree.toString());
    }
    
    @Test
    public void deleteWithFourElements() {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(5);
        tree.insert(2);
        tree.insert(3);
        tree.insert(6);
        Node target = tree.search(2);
        tree.delete(target);
        
        assertEquals(3, tree.root.leftChild.key);
        assertEquals("[3,5,6]", tree.toString());
    }

    @Test
    public void deleteWithEightElements() {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(5);
        tree.insert(2);
        tree.insert(3);
        tree.insert(6);
        tree.insert(1);
        tree.insert(7);
        tree.insert(4);
        tree.insert(8);
        Node target = tree.search(6);
        tree.delete(target);
        
        assertEquals(7, tree.root.rightChild.key);
        assertEquals("[1,2,3,4,5,7,8]", tree.toString());
    }
}
