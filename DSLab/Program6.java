// Write a program to find fibonacci series till a number using iteration and recursion

import java.util.Scanner;

public class Program6 {
    public static void fibIter(int n) {
        int a = 0, b = 1;

        System.out.print("Fibonacci (Iteration): ");
        while (a <= n) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
        System.out.println();
    }

    public static int fibRec(int n) {
        if (n <= 1) {
            return n;
        }
        return fibRec(n - 1) + fibRec(n - 2);
    }

    public static void fibRecPrint(int limit) {
        System.out.print("Fibonacci (Recursion): ");
        int i = 0;
        while (true) {
            int f = fibRec(i);
            if (f > limit) {
                break;
            }
            System.out.print(f + " ");
            i++;
        }
        System.out.println();
    }

    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        System.out.println("*****Program6 Output*****");
        System.out.print("Enter a number:");
        int n= sc.nextInt();

        fibIter(n);
        fibRecPrint(n);
    }
}

