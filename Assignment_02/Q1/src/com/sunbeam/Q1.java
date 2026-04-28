package com.sunbeam;

public class Q1 {

    private int[] arr;

    public Q1(int[] arr) {
        this.arr = arr.clone();
    }

    public int[] sortAscending() {
        int[] sorted = arr.clone();
        for (int i = 1; i < sorted.length; i++) {
            int key = sorted[i];
            int j = i - 1;
            while (j >= 0 && sorted[j] > key) {
                sorted[j + 1] = sorted[j];
                j--;
            }
            sorted[j + 1] = key;
        }
        return sorted;
    }

    public int[] sortDescending() {
        int[] sorted = arr.clone();
        for (int i = 1; i < sorted.length; i++) {
            int key = sorted[i];
            int j = i - 1;
            while (j >= 0 && sorted[j] < key) {
                sorted[j + 1] = sorted[j];
                j--;
            }
            sorted[j + 1] = key;
        }
        return sorted;
    }

    public void display() {
        System.out.print("Original array:   ");
        printArray(arr);

        System.out.print("Ascending order:  ");
        printArray(sortAscending());

        System.out.print("Descending order: ");
        printArray(sortDescending());
    }

    private void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}