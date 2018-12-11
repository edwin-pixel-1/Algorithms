package com.edwin.cobos.exercises.LinkedList;

public class Client {


    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();
        //linkedList.addAtHead(1);
        System.out.println("---");
        System.out.println(linkedList);
        System.out.println("---");

        linkedList.addAtHead(99);
        linkedList.addAtHead(11);
        linkedList.deleteAtIndex(2);
        linkedList.addAtTail(93);
        linkedList.addAtIndex(1,51);
        linkedList.addAtTail(25);
        linkedList.addAtHead(82);
        linkedList.addAtTail(97);
        linkedList.addAtTail(45);
        linkedList.addAtTail(43);
        linkedList.addAtHead(66);
        linkedList.addAtHead(0);
        linkedList.deleteAtIndex(9);
        linkedList.addAtHead(93);
        System.out.println(linkedList.get(3));
        linkedList.addAtHead(1);
        linkedList.addAtTail(33);
        linkedList.addAtIndex(3,82);
        linkedList.addAtIndex(4,36);
        System.out.println(linkedList.get(8));
        linkedList.addAtHead(42);
        linkedList.addAtHead(16);
        linkedList.addAtHead(67);
        linkedList.addAtIndex(5,97);
        linkedList.addAtTail(9);
        System.out.println(linkedList.get(19));
        linkedList.deleteAtIndex(12);
        linkedList.addAtTail(79);
        linkedList.addAtTail(43);
        linkedList.addAtTail(96);
        linkedList.addAtTail(52);
        System.out.println(linkedList.get(3));
        System.out.println(linkedList.get(4));
        linkedList.addAtHead(46);
        linkedList.addAtIndex(13,16);
        linkedList.addAtTail(32);
        linkedList.addAtTail(79);
        linkedList.addAtTail(28);
        linkedList.deleteAtIndex(20);
        linkedList.addAtIndex(10,70);
        linkedList.deleteAtIndex(27);
        linkedList.deleteAtIndex(14);
        linkedList.addAtHead(13);
        linkedList.addAtTail(81);
        linkedList.addAtTail(69);
        linkedList.addAtTail(26);
        linkedList.deleteAtIndex(10);
        linkedList.addAtTail(57);
        linkedList.deleteAtIndex(6);
        linkedList.addAtIndex(24,30);
        linkedList.addAtTail(89);
        linkedList.addAtTail(40);
        linkedList.addAtTail(14);
        linkedList.addAtIndex(23,92);
        linkedList.deleteAtIndex(19);
        linkedList.addAtTail(14);
        linkedList.addAtHead(32);
        linkedList.addAtTail(19);
        linkedList.addAtTail(91);
        linkedList.addAtTail(8);
        System.out.println(linkedList.get(4));
        linkedList.addAtTail(57);
        System.out.println(linkedList.get(23));
        System.out.println(linkedList.get(36));
        linkedList.deleteAtIndex(24);
        linkedList.addAtTail(61);
        linkedList.addAtTail(62);
        linkedList.addAtHead(56);
        linkedList.addAtIndex(18,28);
        linkedList.deleteAtIndex(17);
        linkedList.addAtHead(15);
        linkedList.addAtTail(91);
        linkedList.addAtTail(54);
        linkedList.addAtHead(87);
        linkedList.addAtHead(70);
        linkedList.addAtIndex(14,66);
        linkedList.addAtIndex(36,60);
        linkedList.addAtHead(97);
        linkedList.addAtTail(12);
        linkedList.addAtTail(13);
        linkedList.addAtTail(51);
        linkedList.addAtHead(45);
        linkedList.addAtHead(4);
        linkedList.addAtHead(98);
        linkedList.addAtTail(57);
        linkedList.addAtIndex(1,12);
        linkedList.addAtTail(89);
        linkedList.addAtIndex(49,41);
        System.out.println(linkedList.get(17));
        System.out.println(linkedList.get(27));
        linkedList.addAtTail(0);
        linkedList.addAtIndex(17,6);
        linkedList.addAtHead(12);
        linkedList.addAtHead(87);
        linkedList.addAtHead(78);
        linkedList.deleteAtIndex(5);
        linkedList.addAtHead(80);
        linkedList.addAtTail(34);
        linkedList.addAtHead(45);
        linkedList.addAtHead(7);
        linkedList.deleteAtIndex(58);


        //linkedList.addAtTail(3);
        //linkedList.deleteAtIndex(1);  // now the linked list is 1->3

        //System.out.println(linkedList.toString());
    }
}
