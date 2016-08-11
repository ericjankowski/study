package com.ericjankowski.study.clrs.datastructures.dynamic;


public class BinarySearchTree {

    Node root;

    public void delete(Node z) {
        Node x = null;
        Node y = null;
        if(z.leftChild == null || z.rightChild == null){
            y = z;
        }else{
            y = z.successor();
        }
        
        if(y.leftChild != null){
            x = y.leftChild;
        }else{
            x = y.rightChild;
        }
        
        if(x != null){
            x.parent = y.parent;
        }
        
        if(y.parent == null){
            root = x;
        }else if(y.equals(y.parent.leftChild)){
            y.parent.leftChild = x;
        }else{
            y.parent.rightChild = x;
        }
        
        if(!y.equals(z)){
            z.key = y.key;
        }
    }

    public void insert(int key) {
        Node node = new Node(key);
        if(root == null){
            root = node;
        }else{
            insert(node, root);
        }
    }
    
    private void insert(Node target, Node location){
        if(target.key <= location.key){
            if(location.leftChild == null){
                location.leftChild = target;
                target.parent = location;
            }else{
                insert(target, location.leftChild);
            }
        }else{
            if(location.rightChild == null){
                location.rightChild = target;
                target.parent = location;
            }else{
                insert(target, location.rightChild);
            }
        }
    }

    public int minimum() {
        return minimum(root).key;
    }
    
    private Node minimum(Node tree){
        if(tree == null){
            throw new IllegalStateException("An empty tree has no minimum.");
        }
        Node target = tree;
        while(target.leftChild != null){
            target = target.leftChild;
        }
        return target;
    }
    
    public int maximum() {
        return maximum(root).key;
    }

    private Node maximum(Node tree){
        if(tree == null){
            throw new IllegalStateException("An empty tree has no maximum.");
        }
        Node target = tree;
        while(target.rightChild != null){
            target = target.rightChild;
        }
        return target;
    }

    public Node search(int key) {
        return search(key, root);
    }

    private Node search(int key, Node target) {
        if(target == null){
            return null;
        }else if(key == target.key){
            return target;
        }else if(key < target.key){
            return search(key, target.leftChild);
        }else{
            return search(key, target.rightChild);
        }
    }

    public String toString() {
        String result = inOrderTreeWalk(root);
        result = result.length() > 0 ? result.substring(0, result.length()-1) : "" ;
        return "[" + result + "]";
    }

    private String inOrderTreeWalk(Node target) {
        if(target != null){
            return inOrderTreeWalk(target.leftChild) + target.key + "," + inOrderTreeWalk(target.rightChild);
        }else{
            return "";
        }
    }

    public class Node {

        int key;
        Node parent;
        Node leftChild;
        Node rightChild;

        public Node(int key) {
            this.key = key;
        }

        public Node successor() {
            if(rightChild ==  null && parent == null){
                return null;
            }
            if(rightChild != null){
                return minimum(rightChild);
            }else{
                Node x = this;
                Node y = this.parent;
                while(y != null && x.equals(y.rightChild)){
                    x = y;
                    y = y.parent;
                }
                return y;
            }
        }

        public Node predecessor() {
            if(leftChild ==  null && parent == null){
                return null;
            }
            if(leftChild != null){
                return maximum(leftChild);
            }else{
                Node x = this;
                Node y = this.parent;
                while(y != null && x.equals(y.leftChild)){
                    x = y;
                    y = y.parent;
                }
                return y;
            }
        }
    }
}
