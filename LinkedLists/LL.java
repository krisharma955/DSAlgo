package LinkedLists;

import java.util.HashSet;

public class LL {
    public static class Node {
        int data;
        Node next;
        public Node(int data) { 
            this.data = data;
            this.next = null;
        }
        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
    public static Node convertArr2LL(int arr[]) {
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i = 1; i<arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp; // mover = mover.next;
        }
        return head;
    } //O(N)
    public static int sizeOfLL(Node head) {
        int cnt = 0;
        Node temp = head;
        while(temp != null) {
            temp = temp.next;
            cnt++;
        }
        return cnt;
    }
    public static void printLL(Node head) {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data +" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static boolean searchLL(Node head, int key) {
        Node temp = head;
        while(temp != null) {
            if(temp.data == key) return true;
            temp = temp.next;
        }
        return false;
    }
    public static Node deleteHead(Node head) {
        if(head == null) return head;
        head = head.next;
        return head;
    }
    public static Node deleteTail(Node head) {
        if(head == null || head.next == null) return null;
        Node temp = head;
        while(temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }
    public static Node deleteNode(Node head, int k) {
        if(head == null) return head;
        if(k==1) {
            head = head.next;
            return head;
        }
        Node temp = head;
        Node prev = null;
        int i = 1;
        while(temp != null) {
            if(i == k) {
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
            i++;
        }
        return head;
    }
    public static Node deleteEle(Node head, int el) {
        if(head == null) return head;
        if(head.data == el) {
            head = head.next;
            return head;
        }
        Node temp = head;
        Node prev = null;
        while(temp != null) {
            if(temp.data == el) {
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }
    public static Node addHead(Node head) {
        Node newNode = new Node(8);
        if(head == null) {
            head = newNode;
            return head;
        }
        newNode.next = head;
        head = newNode;
        return head;
    }
    public static Node addTail(Node head) {
        Node newNode = new Node(5);
        if(head == null) {
            return newNode;
        }
        Node temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = null;
        return head;
    }
    public static Node addNode(Node head, int k) {
        Node newNode = new Node(9);
        if(head == null) {
            return newNode;
        }
        if(k==1) {
            newNode.next = head;
            return newNode;
        }
        Node temp = head;
        Node prev = null;
        int i = 1;
        while(temp != null) {
            if(i == k) {
                prev.next = newNode;
                newNode.next = temp;
                break;
            }
            prev = temp;
            temp = temp.next;
            i++;
        }
        return head;
    }
    public static Node insertBeforeX(Node head, int x, int ele) {
        Node newNode = new Node(ele);
        if(head == null) return null;
        if(head.data == x) {
            newNode.next = head;
            head = newNode;
            return head;
        }
        Node temp = head;
        Node prev = null;
        while(temp != null) {
            if(temp.data == x) {
                prev.next = newNode;
                newNode.next = temp;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }
    public static boolean detectCycle(Node head) { //Floyd CFA
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast) {
                return true;
            }
        }
        return false;
    }
    public static void removeCycle(Node head) {
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                cycle = true;
                break;
            }
        }
        if(cycle == false) return;
        Node prev = null;
        slow = head;
        while(slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        prev.next = null; //lastnode
    }
    public static Node midNode(Node head) {
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static int loopLength(Node head) {
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                int length = 1;
                Node temp = slow;
                while(temp.next != slow) {
                    length++;
                    temp = temp.next;
                }
                return length;
            }
        }
        return 0;
    }
    public static Node addTwoNumbers(Node h1, Node h2) {
        Node t1 = h1;
        Node t2 = h2;
        Node dummyNode = new Node(-1);
        Node curr = dummyNode;
        int carry = 0;
        while(t1 != null && t2 != null) {
            int sum = carry;
            if(t1 != null) sum += t1.data;
            if(t2 != null) sum += t2.data;
            Node newNode = new Node(sum%10);
            carry = sum/10;
            curr.next = newNode;
            curr = curr.next;
            if(t1 != null) t1 = t1.next;
            if(t2 != null) t2 = t2.next;
        }
        if(carry != 0) {
            Node newNode = new Node(carry);
            curr.next = newNode;
        }
        return dummyNode.next;
    } //TC - O(max(N1,N2)), SC - O(max(N1,N2)) N1 & N2 -> size of LL, this space is used to store ans, so technically no space is used
    public static Node intersectionNode(Node h1, Node h2) {
        //Hashing -> TC-O(N+M), SC-O(N)
        // HashSet<Node> map = new HashSet<>();
        // Node temp1 = h1;
        // while(temp1 != null) {
        //     map.add(temp1);
        //     temp1 = temp1.next;
        // }
        // Node temp2 = h2;
        // while(temp2 != null) {
        //     if(map.contains(temp2)) return temp2;
        //     temp2 = temp2.next;
        // }
        // return null;

        //TC- O(N+2M), SC-O(1)
        // int N = sizeOfLL(h1);
        // int M = sizeOfLL(h2);
        // int d = Math.abs(N-M);
        // Node temp1 = h1;
        // Node temp2 = h2;
        // while(d>0) {
        //     if(N>M) temp1 = temp1.next;
        //     else temp2 = temp2.next;
        //     d--;
        // }
        // while(temp1 != null && temp2 !=  null) {
        //     if(temp1 == temp2) {
        //         return temp1;
        //     }
        //     temp1 = temp1.next;
        //     temp2 = temp2.next;
        // }
        // return null;

        //TC-O(n+m),SC-O(1)
        Node temp1 = h1;
        Node temp2 = h2;
        while(temp1 != temp2) {
            if(temp1 == null) temp1 = h2;
            else temp1 = temp1.next;
            if(temp2 == null) temp2 = h1;
            else temp2 = temp2.next;
        }
        return temp1;
    }

    public static void main(String[] args) {
       int arr[] = {1,2,3,4};
       Node head = convertArr2LL(arr);
       //System.out.println(head.data);

       printLL(head);

       //System.out.println("size: "+ sizeOfLL(head));

       //System.out.println(searchLL(head, 20));

       //head = deleteHead(head);
       //printLL(head);

       //deleteTail(head);
       //printLL(head);

       //head = deleteNode(head, 2);
       //printLL(head);

       //head = deleteEle(head, 2);
       //printLL(head);

       //head = addNode(head, 3);
       //printLL(head);

       //head = insertBeforeX(head, 3, 10);
       //printLL(head);

       System.out.println(detectCycle(head));
    }
}
