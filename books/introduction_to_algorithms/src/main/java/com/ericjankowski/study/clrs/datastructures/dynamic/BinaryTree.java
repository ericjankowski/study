package com.ericjankowski.study.clrs.datastructures.dynamic;


public class BinaryTree {
    
    TreeNode root;
    int size = 0;
    
    public void insert(Object value){
        TreeNode node = new TreeNode(value);
        insert(node, root);
    }
    
    private void insert(TreeNode nodeToInsert, TreeNode treeNode) {
        if(treeNode == null){
            root = nodeToInsert;
            size++;
        }else if(treeNode.leftChild == null){
            treeNode.leftChild = nodeToInsert;
            nodeToInsert.parent = treeNode;
            size++;
        }else if(treeNode.rightChild == null){
            treeNode.rightChild = nodeToInsert;
            nodeToInsert.parent = treeNode;
            size++;
        }else{
            int coinFlip = (int)((Math.random()*100000000)%2);
            if(coinFlip == 0){
                insert(nodeToInsert, treeNode.leftChild);
            }else{
                insert(nodeToInsert, treeNode.rightChild);
            }
        }
    }
    
    public int size() {
        return size;
    }

    class TreeNode{
        Object key;
        TreeNode parent;
        TreeNode leftChild;
        TreeNode rightChild;
        
        TreeNode(Object key){
            this.key = key;
        }
        
        public String toString(){
            return key.toString();
        }
    }

    
}
