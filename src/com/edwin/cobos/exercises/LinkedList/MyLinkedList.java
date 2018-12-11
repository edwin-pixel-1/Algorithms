package com.edwin.cobos.exercises.LinkedList;

public class MyLinkedList {

    private Node head;
    private Node tail;
    private int size;

    /**
     * Initialize your data structure here.
     */
    public MyLinkedList() {

    }

    /**
     * Get the value of the index-th node in the linked list. If the index is invalid, return -1.
     */
    public int get(int index) {
        if (head == null || index > size - 1)
            return -1;

        int count = 0;
        Node temp = head;
        while (temp != null) {
            if (count == index) {
                return temp.data;
            }
            temp = temp.next;
            count++;
        }
        return -1;
    }

    /**
     * Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.
     */
    public void addAtHead(int val) {
        if (head == null) {
            head = new Node(val);
            tail = head;
        } else {
            Node tmp = new Node(val);
            tmp.next = head;
            head.prev = tmp;
            head = tmp;
        }
        size++;
    }

    /**
     * Append a node of value val to the last element of the linked list.
     */
    public void addAtTail(int val) {
        if (tail == null) {
            tail = new Node(val);
            head = tail;
        } else {
            Node tmp = new Node(val);
            tail.next = tmp;
            tmp.prev = tail;
            tail = tmp;
        }
        size++;
    }

    /**
     * Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted.
     */
    public void addAtIndex(int index, int val) {
        if (index > size)
            return;

        if (index == size) {
            addAtTail(val);
            return;
        }

        if (index == 0) {
            addAtHead(val);
            return;
        }

        Node temp = head;
        int count = 0;
        while (temp != null) {
            if (count == index) {
                break;
            }
            temp = temp.next;
            count++;
        }
        if (temp != null) {
            Node newNode = new Node(val);
            newNode.next = temp;
            newNode.prev = temp.prev;
            temp.prev.next = newNode;
            temp.prev = newNode;
            size++;
        }
    }

    /**
     * Delete the index-th node in the linked list, if the index is valid.
     */
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) {
            return;
        }

        if (index == size - 1) {
            Node tmp = tail;
            tmp.prev.next = null;
            tail = tmp.prev;
            tmp.prev = null;
            size--;
            return;
        }

        if (index == 0) {
            Node tmp = head;
            tmp.next.prev = null;
            head = tmp.next;
            tmp.next = null;
        } else {

            Node temp = head;
            int count = 0;
            while (temp != null) {
                if (count == index) {
                    break;
                }
                temp = temp.next;
                count++;
            }

            Node tmp = temp.prev;
            temp.next.prev = tmp;
            tmp.next = temp.next;
            temp.next = null;
            temp.prev = null;
        }
        size--;
    }

    private class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    @Override
    public String toString() {
        String result = "";
        Node tmp = head;
        while (tmp != null) {
            result += tmp.data + ", ";
            tmp = tmp.next;
        }
        return result;
    }
}
