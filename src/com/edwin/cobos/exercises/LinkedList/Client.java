package com.edwin.cobos.exercises.LinkedList;

public class Client {


    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.addAtHead(1);
        //linkedList.addAtTail(3);
        linkedList.addAtIndex(1, 2);  // linked list becomes 1->2->3
        System.out.println(linkedList.get(1));            // returns 2
        //linkedList.deleteAtIndex(1);  // now the linked list is 1->3
        System.out.println(linkedList.get(0));            // returns 3
        System.out.println(linkedList.get(2));

        //System.out.println(linkedList.toString());
    }
}
