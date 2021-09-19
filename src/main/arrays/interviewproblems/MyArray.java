package main.arrays.interviewproblems;

import java.util.Arrays;

/**
 * @author harinadh dasari
 */
public class MyArray {
    int[] data;
    int index = 0;
    int initial_size = 10;

    MyArray() {
        data = new int[initial_size];
    }

    public void add(int e) {
        data[index++] = e;
    }

    public void display() {
        Arrays.stream(data).forEach(e -> {
            if (e != 0) {
                System.out.print(e + " ");
            }
        });
    }

    public void addAtSpecificIndex(int idx, int e) {

        for (int i = index; i > idx; i--) {
            data[i] = data[i - 1];
        }
        data[idx] = e;
        index++;
    }

    public void sortArray() {
        for (int i = data.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (data[j] > data[j + 1]) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
    }

    public void deleteEndElement() {
        data[index - 1] = data[index];
        index--;
    }

    public void deleteAtSpecificIndex(int idx) {

        for (int i = idx; i < index; i++) {
            data[i] = data[i + 1];
            index--;
        }
    }

    public void addFirst(int e) {
        for (int i = index; i > 0; i--) {
            data[i] = data[i - 1];
        }
        data[0] = e;
        index++;
    }

    public static void main(String[] args) {
        MyArray array = new MyArray();
        array.add(10);
        array.add(20);
        array.add(30);
        array.add(40);
        array.add(50);
        array.add(60);
        array.display();

        array.addFirst(100);
        System.out.println();
        array.display();

     /*   array.sortArray();
        System.out.println();*/
        array.display();
        System.out.println();
        array.addAtSpecificIndex(2, 800);
        array.display();
        System.out.println();
        array.deleteEndElement();
        array.display();
        System.out.println();
        array.deleteAtSpecificIndex(0);
        array.display();
    }
}
