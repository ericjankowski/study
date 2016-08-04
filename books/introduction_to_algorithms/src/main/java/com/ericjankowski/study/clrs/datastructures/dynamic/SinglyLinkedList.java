package com.ericjankowski.study.clrs.datastructures.dynamic;

public class SinglyLinkedList {
    
    ListNode head;
    int size = 0;

    public void insert(Object value) {
        ListNode node = new ListNode(value);
        
        if(head == null){
            head = node;
        }else{
            node.next = head;
            head = node;
        }
        size++;
        
    }
    
    public void delete(Object value){
        ListNode current = head;
        ListNode previous = null;
        
        while(current.next != null){
            if (current.key == value){
                if(previous == null){
                    head = current.next;
                }else{
                    previous.next = current.next;
                }
                size--;
                break;
            }else{
                previous = current;
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
        
        ListNode(Object key){
            this.key = key;
        }
        
        public String toString(){
            return key.toString();
        }
    }

}
