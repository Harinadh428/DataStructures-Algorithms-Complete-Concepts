package main.linkedlist;

/**
 * @author harinadh dasari
 */
public class LinkedList {
    private Node head;
    private Node tail;
    private int size;

    public void addLast(int data) {

        Node node = new Node(data, null);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            System.out.println("Add last method tail reference :" + tail.hashCode());
            tail.next = node;
            tail = node;
        }
        size++;
    }

    public void display() {
        if (head == null) {
            System.out.println("linked list is empty");
            return;
        }
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public int size() {
        System.out.println(size);
        return size;
    }

    public void printReference() {
        if (head != null && tail != null) {
            System.out.println("head +" + head.hashCode());
            System.out.println("tail +" + tail.hashCode());
        }
    }

    public void removeFirst() {
        if (size() == 0) {
            System.out.println("linked list is empty");
        } else if (head.next == null) {
            head = null;
            tail = null;
            size--;
        } else {
            head = head.next;
            size--;
        }
    }

    static class Node {
        int data;
        Node next;

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

    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();
        // linkedList.printReference();
        linkedList.addLast(10);
        // linkedList.printReference();
        linkedList.addLast(20);
        //linkedList.printReference();
        linkedList.addLast(30);
        //linkedList.printReference();
        linkedList.addLast(40);
        linkedList.display();
        linkedList.printReference();
        linkedList.size();
        linkedList.removeFirst();
        linkedList.display();
        linkedList.size();
        linkedList.removeFirst();
        linkedList.removeFirst();
        linkedList.removeFirst();
        linkedList.display();
        linkedList.size();
    }
}
