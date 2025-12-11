import java.util.Scanner;

public class Program7 {
    public static void towerOfHanoi(int n, char src, char auxiliary, char dest) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + src + " to " + dest);
            return;
        }

        // Move n-1 disks from source to auxiliary
        towerOfHanoi(n - 1, src, dest, auxiliary);

        // Move the nth disk from source to destination
        System.out.println("Move disk " + n + " from " + src + " to " + dest);

        // Move the n-1 disks from auxiliary to destination
        towerOfHanoi(n - 1, auxiliary, src, dest);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("*****Program7 Output*****");

        System.out.print("Enter the number of disk:");
        int n = sc.nextInt();
        
        System.out.println("Tower of Hanoi with " + n + " disks:");
        towerOfHanoi(n, 'A', 'B', 'C');
    }
}

