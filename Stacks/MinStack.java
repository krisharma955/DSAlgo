package Stacks;

import java.util.Stack;

public class MinStack {
    public class Pair {
        int val, min;
        void pair(int val, int min) {
            this.val = val;
            this.min = min;
        }
    }

    public class minStack {
        Stack<Pair> st;
        public minStack() {
            st = new Stack<>();
        }
    }
    public static void main(String[] args) {
        
    }
}
