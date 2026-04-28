package com.sunbeam;

public class Q1 {

    
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

   
    private Node head;

    
    public Q1() {
        this.head = null;
    }

    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        System.out.println(data + " inserted at the beginning.");
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            System.out.println(data + " inserted at the end.");
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        System.out.println(data + " inserted at the end.");
    }

    public void insertAfter(int givenData, int newData) {
        Node temp = head;

       
        while (temp != null) {
            if (temp.data == givenData) {
                Node newNode = new Node(newData);
                newNode.next = temp.next;  
                temp.next = newNode;       
                System.out.println(newData + " inserted after " + givenData + ".");
                return;
            }
            temp = temp.next;
        }
        System.out.println(givenData + " not found in the list.");
    }

    public void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node temp = head;
        System.out.print("HEAD -> ");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}