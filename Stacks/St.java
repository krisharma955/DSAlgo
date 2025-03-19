package Stacks;
import java.util.*;

public class St {
    public static class StImplementation { //using Arrays
        int top = -1;
        int st[] = new int[10];

        public void push(int x) { //O(1)
            if(top >= st.length-1) {
                System.out.println("Stack OverFlow");
                return;
            }
            top = top + 1;
            st[top] = x;
            System.out.println(x+ " pushed to stack ");
        }

        public int Top() { //O(1)
            if(top == -1) {
                System.out.println("Empty Stack");
                return -1;
            }
            return st[top];
        }

        public void pop() { //O(1)
            if(top == -1) {
                System.out.println("Empty Stack");
            }
            System.out.println(st[top]+ " popped put of stack");
            top = top-1;
        }

        public int size() { //O(1)
            return top+1;
        }

        public void printSt() {
            for(int i = 0; i<st.length; i++) {
                System.out.println(st[i]);
            }
            System.out.println();
        }
    }
    public static class StLL {
        public class Node {
            int data;
            Node next;
            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }
        Node top;
        int size;

        // void stack() {
        //     this.top = null;
        //     this.size = 0;
        // }

        public void pushStLL(int x) {
            Node temp = new Node(x);
            temp.next = top;
            top = temp;
            System.out.println(x+ " pushed in the stack");
            size++;
        }

        public int pop() {
            if(top == null) return -1;
            int topData = top.data;
            Node temp = top;
            top = top.next;
            temp.next = null;
            size--;
            System.out.println(topData+ " popped out of Stack");
            return topData;
        }

        public int Top() {
            if(top == null) return -1;
            return top.data;
        }

        public int size() {
            return size;
        }

        public boolean isEmpty() {
            return top==null;
        }

        public void printStackLL() {
            Node temp = top;
            while(temp != null) {
                System.out.print(temp.data +" ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
    public static class StackQ {
        Queue<Integer> q = new LinkedList<>();
        
        public int top() {
            return q.peek();
        }

        public void push(int x) { //O(N)
            q.add(x);
            for(int i = 1; i<q.size(); i++) {
                q.add(top());
                q.remove();
            }
            System.out.println(x+ " pushed");
        }

        public int pop() { //O(1)
            return q.remove();
        }

        public int size() { //O(1)
            return q.size();
        }
    }

    public static void main(String[] args) {
        // StImplementation s = new StImplementation();
        // s.push(1);
        // s.push(2);
        // s.push(3);
        // System.out.println(s.Top());
        // s.pop();
        // System.out.println(s.size());
        // s.printSt();

        // StLL st = new StLL();
        // st.pushStLL(1);
        // st.pushStLL(2);
        // st.pushStLL(3);
        // st.printStackLL();
        // System.out.println(st.Top());
        // System.out.println(st.pop());
        // st.printStackLL();
        // System.out.println(st.isEmpty());
        // System.out.println(st.size());

        StackQ s = new StackQ();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        System.out.println("Top: " +s.top());
        System.out.println("Size: " +s.size());
        s.pop();
        s.pop();
        System.out.println("Size: " +s.size());
    }
}
