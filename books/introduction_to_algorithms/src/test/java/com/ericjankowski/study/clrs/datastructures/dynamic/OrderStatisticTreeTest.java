package com.ericjankowski.study.clrs.datastructures.dynamic;

import static org.junit.Assert.*;

import org.junit.Test;

import com.ericjankowski.study.clrs.datastructures.dynamic.OrderStatisticTree.Node;

public class OrderStatisticTreeTest {

    @Test
    public void toStringSimple() {
        OrderStatisticTree tree = new OrderStatisticTree();
        
        tree.insert(5);
        
        assertEquals("[5]", tree.toString());
        assertEquals(1, tree.root.size);
    }
    
    @Test
    public void toStringWithTwoElements() {
        OrderStatisticTree tree = new OrderStatisticTree();
        
        tree.insert(5);
        tree.insert(2);
        
        assertEquals("[2,5]", tree.toString());
        assertEquals(2, tree.root.size);
    }
    
    @Test
    public void toStringWithFourElements() {
        OrderStatisticTree tree = new OrderStatisticTree();
        
        tree.insert(5);
        tree.insert(2);
        tree.insert(3);
        tree.insert(6);
        
        assertEquals("[2,3,5,6]", tree.toString());
        assertEquals(4, tree.root.size);
    }
    @Test
    public void toStringWithEightElements() {
        OrderStatisticTree tree = new OrderStatisticTree();
        
        tree.insert(5);
        tree.insert(2);
        tree.insert(3);
        tree.insert(6);
        tree.insert(1);
        tree.insert(7);
        tree.insert(4);
        tree.insert(8);
        
        assertEquals("[1,2,3,4,5,6,7,8]", tree.toString());
        assertEquals(8, tree.root.size);
    }
    
    @Test
    public void searchSimpleFound() {
        OrderStatisticTree tree = new OrderStatisticTree();
        tree.insert(5);
        
        Node result = tree.search(5);
        
        assertEquals(5, result.key);
        assertEquals(1, result.size);
    }
    @Test
    public void searchSimpleNotFound() {
        OrderStatisticTree tree = new OrderStatisticTree();
        tree.insert(5);
        
        Node result = tree.search(4);
        
        assertNull(result);
    }
    
    @Test
    public void searchTwoElementsFound() {
        OrderStatisticTree tree = new OrderStatisticTree();
        tree.insert(5);
        tree.insert(2);
        
        Node result = tree.search(2);
        
        assertEquals(2, result.key);
        assertEquals(1, result.size);
    }
    @Test
    public void searchTwoElementsNotFound() {
        OrderStatisticTree tree = new OrderStatisticTree();
        tree.insert(5);
        tree.insert(2);
        
        Node result = tree.search(4);
        
        assertNull(result);
    }
    
    @Test
    public void searchFourElementsFound() {
        OrderStatisticTree tree = new OrderStatisticTree();
        tree.insert(5);
        tree.insert(2);
        tree.insert(3);
        tree.insert(6);
        
        Node result = tree.search(6);
        
        assertEquals(6, result.key);
        assertEquals(1, result.size);
    }
    @Test
    public void searchFourElementsNotFound() {
        OrderStatisticTree tree = new OrderStatisticTree();
        tree.insert(5);
        tree.insert(2);
        tree.insert(3);
        tree.insert(6);
        
        Node result = tree.search(7);
        
        assertNull(result);
    }
    
    @Test
    public void searchEightElementsFound() {
        OrderStatisticTree tree = new OrderStatisticTree();
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
        assertEquals(1, result.size);
    }
    @Test
    public void searchEightElementsNotFound() {
        OrderStatisticTree tree = new OrderStatisticTree();
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
        OrderStatisticTree tree = new OrderStatisticTree();
        
        tree.insert(5);
        
        assertEquals(5, tree.minimum());
        assertEquals(1, tree.root.size);
    }
    
    @Test
    public void minimumWithTwoElements() {
        OrderStatisticTree tree = new OrderStatisticTree();
        
        tree.insert(5);
        tree.insert(2);
        
        assertEquals(2, tree.minimum());
        assertEquals(2, tree.root.size);
    }
    
    @Test
    public void minimumWithFourElements() {
        OrderStatisticTree tree = new OrderStatisticTree();
        
        tree.insert(5);
        tree.insert(2);
        tree.insert(3);
        tree.insert(6);
        
        assertEquals(2, tree.minimum());
        assertEquals(4, tree.root.size);
    }
    @Test
    public void minimumWithEightElements() {
        OrderStatisticTree tree = new OrderStatisticTree();
        
        tree.insert(5);
        tree.insert(2);
        tree.insert(3);
        tree.insert(6);
        tree.insert(1);
        tree.insert(7);
        tree.insert(4);
        tree.insert(8);
        
        assertEquals(1, tree.minimum());
        assertEquals(8, tree.root.size);
    }
    
    @Test
    public void cantCallMinimumOnAnEmptyTree(){
        OrderStatisticTree tree = new OrderStatisticTree();
        
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
        OrderStatisticTree tree = new OrderStatisticTree();
        
        tree.insert(5);
        
        assertEquals(5, tree.maximum());
    }
    
    @Test
    public void maximumWithTwoElements() {
        OrderStatisticTree tree = new OrderStatisticTree();
        
        tree.insert(5);
        tree.insert(2);
        
        assertEquals(5, tree.maximum());
    }
    
    @Test
    public void maximumWithFourElements() {
        OrderStatisticTree tree = new OrderStatisticTree();
        
        tree.insert(5);
        tree.insert(2);
        tree.insert(3);
        tree.insert(6);
        
        assertEquals(6, tree.maximum());
    }
    @Test
    public void maximumWithEightElements() {
        OrderStatisticTree tree = new OrderStatisticTree();
        
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
        OrderStatisticTree tree = new OrderStatisticTree();
        
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
        OrderStatisticTree tree = new OrderStatisticTree();
        tree.insert(5);

        Node node = tree.root;
        
        assertNull(node.successor());
    }
    
    @Test
    public void successorWithTwoElements() {
        OrderStatisticTree tree = new OrderStatisticTree();
        tree.insert(5);
        tree.insert(2);
        Node node = tree.search(2); 
               
        assertEquals(5, node.successor().key);
    }
    
    @Test
    public void successorWithFourElements() {
        OrderStatisticTree tree = new OrderStatisticTree();
        tree.insert(5);
        tree.insert(2);
        tree.insert(3);
        tree.insert(6);
        Node node = tree.search(2); 
        
        assertEquals(3, node.successor().key);
    }

    @Test
    public void successorWithEightElements() {
        OrderStatisticTree tree = new OrderStatisticTree();
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
    }
    
    @Test
    public void treeOfSizeOneHasNoPredecessor() {
        OrderStatisticTree tree = new OrderStatisticTree();
        tree.insert(5);

        Node node = tree.root;
        
        assertNull(node.predecessor());
    }
    
    @Test
    public void predecessorWithTwoElements() {
        OrderStatisticTree tree = new OrderStatisticTree();
        tree.insert(5);
        tree.insert(2);
        Node node = tree.search(5); 
               
        assertEquals(2, node.predecessor().key);
    }
    
    @Test
    public void predecessorWithFourElements() {
        OrderStatisticTree tree = new OrderStatisticTree();
        tree.insert(5);
        tree.insert(2);
        tree.insert(3);
        tree.insert(6);
        Node node = tree.search(5); 
        
        assertEquals(3, node.predecessor().key);
    }

    @Test
    public void predecessorWithEightElements() {
        OrderStatisticTree tree = new OrderStatisticTree();
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
        OrderStatisticTree tree = new OrderStatisticTree();
        tree.insert(5);
        Node node = tree.root;
        tree.delete(node);
        
        assertEquals("[]", tree.toString());
    }
    
    @Test
    public void deleteWithTwoElements() {
        OrderStatisticTree tree = new OrderStatisticTree();
        tree.insert(5);
        tree.insert(2);
        Node node = tree.search(5);
        tree.delete(node);
               
        assertEquals(2, tree.root.key);
        assertEquals("[2]", tree.toString());
        assertEquals(1, tree.root.size);
    }
    
    @Test
    public void deleteWithFourElements() {
        OrderStatisticTree tree = new OrderStatisticTree();
        tree.insert(5);
        tree.insert(2);
        tree.insert(3);
        tree.insert(6);
        Node target = tree.search(2);
        tree.delete(target);
        
        assertEquals(3, tree.root.leftChild.key);
        assertEquals("[3,5,6]", tree.toString());
        assertEquals(3, tree.root.size);
    }

    @Test
    public void deleteWithEightElements() {
        OrderStatisticTree tree = new OrderStatisticTree();
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
        assertEquals(7, tree.root.size);
    }
    
    @Test
    public void findRankedOrderStatistic() {
        OrderStatisticTree tree = new OrderStatisticTree();
        tree.insert(5);
        tree.insert(2);
        tree.insert(3);
        tree.insert(6);
        tree.insert(1);
        tree.insert(7);
        tree.insert(4);
        tree.insert(8);
        Node one = tree.select(tree.root, 1);
        Node two = tree.select(tree.root, 2);
        Node three = tree.select(tree.root, 3);
        Node four = tree.select(tree.root, 4);
        Node five = tree.select(tree.root, 5);
        Node six = tree.select(tree.root, 6);
        Node seven = tree.select(tree.root, 7);
        Node eight = tree.select(tree.root, 8);
        
        assertEquals(1, one.key);
        assertEquals(2, two.key);
        assertEquals(3, three.key);
        assertEquals(4, four.key);
        assertEquals(5, five.key);
        assertEquals(6, six.key);
        assertEquals(7, seven.key);
        assertEquals(8, eight.key);
    }
    
    @Test
    public void findRankedRankOfANodeInTree() {
        OrderStatisticTree tree = new OrderStatisticTree();
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
        
        assertEquals(1, tree.rank(one));
        assertEquals(2, tree.rank(two));
        assertEquals(3, tree.rank(three));
        assertEquals(4, tree.rank(four));
        assertEquals(5, tree.rank(five));
        assertEquals(6, tree.rank(six));
        assertEquals(7, tree.rank(seven));
        assertEquals(8, tree.rank(eight));
    }
}    
