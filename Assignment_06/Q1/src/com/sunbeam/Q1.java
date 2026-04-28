package com.sunbeam;

public class Q1 {

    
    private static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data  = data;
            this.left  = null;
            this.right = null;
        }
    }

   
    private Node root;

    public Q1() {
        this.root = null;
    }

    public void insert(int data) {
        root = insertRecursive(root, data);
        System.out.println(data + " inserted into BST.");
    }

    
    private Node insertRecursive(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }
        if (data < root.data) {
            root.left = insertRecursive(root.left, data);
        } else if (data > root.data) {
            root.right = insertRecursive(root.right, data);
        } else {
            System.out.println(data + " already exists. Duplicates not allowed.");
        }
        return root;
    }

    public void search(int key) {
        Node result = searchRecursive(root, key);
        if (result != null) {
            System.out.println(key + " FOUND in BST.");
        } else {
            System.out.println(key + " NOT FOUND in BST.");
        }
    }

   
    private Node searchRecursive(Node root, int key) {

        
        if (root == null) {
            return null;
        }

        if (root.data == key) {
            return root;
        }

        
        if (key < root.data) {
            return searchRecursive(root.left, key);
        }

        
        return searchRecursive(root.right, key);
    }

    public void inorder() {
        System.out.print("Inorder Traversal: ");
        inorderRecursive(root);
        System.out.println();
    }

    private void inorderRecursive(Node root) {
        if (root != null) {
            inorderRecursive(root.left);
            System.out.print(root.data + " ");
            inorderRecursive(root.right);
        }
    }
}