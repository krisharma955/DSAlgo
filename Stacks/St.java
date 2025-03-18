package Stacks;

public class St {
    public static class StImplementation {
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
    public static void main(String[] args) {
        StImplementation s = new StImplementation();

        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println(s.Top());

        s.pop();

        System.out.println(s.size());

        s.printSt();
    }
}
