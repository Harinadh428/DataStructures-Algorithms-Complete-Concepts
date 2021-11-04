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

    public int getValueAt(int index) {
        if (index > size) {
            System.out.println("index is out of size");
            return -1;
        }
        if (size == 0) {
            System.out.println("linked list is empty");
            return -1;
        } else {
            Node temp = head;
            int id = 0;
            while (temp.next != null) {
                if (id == index) {
                    return temp.data;
                }
                temp = temp.next;
                id++;
            }
        }
        return -1;
    }

    public int getFirst() {
        if (size == 0) {
            System.out.println("linked list is empty");
            return -1;
        } else {
            return head.data;
        }
    }

    public int getLast() {
        if (size == 0) {
            System.out.println("linked list is empty");
            return -1;
        } else {
            return tail.data;
        }
    }

    static class Node {
        int data;
        Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

    }

    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();
        linkedList.addLast(10);
        linkedList.addLast(20);
        linkedList.addLast(30);
        linkedList.addLast(40);
        linkedList.display();
        linkedList.printReference();
        linkedList.size();
        linkedList.removeFirst();
        linkedList.display();
        linkedList.size();
        linkedList.display();
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
        linkedList.display();
        System.out.println(linkedList.getValueAt(1));
        linkedList.display();
    }
}
