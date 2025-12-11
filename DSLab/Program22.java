// Write a program to implement in-order, pre-order and post-order traversal of binary tree

public class Program22 {
    public static void preOrder(int[] arr, int index) {
        if (index >= arr.length) return;

        System.out.print(arr[index] + " ");        // root
        preOrder(arr, 2 * index + 1);              // left
        preOrder(arr, 2 * index + 2);              // right
    }

    public static void inOrder(int[] arr, int index) {
        if (index >= arr.length) return;

        inOrder(arr, 2 * index + 1);               // left
        System.out.print(arr[index] + " ");        // root
        inOrder(arr, 2 * index + 2);               // right
    }
    public static void postOrder(int[] arr, int index) {
        if (index >= arr.length) return;

        postOrder(arr, 2 * index + 1);             // left
        postOrder(arr, 2 * index + 2);             // right
        System.out.print(arr[index] + " ");        // root
    }

    public static void main(String[] args) {

        int[] tree = {1, 2, 3, 4, 5, 6, 7}; 
        System.out.println("*****Program22 Output*****");

        System.out.println("Pre-order Traversal:");
        preOrder(tree, 0);

        System.out.println("\nIn-order Traversal:");
        inOrder(tree, 0);

        System.out.println("\nPost-order Traversal:");
        postOrder(tree, 0);
    }
}
