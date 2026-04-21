package com.sunbeam;

import java.util.Scanner;

public class  Q1{
	public static int linearSearch(int[] arr,int n,int key) {
		
		for (int i = 0; i < n ; i++) {
			if (key == arr[i])
				return i;
		}
		return -1;
	}
		
	public static int findLastIndex(int[] arr,int key) {
		for (int j = arr.length -1;j >= 0;j--) {
			if(arr[j] == key) {
				return j;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		
		int arr[] = {33,55,77,11,88,44,22,11,99,66};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter key to search : ");
		int key = sc.nextInt();
		int i = linearSearch(arr,arr.length,key);
		if (i == -1)
			System.out.println("Key not Found");
		else 
			System.out.println("Key found : " + key);
		
		
		int j = findLastIndex(arr, key);
		if(j == -1)
			System.out.println("Key not found");
		else
			System.out.println("last occurance at the index of :"+j);
	}

}
