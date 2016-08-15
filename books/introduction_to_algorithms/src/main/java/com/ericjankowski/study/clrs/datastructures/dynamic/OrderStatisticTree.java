package com.ericjankowski.study.clrs.datastructures.dynamic;

import com.ericjankowski.study.clrs.datastructures.dynamic.OrderStatisticTree.Node;


public class OrderStatisticTree {
    Node sentinel;
    Node root;
    
    public OrderStatisticTree(){
        sentinel = new Node(-987654321);
        sentinel.leftChild = null;
        sentinel.rightChild = null;
        sentinel.parent = null;
        sentinel.color = "BLACK";
        sentinel.size = 0;
        root = sentinel;
    }

    public void delete(Node target) {
        if(target.parent != sentinel){
            target.parent.size--;
        }
        Node y = null;
        Node x = null;
        if(target.leftChild == sentinel || target.rightChild == sentinel){
            y = target;
        }else{
            y = target.successor();
        }
        
        if (y.leftChild != sentinel){
            x = y.leftChild;
        }else{
            x = y.rightChild;
        }
        
        x.parent = y.parent;
        
        if(y.parent == sentinel){
            root = x;
        }else if(y == y.parent.leftChild){
            y.parent.leftChild = x;
        }else{
            y.parent.rightChild = x;
        }
        
        if(y != target){
            target.key = y.key;
        }
        
        if(y.color.equals("BLACK")){
            redBlackDeleteFixup(x);
        }
    }

    private void redBlackDeleteFixup(Node target) {
        Node w = null;
        while(target != root && target.color.equals("BLACK")){
            if(target == target.parent.leftChild){
                w = target.parent.rightChild;
                if(w.color.equals("RED")){
                    w.color = "BLACK";
                    target.parent.color = "RED";
                    leftRotate(target);
                    w = target.parent.rightChild;
                }
                if(w.leftChild.color.equals("BLACK") && w.rightChild.color.equals("BLACK")){
                    w.color = "RED";
                    target = target.parent;
                }else {
                    if(w.rightChild.color.equals("BLACK")){
                        w.leftChild.color = "BLACK";
                        w.color = "RED";
                        rightRotate(w);
                        w = target.parent.rightChild;
                    }
                    w.color = target.parent.color;
                    target.parent.color = "BLACK";
                    w.rightChild.color = "BLACK";
                    leftRotate(target.parent);
                    target = root;
                }
            } else {
                w = target.parent.leftChild;
                if(w.color.equals("RED")){
                    w.color = "BLACK";
                    target.parent.color = "RED";
                    rightRotate(target);
                    w = target.parent.leftChild;
                }
                if(w.rightChild.color.equals("BLACK") && w.leftChild.color.equals("BLACK")){
                    w.color = "RED";
                    target = target.parent;
                }else {
                    if(w.leftChild.color.equals("BLACK")){
                        w.rightChild.color = "BLACK";
                        w.color = "RED";
                        leftRotate(w);
                        w = target.parent.leftChild;
                    }
                    w.color = target.parent.color;
                    target.parent.color = "BLACK";
                    w.leftChild.color = "BLACK";
                    rightRotate(target.parent);
                    target = root;
                }
            }
        }
        target.color = "BLACK";
    }

    public void insert(int key) {
        Node target = new Node(key);
        Node y = sentinel;
        Node x = root;
        while(x != sentinel){
            x.size++;
            y = x;
            if(target.key < x.key){
                x = x.leftChild;
            }else{
                x = x.rightChild;
            }
        }
        target.parent = y;
        if(y == sentinel){
            root = target;
        }else if(target.key < y.key){
            y.leftChild = target;
        }else{
            y.rightChild = target;
        }
        target.leftChild = sentinel;
        target.rightChild = sentinel;
        target.color = "RED";
        balanceTree(target);
    }
    
    private void balanceTree(Node z) {
        while(z.parent.color.equals("RED")){
            if(z.parent == z.parent.parent.leftChild){
                Node y = z.parent.parent.rightChild;
                if(y.color.equals("RED")){
                    z.parent.color = "BLACK";
                    y.color = "BLACK";
                    z.parent.parent.color = "RED";
                    z = z.parent.parent;
                }else {
                    if(z == z.parent.rightChild){
                        z = z.parent;
                        leftRotate(z);
                    }
                    z.parent.color = "BLACK";
                    z.parent.parent.color = "RED";
                    rightRotate(z.parent.parent);
                }
            }else{
                Node y = z.parent.parent.leftChild;
                if(y.color.equals("RED")){
                    z.parent.color = "BLACK";
                    y.color = "BLACK";
                    z.parent.parent.color = "RED";
                    z = z.parent.parent;
                }else {
                    if(z == z.parent.leftChild){
                        z = z.parent;
                        rightRotate(z);
                    }
                    z.parent.color = "BLACK";
                    z.parent.parent.color = "RED";
                    leftRotate(z.parent.parent);
                }
            }
        }
        root.color = "BLACK";
    }

    public int minimum() {
        return minimum(root).key;
    }
    
    private Node minimum(Node tree){
        if(tree == sentinel){
            throw new IllegalStateException("An empty tree has no minimum.");
        }
        Node target = tree;
        while(target.leftChild != sentinel){
            target = target.leftChild;
        }
        return target;
    }
    
    public int maximum() {
        return maximum(root).key;
    }

    private Node maximum(Node tree){
        if(tree == sentinel){
            throw new IllegalStateException("An empty tree has no maximum.");
        }
        Node target = tree;
        while(target.rightChild != sentinel){
            target = target.rightChild;
        }
        return target;
    }

    public Node search(int key) {
        return search(key, root);
    }

    private Node search(int key, Node target) {
        if(target == sentinel){
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
        if(target != sentinel){
            return inOrderTreeWalk(target.leftChild) + target.key + "," + inOrderTreeWalk(target.rightChild);
        }else{
            return "";
        }
    }
    
    public void leftRotate(Node target){
        Node y = target.rightChild;
        target.rightChild = y.leftChild;
        
        if(y.leftChild != sentinel){
            y.leftChild.parent = target;
        }
        y.parent = target.parent;
        if(target.parent == sentinel){
            root = y;
        }else if(target.equals(target.parent.leftChild)){
            target.parent.leftChild = y;
        }else{
            target.parent.rightChild = y;
        }
        y.leftChild = target;
        target.parent = y;
        
        y.size = target.size;
        target.size = target.leftChild.size + target.rightChild.size + 1;
    }
    
    public void rightRotate(Node target){
        Node y = target.leftChild;
        target.leftChild = y.rightChild;
        
        if(y.rightChild != sentinel){
            y.rightChild.parent = target;
        }
        y.parent = target.parent;
        if(target.parent == sentinel){
            root = y;
        }else if(target.equals(target.parent.rightChild)){
            target.parent.rightChild = y;
        }else{
            target.parent.leftChild = y;
        }
        y.rightChild = target;
        target.parent = y;
        
        y.size = target.size;
        target.size = target.leftChild.size + target.rightChild.size + 1;
    }


    public class Node {
        int size;
        int key;
        Node parent;
        Node leftChild;
        Node rightChild;
        String color;

        public Node(int key) {
            this.key = key;
            this.size = 1;
        }

        public Node successor() {
            if(rightChild ==  sentinel && parent == sentinel){
                return null;
            }
            if(rightChild != sentinel){
                return minimum(rightChild);
            }else{
                Node x = this;
                Node y = this.parent;
                while(y != sentinel && x.equals(y.rightChild)){
                    x = y;
                    y = y.parent;
                }
                return y;
            }
        }

        public Node predecessor() {
            if(leftChild ==  sentinel && parent == sentinel){
                return null;
            }
            if(leftChild != sentinel){
                return maximum(leftChild);
            }else{
                Node x = this;
                Node y = this.parent;
                while(y != sentinel && x.equals(y.leftChild)){
                    x = y;
                    y = y.parent;
                }
                return y;
            }
        }
        
        public String toString(){
            return String.valueOf(key+"("+color+")");
        }
    }


    public Node select(Node node, int targetRank) {
        int currentRank = node.leftChild.size + 1;
        if(targetRank == currentRank){
            return node;
        }else if(targetRank < currentRank){
            return select(node.leftChild, targetRank);
        }else{
            return select(node.rightChild, targetRank-currentRank);
        }
    }

    public int rank(Node node) {
        int rank = node.leftChild.size + 1;
        Node y = node;
        while(y != root){
            if(y == y.parent.rightChild){
                rank = rank + y.parent.leftChild.size + 1;
            }
            y = y.parent;
        }
        return rank;
    }
}
