//Write a program to find factorial of any number using iteration and recursion.

import java.util.Scanner;

public class Program5 {
    public static long factIter(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }

    public static long factRec(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factRec(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("*****Program5 Output*****");
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        System.out.println("Factorial of " + n + " using iteration: " + factIter(n));
        System.out.println("Factorial of " + n + " using recursion: " + factRec(n));
    }
}
