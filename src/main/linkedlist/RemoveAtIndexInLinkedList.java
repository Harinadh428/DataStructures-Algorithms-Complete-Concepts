package main.linkedlist;

/**
 * @author harinadh dasari
 */
public class RemoveAtIndexInLinkedList<T> {
    private Node head;
    private Node tail;
    private int size;

    private void addLast(T data) {
        Node node = new Node(data, null);

        if (size == 0) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    class Node {
        private T data;
        private Node next;

        public Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    private void removeAt(int idx) {

        if (idx < 0 || idx >= size) {
            System.out.println("Invalid index");
        } else if (size == 1) {
            head = tail = null;
            size--;
        } else {
            Node temp = head;

            for (int i = 0; i < idx - 1; i++) {
                temp = temp.next;
            }
            Node nextBackup = temp.next.next;
            temp.next = nextBackup;
            size--;
        }
    }

    public static void main(String[] args) {
        RemoveAtIndexInLinkedList<String> ll = new RemoveAtIndexInLinkedList<>();
        ll.addLast("a");
        ll.addLast("b");
        ll.addLast("c");
        ll.addLast("d");

        ll.display();

        ll.removeAt(2);
        ll.display();
    }
}
