// Write a program to implement Binary search in an array.

import java.util.Scanner;

public class Program10 {
    public static int binarySearch(int[] arr, int key) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key)
                return mid;
            else if (arr[mid] < key)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("*****Program10 Output*****");

        int[] arr = {10, 20, 30, 40, 50, 60, 70};
        System.out.println("Given array is: ");
        for(int x:arr) {
            System.out.print(x+" ");
        }
        System.out.print("\nEnter an element to  search: ");
        int key = sc.nextInt();

        int index = binarySearch(arr, key);

        if (index != -1)
            System.out.println("Element found at index: " + index);
        else
            System.out.println("Element not found.");
    }
}

