package main.queue;

/**
 * @author harinadh dasari
 */
public class NormalQuePepCode {
    private int[] data;
    private int front;
    private int size;

    public NormalQuePepCode(int queSize) {
        data = new int[queSize];
        front = 0;
        size = 0;
    }

    public int size() {
        return size;
    }

    public int peek() {

        return size == 0 ? -1 : data[front];
    }

    public int remove() {
        if (size == 0) {
            System.out.println("queue is empty");
            return -1;
        }
        int element = data[front];
        front = (front + 1) % data.length;
        size--;
        return element;
    }

    public void add(int e) {
        if (size == data.length) {
            System.out.println("queue over flow");
        } else {
            int rear = (front + size) % data.length;
            data[rear] = e;
            size++;
        }
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            int index = (front + i) % data.length;
            System.out.print(data[index] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        NormalQuePepCode q = new NormalQuePepCode(5);
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);

        q.display();
        q.remove();
        q.display();

        q.remove();
        q.remove();

        q.display();
        q.add(60);
        q.display();
        q.remove();
        q.display();
    }
}
