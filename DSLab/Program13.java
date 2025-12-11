//Write a program to implement Selection Sort
public class Program13 {
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int minIndex = i;
            int j=i+1;
            while (j<n) {
                if (arr[j] < arr[minIndex]){
                    minIndex = j;
                }
                j++;
            }

            // Swap
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        
         System.out.println("*****Program13 Output*****");
        int[] arr = {64, 25, 11, 12, 22};
        System.out.println("Original array: ");
        for(int x:arr){
            System.out.print(x+" ");
        }

        selectionSort(arr);

        System.out.println("\nSorted array:");
        for (int x : arr)
            System.out.print(x + " ");
    }
}
