package com.ericjankowski.study.clrs.datastructures.dynamic;



public class DoublyLinkedList {
    
    ListNode head;
    int size = 0;

    public void insert(Object value) {
        ListNode node = new ListNode(value);
        
        if(head == null){
            head = node;
        }else{
            node.next = head;
            head.previous = node;
            head = node;
        }
        size++;
    }
    
    public void delete(Object value){
        ListNode current = head;
        
        while(current != null){
            if (current.key == value){
                if(current.previous == null){
                    head = current.next;
                }else{
                    current.previous.next = current.next;
                }
                size--;
                break;
            }else{
                current = current.next;
            }
        }
    }

    public int size() {
        return size;
    }
    
    public String toString(){
        String result = "[";
        ListNode temp = head;
        while(temp.next != null){
            result = result + temp.toString() + ", ";
            temp = temp.next;
        }
        result = result + temp.toString() + "]";
        return result;
    }
    
    class ListNode{
        Object key;
        ListNode next;
        ListNode previous;
        
        ListNode(Object key){
            this.key = key;
        }
        
        public String toString(){
            return key.toString();
        }
    }

}
