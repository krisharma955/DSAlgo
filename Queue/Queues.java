package Queue;

public class Queues {
    public static class QImplementation {
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
        Node start;
        Node end;
        int size = 0;

        public void pushQLL(int x) {
            Node temp = new Node(x);
            
        }
    }

    public static void main(String[] args) {
        QImplementation Qu = new QImplementation();
        Qu.push(1);
        Qu.push(2);
        Qu.push(3);
        System.out.println(Qu.pop());
        System.out.println(Qu.top());
        System.out.println(Qu.size());


    }
}

