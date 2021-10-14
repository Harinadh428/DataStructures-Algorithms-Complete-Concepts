package main.queue;

/**
 * @author harinadh dasari
 */
public class DynamicQueuePep {
    private int[] elements;
    private int front;
    private int size;

    public static void main(String[] args) {
        DynamicQueuePep q = new DynamicQueuePep(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.display();
        q.remove();
        q.display();
    }

    public DynamicQueuePep(int queueSize) {
        elements = new int[queueSize];
        front = 0;
        size = 0;
    }

    public void add(int data) {
        if (size == elements.length) {
            int[] newQueue = new int[elements.length * 2];
            for (int i = 0; i < size; i++) {
                int index = (front + i) % elements.length;
                newQueue[i] = elements[index];
            }
            elements = newQueue;
            front = 0;
            int rear = (front + size) % elements.length;
            elements[rear] = data;
            size++;
        } else {
            int rear = (front + size) % elements.length;
            elements[rear] = data;
            size++;
        }
    }

    public int remove() {
        if (size == 0) {
            System.out.println("queue is empty");
            return -1;
        } else {
            int element = elements[front];
            front = (front + 1) % elements.length;
            size--;
            return element;
        }
    }

    public void display() {

        for (int i = 0; i < size; i++) {
            int index = (front + i) % elements.length;
            System.out.print(elements[index] + " ");
        }
        System.out.println();
    }
}