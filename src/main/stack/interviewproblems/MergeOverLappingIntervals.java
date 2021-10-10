package main.stack.interviewproblems;

import java.util.Arrays;
import java.util.Stack;

/**
 * @author harinadh dasari
 */
public class MergeOverLappingIntervals {

    public static void main(String[] args) {

        Pair p1 = new Pair(22, 28);
        Pair p2 = new Pair(1, 8);
        Pair p3 = new Pair(14, 19);
        Pair p4 = new Pair(27, 30);
        Pair p5 = new Pair(25, 27);
        Pair p6 = new Pair(5, 12);

        Pair[] pairs = {p1, p2, p3, p4, p5, p6};

        Arrays.sort(pairs);
        Stack<Pair> st = new Stack<>();
        Stack<Pair> result = new Stack<>();

        for (int i = 0; i < pairs.length; i++) {
            if (st.size() == 0) {
                st.push(pairs[i]);
            } else {
                Pair top = st.peek();
                if (pairs[i].getStart() > top.getEnd()) {
                    st.push(pairs[i]);
                } else {
                    top.end = Math.max(top.end, pairs[i].getEnd());
                }
            }
        }

        while (st.size() != 0) {
            result.push(st.pop());
        }

        while (result.size() > 0) {
            Pair rs = result.pop();
            System.out.println(rs.getStart() + " " + rs.getEnd());
        }
    }

    static class Pair implements Comparable<Pair> {

        private int start;
        private int end;

        @Override
        public String toString() {
            return "Pair{" +
                    "start=" + start +
                    ", end=" + end +
                    '}';
        }

        public Pair(int start, int end) {
            this.start = start;
            this.end = end;
        }

        public int getStart() {
            return start;
        }

        public void setStart(int start) {
            this.start = start;
        }

        public int getEnd() {
            return end;
        }

        public void setEnd(int end) {
            this.end = end;
        }

        @Override
        //this > other return +ve
        //this < other return -ve
        //this == other return 0;
        public int compareTo(Pair other) {
            if (this.getStart() > other.getStart()) {
                return 1;
            } else if (this.getStart() < other.getStart()) {
                return -1;
            } else {
                return 0;
            }
        }
    }
}
