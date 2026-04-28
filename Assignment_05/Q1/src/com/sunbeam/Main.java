package com.sunbeam;

public class Main {
    public static void main(String[] args) {

        Q1 tree = new Q1();

        
        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(20);
        tree.insert(40);
        tree.insert(60);
        tree.insert(80);

        
        tree.insert(50);

        
        System.out.println();
        tree.inorder();
        tree.preorder();
        tree.postorder();
    }
}