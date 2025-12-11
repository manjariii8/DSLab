// Write a Program to implement addition and multiplication of two 2D arrays
public class Program3 {
    public static int[][] add(int[][] a, int[][] b) {
        int rows = a.length;
        int cols = a[0].length;

        int[][] sum = new int[rows][cols];

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                sum[i][j] = a[i][j] + b[i][j];

        return sum;
    }

    public static int[][] multiply(int[][] a, int[][] b) {
        int rows = a.length;
        int cols = b[0].length;
        int common = b.length;

        int[][] mul = new int[rows][cols];

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                for (int k = 0; k < common; k++)
                    mul[i][j] += a[i][k] * b[k][j];

        return mul;
    }

    public static void printMatrix(int[][] m) {
        for (int[] row : m) {
            for (int x : row){
                System.out.print(x + " ");
            }      
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] a = {{1, 2}, {3, 4}};
        System.out.println("*****Program3 Output*****");
        System.out.println("First Matrix: ");
        printMatrix(a);

        int[][] b = {{5, 6},{7, 8}};
        System.out.println("Second Matrix: ");
        printMatrix(b);

        System.out.println("\nAddition of matrices:");
        int[][] sum = add(a, b);
        printMatrix(sum);

        System.out.println("\nMultiplication of matrices:");
        int[][] mul = multiply(a, b);
        printMatrix(mul);
    }
}

