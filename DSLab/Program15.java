// Write a program to implement Quick Sort
public class Program15 {
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; 
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                // swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap arr[i+1] and pivot (arr[high])
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        System.out.println("*****Program15 Output*****");
        int[] arr = {64, 25, 12, 22, 11, 90, 55};
        System.out.println("Original Array: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }

        quickSort(arr, 0, arr.length - 1);

        System.out.println("\nSorted array:");
        for (int x : arr)
            System.out.print(x + " ");
    }
}
