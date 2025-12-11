// Write a program to implement Stack operations push, pop, isEmpty and isFull using array

class Stack {
    int[] arr;
    int tos;
    int size;

    Stack(int size) {
        this.size = size;
        arr = new int[size];
        tos = -1;
    }

    boolean isFull() {
        return tos == size - 1;
    }

    boolean isEmpty() {
        return tos == -1;
    }

    void push(int data) {
        if (isFull()) {
            System.out.println("Stack is full! Cannot push ");
            return;
        }
        arr[++tos] = data;
        System.out.println("Pushed:" + data);
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty! Cannot pop");
            return -1;
        }
        return arr[tos--];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }

        System.out.print("Stack elements: ");
        for (int i = 0; i <= tos; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

public class Program20 {
    public static void main(String[] args) {

        Stack st = new Stack(5);
        System.out.println("*****Program20 Output*****");

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        st.display();

        System.out.println("Popped: " + st.pop());
        System.out.println("Popped: " + st.pop());

        st.display();

        System.out.println("isEmpty: " + st.isEmpty());
        System.out.println("isFull: " + st.isFull());
    }
}
