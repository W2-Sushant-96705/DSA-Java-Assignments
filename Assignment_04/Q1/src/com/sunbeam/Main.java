package com.sunbeam;

public class Main {
    public static void main(String[] args) {

        Q1 list = new Q1();

        
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);

        System.out.println("\n-- List after inserting at end --");
        list.display();

        
        list.insertAtBeginning(5);

        System.out.println("\n-- List after inserting at beginning --");
        list.display();

        
        System.out.println("\n-- Insert 25 after 20 --");
        list.insertAfter(20, 25);
        list.display();

        System.out.println("\n-- Insert 99 after 40 --");
        list.insertAfter(40, 99);
        list.display();

        
        System.out.println("\n-- Insert 50 after 100 (not in list) --");
        list.insertAfter(100, 50);
    }
}