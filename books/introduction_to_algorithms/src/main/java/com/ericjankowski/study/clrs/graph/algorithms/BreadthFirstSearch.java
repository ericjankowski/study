package com.ericjankowski.study.clrs.graph.algorithms;

import com.ericjankowski.study.clrs.datastructures.dynamic.SinglyLinkedList;

public class BreadthFirstSearch {
    public static void main(String[] args) {
        SinglyLinkedList [] adjacencyList = {new SinglyLinkedList(), new SinglyLinkedList(), new SinglyLinkedList(), new SinglyLinkedList(), new SinglyLinkedList()};
        adjacencyList[0].insert(2);
        adjacencyList[0].insert(5);
        adjacencyList[1].insert(1);
        adjacencyList[1].insert(5);
        adjacencyList[1].insert(3);
        adjacencyList[1].insert(4);
        adjacencyList[2].insert(2);
        adjacencyList[2].insert(4);
        adjacencyList[3].insert(2);
        adjacencyList[3].insert(5);
        adjacencyList[3].insert(3);
        adjacencyList[4].insert(4);
        adjacencyList[4].insert(1);
        adjacencyList[4].insert(2);
    }
    
}
