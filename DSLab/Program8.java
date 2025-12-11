//You are given an integer n. You have  to print all numbers from 1 to n using recursion only.

import java.util.Scanner;

public class Program8 {
    public static void printNumbers(int n) {
        if (n == 0){
            return;
        }  
        printNumbers(n - 1);   
        System.out.print(n + " "); 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("*****Program8 Output*****");
        System.out.print("Enter the number:");
        int n = sc.nextInt();  
        System.out.println("Printing numbers... ");
        printNumbers(n);
    }
}

