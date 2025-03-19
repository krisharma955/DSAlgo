package Queue;

import java.util.Stack;

public class Queues {
    public static class QArr {
        int size = 10;
        int Q[] = new int[size];
        int currsize;
        int start = -1;
        int end = -1;

        public void push(int x) { //O(1)
            if(currsize == size) System.out.println("Queue OverFlow");
            if(currsize == 0) {
                start = 0;
                end = 0;
            }
            else {
                end = (end+1) % size;
            }
            Q[end] = x;
            currsize += 1;
            System.out.println(x+ " pushed to queue");
        }

        public int top() { //O(1)
            if(currsize == 0) System.out.println("Empty Queue");
            return Q[start];
        }

        public int pop() { //O(1)
            if(currsize<=0) System.out.println("Empty Queue");
            int elem = Q[start];
            if(currsize == 1) {
                start = end = -1;
            }
            else {
                start = (start+1) % size;
            }
            currsize -= 1;
            System.out.println(Q[start]+ " popped out of queue");
            return elem;
        }

        public int size() { //O(1)
            return currsize;
        }
    }
    public static class QLL {
        public class Node {
            int data;
            Node next;
            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }
        Node front = null;
        Node rear = null;
        int size = 0;

        public void EnQueue(int x) {
            Node temp = new Node(x);
            if(front == null) {
                front = temp;
                rear = temp;
            }
            else {
                rear.next = temp;
                rear = temp;
            }
            System.out.println(x+ " inserted into Queue");
            size++;
        }

        public void DeQueue() {
            if(front == null) System.out.println("Queue is Empty");;
            Node temp = front;
            front = front.next;
            temp.next = null;
            System.out.println(front.data+ " removed from Queue");
            size--;
        }

        public boolean isEmpty() {
            return front==null;
        }

        public int peek() {
            if(isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            return front.data;
        }

        public int size() {
            return size;
        }

        public void printQ() {
            Node temp = front;
            while(temp != null) {
                System.out.print(temp.data +" ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
    public static class QSt {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        
        public void push(int x) { //O(2N)
            while(s1.empty() == false) {
                s2.push(s1.peek());
                s1.pop();
            }

            s1.push(x);
            System.out.println(x+ " pushed");

            while(s2.empty() == false) {
                s1.push(s2.peek());
                s2.pop();
            }
        }

        public int pop() {
            if(s1.empty()) {
                System.out.println("Stack is empty");
            }
            int val = s1.peek();
            s1.pop();
            return val;
        }

        public int top() {
            if(s1.empty()) {
                System.out.println("Stack is empty");
            }
            return s1.peek();
        }

        public int size() {
            return s1.size();
        }
    }
    public static class QstII { //push is O(1), top and pop are O(N)
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        public void push(int x) {
            s1.push(x);
            System.out.println(x+ " pushed");
        }

        public int pop() {
            if(!s2.empty()) {
                return s2.pop();
            }
            else {
                while(s1.size()>0) {
                    s2.push(s1.peek());
                    s1.pop();
                }
                return s2.pop();
            }
        }

        public int top() {
            if(!s2.empty()) return s2.peek();
            else {
                while(s1.size()>0) {
                    s2.push(s1.peek());
                    s1.pop();
                }
                return s2.peek();
            }
        }

        public int size() {
            return s1.size()+s2.size();
        }
    }
    
    public static void main(String[] args) {
        // QImplementation Qu = new QImplementation();
        // Qu.push(1);
        // Qu.push(2);
        // Qu.push(3);
        // System.out.println(Qu.pop());
        // System.out.println(Qu.top());
        // System.out.println(Qu.size());

        // QLL Q = new QLL();
        // Q.EnQueue(1);
        // Q.EnQueue(2);
        // Q.EnQueue(3);
        // Q.EnQueue(4);
        // Q.EnQueue(5);
        // Q.printQ();
        // Q.DeQueue();
        // Q.printQ();
        // System.out.println(Q.size());

        // QSt q = new QSt();
        // q.push(1);
        // q.push(2);
        // q.push(3);
        // q.push(4);
        // q.push(5);
        // System.out.println(q.top());
        // System.out.println(q.size());
        // q.pop();
        // q.pop();
        // System.out.println(q.size());

        QstII q = new QstII();
        q.push(1);
        q.push(2);
        q.push(3);
        q.push(4);
        q.push(5);
        System.out.println(q.size());
        System.out.println(q.pop());
        System.out.println(q.top());
        System.out.println(q.size());
    }
}

