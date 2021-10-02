package main.cs.linkedlist;

/**
 * @author harinadh dasari
 */
public class LinkedList {

    private Node root;

    public void add(int e) {
        if (root == null) {
            root = new Node(e, null);
        } else {
            Node current = root;
            Node previous = null;
            while (current.next != null) {
                if(previous == null){

                }
                current = current.next;
            }
            current.next = new Node(e, null);
            root = current;
        }
    }

    public void displayData() {
        Node current = root;
        while (current.next != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        LinkedList ll = new LinkedList();
        ll.add(10);
        ll.add(20);
        ll.add(30);

        ll.displayData();
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
}
