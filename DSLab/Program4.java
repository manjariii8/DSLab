// Write a Program to find max and min of arrays
public class Program4 {
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int x : arr){
            if (x > max){
                max = x;
            }      
        }
        return max;
    }

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int x : arr){
            if (x < min){
                min = x;
            }  
        }    
        return min;
    }

    public static void main(String[] args) {

        int[] arr = {10, 25, 5, 89, 2, 45};
        System.out.println("*****Program4 Output*****");
        System.out.println("Given array is:");
        for(int x: arr){
            System.out.print(x+" ");
        }
        int max = findMax(arr);
        int min = findMin(arr);

        System.out.println("\nMaximum Element: " + max);
        System.out.println("Minimum Element: " + min);
    }
}
