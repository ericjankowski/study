package com.ericjankowski.study.clrs.graph.algorithms;

import com.ericjankowski.study.clrs.datastructures.dynamic.SinglyLinkedList;

public class BreadthFirstSearch {
    public static void main(String[] args) {
        SinglyLinkedList [] graph = {new SinglyLinkedList(), new SinglyLinkedList(), new SinglyLinkedList(), new SinglyLinkedList(), new SinglyLinkedList()};
        graph[0].insert(2);
        graph[0].insert(5);
        graph[1].insert(1);
        graph[1].insert(5);
        graph[1].insert(3);
        graph[1].insert(4);
        graph[2].insert(2);
        graph[2].insert(4);
        graph[3].insert(2);
        graph[3].insert(5);
        graph[3].insert(3);
        graph[4].insert(4);
        graph[4].insert(1);
        graph[4].insert(2);
    }
    
}
