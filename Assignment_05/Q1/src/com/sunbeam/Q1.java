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
        }
        
        else if (data > root.data) {
            root.right = insertRecursive(root.right, data);
        }
        
        else {
            System.out.println(data + " already exists in BST. Duplicates not allowed.");
        }

        return root;
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


    public void preorder() {
        System.out.print("Preorder Traversal: ");
        preorderRecursive(root);
        System.out.println();
    }

    private void preorderRecursive(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorderRecursive(root.left);
            preorderRecursive(root.right);
        }
    }


    public void postorder() {
        System.out.print("Postorder Traversal: ");
        postorderRecursive(root);
        System.out.println();
    }

    private void postorderRecursive(Node root) {
        if (root != null) {
            postorderRecursive(root.left);
            postorderRecursive(root.right);
            System.out.print(root.data + " ");
        }
    }
}