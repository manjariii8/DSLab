// Write a program to implement doubly linked list and display data of all nodes.
public class Program18 {
    class Node {
        int data;
        Node prev;
        Node next;

        public Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }
    Node head;
    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.prev = temp;
    }

    public void displayForward() {
        Node temp = head;
        System.out.print("Doubly Linked List (Forward): ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void displayBackward() {
        Node temp = head;

        if (temp == null)
            return;

        while (temp.next != null) {
            temp = temp.next;
        }

        System.out.print("Doubly Linked List (Backward): ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Program18 dll = new Program18();
        System.out.println("*****Program18 Output*****");

        dll.insert(10);
        dll.insert(20);
        dll.insert(30);
        dll.insert(40);

        dll.displayForward();
        dll.displayBackward();
    }
}
