//Write a Program to insert and delete an element in 1-D arrays
public class Program1 {

    public static int[] insert(int[] arr, int pos, int value) {
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < pos; i++)
            newArr[i] = arr[i];
        newArr[pos] = value;
        for (int i = pos; i < arr.length; i++)
            newArr[i + 1] = arr[i];
        return newArr;
    }

    public static int[] delete(int[] arr, int pos) {
        int[] newArr = new int[arr.length - 1];
        for (int i = 0; i < pos; i++){
            newArr[i] = arr[i];
        }   
        for (int i = pos + 1; i < arr.length; i++){
            newArr[i - 1] = arr[i];
        }
        return newArr;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        System.out.println("*****Program1 Output*****");
        System.out.println("Original Array:");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        arr = insert(arr, 2, 99); 
        System.out.println("\nAfter insertion:");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        arr = delete(arr, 3);      
        System.out.println("\nAfter deletion:");
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}

