//Write a program to implement linear search in 2D-matrix
public class Program9 {
    public static boolean linearSearch(int[][] matrix, int key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("Element found at position: [" + i + ", " + j + "]");
                    return true;
                }
            }
        }
        System.out.println("Element not found.");
        return false;
    }

    public static void main(String[] args) {

        int[][] matrix = {
            {1, 4, 5},
            {7, 8, 9},
            {10, 11, 15}};
        System.out.println("*****Program9 Output*****");
        System.out.println("Given matrix is:");
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        linearSearch(matrix, 8);
    }
}

    

