// Write a program to implement Circular Queue operations (push, pop, isEmpty, isFull) using array

class CircularQueue {
    int[] arr;
    int front, rear, size, capacity;

    public CircularQueue(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        front = -1;
        rear = -1;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

// Enqueue
    public void push(int data) {
        if (isFull()) {
            System.out.println("Queue is full! Cannot push ");
            return;
        }

        if (front == -1) front = 0; 

        rear = (rear + 1) % capacity;
        arr[rear] = data;
        size++;

        System.out.println("Pushed:"+data);
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Queue is empty! Cannot pop");
            return -1;
        }

        int removed = arr[front];
        front = (front + 1) % capacity;
        size--;

        if (size == 0) {
            front = -1;
            rear = -1;
        }

        return removed;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.print("Circular Queue elements: ");
        int i = front;
        for (int count = 0; count < size; count++) {
            System.out.print(arr[i] + " ");
            i = (i + 1) % capacity;
        }
        System.out.println();
    }
}

public class Program21 {
    public static void main(String[] args) {

        CircularQueue cq = new CircularQueue(5);
        System.out.println("*****Program21 Output*****");

        cq.push(10);
        cq.push(20);
        cq.push(30);
        cq.push(40);
        cq.push(50);

        cq.display();

        System.out.println("Popped: " + cq.pop());
        System.out.println("Popped: " + cq.pop());

        cq.display();

        System.out.println("isEmpty: " + cq.isEmpty());
        System.out.println("isFull: " + cq.isFull());
    }
}
