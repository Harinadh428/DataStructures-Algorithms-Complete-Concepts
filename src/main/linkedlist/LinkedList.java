package main.linkedlist;

/**
 * @author harinadh dasari
 */
public class LinkedList {
    private Node head;
    private Node tail;
    private int size = 0;

    public void addLast(int element) {
        Node node = new Node(element, null);
        if (size == 0) {
            head = node;
            tail = node;
            size++;
        } else {

            Node currentNode = tail;

            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = node;
            size++;
        }
    }

    public void displayLinkedList() {
        Node current = tail;
        while (current.next != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

        System.out.print(current.data + " ");
        System.out.println();
    }

    public boolean deleteFirst() {
        if (size == 1) {
            head = null;
            tail = null;
            return true;
        } else {
            head = new Node(tail.next.data, null);
            Node current = tail.next;
            tail = current;
        }
        return false;
    }

    public void addFirst(int element) {
        Node node = new Node(element, null);

        if (size == 0) {
            head = node;
            tail = node;
            size++;
        }
        node.next = tail;
        tail = node;
        head = new Node(tail.data, null);
        size++;

    }

    public void deleteLast() {
        Node current = tail;
        Node previous = null;

    }

    private int getFirst() {
        if (size == 0) {
            System.out.println("Linked list is empty");
            return -1;
        }
        return head.getData();
    }

    private int getLast() {
        if (size == 0) {
            System.out.println("Linked list is empty");
            return -1;
        }

        Node current = tail;
        while (current.next != null) {
            current = current.next;
            if (current.next == null) {
                return current.data;
            }
        }
        return -1;
    }

    private int getAt(int index) {
        if (size == 0) {
            System.out.println("Linked list is empty");
            return -1;
        } else if (index < 0 || index >= size) {
            System.out.println("Invalid index");
        } else {
            Node current = tail;
            int i = 0;
            while (i <= size) {
                current = current.next;
            }
            return current.data;
        }
        return -1;
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.addLast(10);
        linkedList.addLast(20);
        linkedList.addLast(30);
        linkedList.addLast(40);
        linkedList.addLast(50);
        linkedList.addLast(60);
        linkedList.addLast(70);
        linkedList.addLast(80);
        linkedList.addLast(90);

        linkedList.displayLinkedList();
        linkedList.deleteFirst();
        //  System.out.println();
        linkedList.displayLinkedList();
        // System.out.println();
        linkedList.addFirst(100);
        linkedList.displayLinkedList();
        //System.out.println();
        linkedList.deleteLast();
        linkedList.displayLinkedList();
        //System.out.println();
    }

    static class Node {
        private int data;
        private Node next;

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    ", next=" + next +
                    '}';
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}
