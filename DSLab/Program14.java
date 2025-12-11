// Write a program to implement Insertion Sort
public class Program14 {

    public static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {

        System.out.println("*****Program14 Output*****");

        int[] arr = {56, 95, 11, 12, 22};

        System.out.println("Original array:");
        for (int x : arr) {
            System.out.print(x + " ");
        }

        insertionSort(arr);

        System.out.println("\nSorted array:");
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
