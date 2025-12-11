//Given sorted array arr with possibly some duplicates, the task is to find the first and last occurrences of an element x in the given array

import java.util.Scanner;

public class Program11 {
    public static int firstOccurrence(int[] arr, int x) {
        int low = 0, high = arr.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == x) {
                result = mid;
                high=mid-1; 
            }
            else if (arr[mid] > x)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return result;
    }

    public static int lastOccurrence(int[] arr, int x) {
        int low = 0, high = arr.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == x) {
                result = mid;
                low=mid+1;
            }
            else if (arr[mid] > x)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("*****Program11 Output*****");
        System.out.println("Given array is: ");
        int[] arr = {2, 4, 4, 4, 7, 9, 9};
        for(int x: arr){
            System.out.print(x+" ");
        }
        System.out.print("\nEnter an elemet from given array: ");
        int x = sc.nextInt();

        int first = firstOccurrence(arr, x);
        int last = lastOccurrence(arr, x);

        System.out.println("First occurrence of is at index: " + first);
        System.out.println("Last occurrence of is at index: " + last);
    }
}
