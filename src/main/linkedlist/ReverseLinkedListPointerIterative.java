package main.linkedlist;

/**
 * @author harinadh dasari
 */
public class ReverseLinkedListPointerIterative {
    private Node head;
    private Node tail;
    private int size;

    public void addLast(int data) {
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

    static class Node {
        private int data;
        private Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    void reverse() {

        Node current = head;
        Node previous = null;

        while (current != null) {
            Node currNext = current.next;

            current.next = previous;

            previous = current;
            current = currNext;
        }

        Node temp = head;
        head = tail;
        tail = temp;
    }

    public static void main(String[] args) {

        ReverseLinkedListPointerIterative ll = new ReverseLinkedListPointerIterative();

        ll.addLast(10);
        ll.addLast(20);
        ll.addLast(30);
        ll.addLast(40);
        ll.addLast(50);

        ll.display();

        ll.reverse();
        ll.display();
    }
}
