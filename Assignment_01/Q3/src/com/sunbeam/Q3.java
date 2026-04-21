package com.sunbeam;

import java.util.Scanner;

class Employee {

    int empId;     
    String name;    

    
    Employee(int empId, String name) {
        this.empId = empId;   
        this.name  = name;   
    }
}

public class Q3 {

    public static int searchById(Employee[] employees, int empId) {

        int comparisons = 0;

        for (int i = 0; i < employees.length; i++) {

            comparisons++;
            System.out.println("Comparison " + comparisons +
                               " : Checking empId = " + employees[i].empId);

            if (employees[i].empId == empId) {
                System.out.println(">> Employee FOUND!");
                System.out.println("   ID   : " + employees[i].empId);
                System.out.println("   Name : " + employees[i].name);
                System.out.println(">> Total comparisons : " + comparisons);
                return i; 
            }
        }

        System.out.println(">> Employee with ID " + empId + " NOT found!");
        System.out.println(">> Total comparisons : " + comparisons);
        return -1;
    }

    public static int searchByName(Employee[] employees, String name) {

        int comparisons = 0;

        for (int i = 0; i < employees.length; i++) {

            comparisons++;
            System.out.println("Comparison " + comparisons +
                               " : Checking name = " + employees[i].name);

           
            if (employees[i].name.equalsIgnoreCase(name)) {
                System.out.println(">> Employee FOUND!");
                System.out.println("   ID   : " + employees[i].empId);
                System.out.println("   Name : " + employees[i].name);
                System.out.println(">> Total comparisons : " + comparisons);
                return i; // return index where found
            }
        }

        System.out.println(">> Employee with name \"" + name + "\" NOT found!");
        System.out.println(">> Total comparisons : " + comparisons);
        return -1;
    }

    public static void main(String[] args) {

      
        Employee[] employees = {
            new Employee(101, "Amit"),
            new Employee(102, "Priya"),
            new Employee(103, "Ravi"),
            new Employee(104, "Sneha"),
            new Employee(105, "Rahul")
        };

        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter Employee ID to search : ");
        int searchId = sc.nextInt();

        System.out.println("\n===== SEARCH BY ID =====");
        searchById(employees, searchId);

        
        System.out.print("\nEnter Employee Name to search : ");
        String searchName = sc.next();

        System.out.println("\n===== SEARCH BY NAME =====");
        searchByName(employees, searchName);

        sc.close();
    }
}