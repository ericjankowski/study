package com.ericjankowski.study.clrs.datastructures.dynamic;

public class BinarySearchTree {

    private Node root;

    public void delete() {
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
        if(root == null){
            throw new IllegalStateException("An empty tree has no minimum.");
        }
        Node target = root;
        while(target.leftChild != null){
            target = target.leftChild;
        }
        return target.key;
    }

    public int maximum() {
        if(root == null){
            throw new IllegalStateException("An empty tree has no maximum.");
        }
        Node target = root;
        while(target.rightChild != null){
            target = target.rightChild;
        }
        return target.key;
    }

    public Node predecessor(Node target) {
        return null;
    }

    public Node successor(Node target) {
        return null;
    }

    public boolean search(int key) {
        return search(key, root);
    }

    private boolean search(int key, Node target) {
        if(target == null){
            return false;
        }else if(key == target.key){
            return true;
        }else if(key < target.key){
            return search(key, target.leftChild);
        }else{
            return search(key, target.rightChild);
        }
    }

    public String toString() {
        String result = inOrderTreeWalk(root);
        result = result.substring(0, result.length()-1);
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
    }
}
