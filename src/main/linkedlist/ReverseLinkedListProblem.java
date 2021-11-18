package main.linkedlist;

/**
 * @author harinadh dasari
 */
public class ReverseLinkedListProblem {

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
        Node next;
        int data;

        public Node(int data, Node next) {
            this.next = next;
            this.data = data;
        }
    }

    public void reverseLinkedList() {
        int li = 0;
        int ri = size - 1;

        while (li < ri) {
            Node left = getNodeAt(li);
            Node right = getNodeAt(ri);

            int temp = left.data;
            left.data = right.data;
            right.data = temp;
            li++;
            ri--;
        }
    }

    private Node getNodeAt(int index) {
        if (index < 0 || index >= size) {
            System.out.println("invalid index");
            return null;
        }

        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public static void main(String[] args) {
        ReverseLinkedListProblem ll = new ReverseLinkedListProblem();
        ll.addLast(10);
        ll.addLast(20);
        ll.addLast(30);
        ll.addLast(40);
        ll.addLast(50);

        ll.display();
        ll.reverseLinkedList();
        ll.display();
    }
}
