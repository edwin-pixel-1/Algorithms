package com.edwin.cobos.exercises.BinarySearchTree;

public class BinarySearchTree {

    Node root;

    public BinarySearchTree() {
        root = null;
    }

    class Node {
        int key;
        Node left;
        Node right;

        public Node(int item) {
            key = item;
            left = right = null;
        }
    }
}
