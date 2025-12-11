import java.util.Scanner;

public class Program17 {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    Node head;

    void insertAtStart(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        System.out.println("Inserted at start.");
    }
    void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            System.out.println("Inserted at end.");
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        System.out.println("Inserted at end.");
    }
    void insertAtPosition(int data, int pos) {
        if (pos <= 0) {
            System.out.println("Invalid position!");
            return;
        }
        if (pos == 1) {
            insertAtStart(data);
            return;
        }

        Node newNode = new Node(data);
        Node temp = head;

        for (int i = 1; temp != null && i < pos - 1; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Position out of range!");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
        System.out.println("Inserted at position " + pos + ".");
    }
    void deleteAtStart() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        head = head.next;
        System.out.println("Deleted from start.");
    }
    void deleteAtEnd() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        if (head.next == null) {
            head = null;
            System.out.println("Deleted last node.");
            return;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        System.out.println("Deleted from end.");
    }
    void deleteAtPosition(int pos) {
        if (head == null || pos <= 0) {
            System.out.println("Invalid position or empty list!");
            return;
        }
        if (pos == 1) {
            deleteAtStart();
            return;
        }

        Node temp = head;
        for (int i = 1; temp != null && i < pos - 1; i++) {
            temp = temp.next;
        }

        if (temp == null || temp.next == null) {
            System.out.println("Position out of range!");
            return;
        }

        temp.next = temp.next.next;
        System.out.println("Deleted at position " + pos + ".");
    }
    void search(int key) {
        Node temp = head;
        int pos = 1;
        while (temp != null) {
            if (temp.data == key) {
                System.out.println("Element found at position: " + pos);
                return;
            }
            temp = temp.next;
            pos++;
        }
        System.out.println("Element not found!");
    }
    void display() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        Node temp = head;
        System.out.print("Linked List: ");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Program17 list = new Program17();
        System.out.println("*****Program17 Output*****");

        while (true) {
            System.out.println("\n===== Singly Linked List Menu =====");
            System.out.println("1. Insert at Start");
            System.out.println("2. Insert at End");
            System.out.println("3. Insert at Position");
            System.out.println("4. Delete at Start");
            System.out.println("5. Delete at End");
            System.out.println("6. Delete at Position");
            System.out.println("7. Search Element");
            System.out.println("8. Display List");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value: ");
                    list.insertAtStart(sc.nextInt());
                    break;

                case 2:
                    System.out.print("Enter value: ");
                    list.insertAtEnd(sc.nextInt());
                    break;

                case 3:
                    System.out.print("Enter value: ");
                    int val = sc.nextInt();
                    System.out.print("Enter position: ");
                    int pos = sc.nextInt();
                    list.insertAtPosition(val, pos);
                    break;

                case 4:
                    list.deleteAtStart();
                    break;

                case 5:
                    list.deleteAtEnd();
                    break;

                case 6:
                    System.out.print("Enter position: ");
                    list.deleteAtPosition(sc.nextInt());
                    break;

                case 7:
                    System.out.print("Enter element to search: ");
                    list.search(sc.nextInt());
                    break;

                case 8:
                    list.display();
                    break;

                case 9:
                    System.out.println("Exiting...");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
