package main.queue;

/**
 * @author harinadh dasari
 */
public class SimpleQueImplementationProgramiz {

    private int[] elements;
    private int front;
    private int rear;

    public SimpleQueImplementationProgramiz(int size) {
        elements = new int[size];
        front = -1;
        rear = -1;
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public boolean isFull() {
        return rear == elements.length - 1;
    }

    public void enQueue(int data) {
        if (isFull()) {
            System.out.println("queue is full");
        } else {
            if (front == -1) {
                front = 0;
                rear = 0;
                elements[rear] = data;
            } else {
                elements[++rear] = data;
            }
        }
    }

    public int deQueue() {
        int element;

        if (isEmpty()) {
            System.out.println("queue is empty");
            return -1;
        } else {
            element = elements[front];
            if (front >= rear) {
                front = -1;
                rear = -1;
            } else {
                front++;
                System.out.println(element);
            }
        }
        return element;
    }

    public void display() {

        for (int i = front; i <= rear; i++) {
            System.out.print(elements[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        SimpleQueImplementationProgramiz q = new SimpleQueImplementationProgramiz(5);

        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        q.enQueue(4);
        q.enQueue(5);
        q.display();
        q.deQueue();
        q.display();
        q.deQueue();
        q.deQueue();
        q.display();
        q.enQueue(20);
        q.display();

    }
}
