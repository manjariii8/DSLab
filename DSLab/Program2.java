//Write a Program to implement reverse an arrays
public class Program2 {
    public static int[] reverse(int[] arr) {
        int[] rev = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            rev[i] = arr[arr.length - 1 - i];
        }
        return rev;
    }

    public static void main(String[] args) {

        int[] arr = { 10, 20, 30, 40, 50 };
        System.out.println("*****Program2 Output*****");
        System.out.println("Original array: ");
        for(int x: arr){
            System.out.print(x+" ");
        }

        int[] reversed = reverse(arr);

        System.out.println("\nReversed array:");
        for (int x : reversed)
            System.out.print(x + " ");
    }
}
