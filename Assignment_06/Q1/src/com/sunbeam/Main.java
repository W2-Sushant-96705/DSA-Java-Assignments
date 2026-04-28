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

        
        System.out.println();
        tree.inorder();

        
        System.out.println();
        tree.search(40);
        tree.search(60);
        tree.search(50);   
        tree.search(20);   
        tree.search(99);
        tree.search(10);
    }
}