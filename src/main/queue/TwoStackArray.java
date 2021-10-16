package main.queue;

/**
 * @author harinadh dasari
 */
public class TwoStackArray {
    int[] data;
    private int tos1;
    private int tos2;

    public TwoStackArray() {
        data = new int[5];
        tos1 = -1;
        tos2 = data.length;
    }

    public void push1(int element) {
        if (tos2 == tos1 + 1) {
            System.out.println("stack overflow");
        } else {
            tos1++;
            data[tos1] = element;
        }
    }

    public void push2(int element) {
        if (tos2 == tos1 + 1) {
            System.out.println("stack overflow");
        } else {
            tos2--;
            data[tos2] = element;
        }
    }

    public int size1() {
        return tos1 + 1;
    }

    public int size2() {
        return data.length - tos2;
    }

    public int top1() {
        if (size1() == 0) {
            return -1;
        } else {
            return data[tos1];
        }
    }

    public int top2() {
        if (size2() == 0) {
            return -1;
        } else {
            return data[tos2];
        }
    }

    public int pop1() {
        if (size1() == 0) {
            return -1;
        } else {
            return data[tos1--];
        }
    }

    public int pop2() {
        if (size2() == 0) {
            return -1;
        } else {
            return data[tos2++];
        }
    }

    public static void main(String[] args) {
        TwoStackArray ts = new TwoStackArray();

        ts.push1(10);
        ts.push1(20);
        ts.push1(30);
        ts.push2(40);
        ts.push2(50);

        System.out.println(ts.size2());
        System.out.println(ts.size1());

        System.out.println(ts.top1());
        System.out.println(ts.top2());
        ts.pop1();
        ts.pop2();

        System.out.println(ts.top1());
        System.out.println(ts.top2());
    }
}
