package LinkedLists;

public class LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) { //Constructor
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        //step1 -> Create new Node
        Node newNode = new Node(data);
        size++;
        if(head == null) { //if there is no node
            head = tail = newNode;
            return;
        }
        //step2 -> newNode next = head
        newNode.next = head; //link

        //step3 -> head = newNode
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if(head == null) { //empty linkedlist
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public static void printLL() {
        if(head == null) {
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data +"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void addMiddle(int idx, int data) {
        if(idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while(i < idx-1) {
            temp = temp.next;
            i++;
        }

        //i = idx-1; temp -> prev
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst() {
        if(size == 0) {
            System.out.println("LL is empty");
            return Integer.MAX_VALUE;
        }
        else if(size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data; 
        head = head.next; //the second node now becomes the head
        size--;
        return val;
    }

    public int removeLast() {
        if(size == 0) {
            System.out.println("LL is empty");
            return Integer.MAX_VALUE;
        }
        else if(size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        //prev node: idx = size-2
        Node prev = head;
        for(int i = 0; i<size-2; i++) { //loop to get prev
            prev = prev.next;
        }
        int val = tail.data;
        prev.next = null;
        prev = tail;
        size--;
        return val;
    }

    public int linearSearch(int key) { //TC-> O(N)
        Node temp = head;
        int index = 0;
        while(temp!=null) {
            if(temp.data == key) {
                return index;
            }
            temp = temp.next;
            index++;
        }
        return -1;
    }

    public int helper(Node head, int key) { //helper fxn for recursive search
        if(head == null) {
            return -1;
        }
        if(head.data == key) {
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx == -1) {
            return -1;
        }
        return idx+1;
    } //TC-> O(N), SC-> O(N) {bcz of call stack}
    public int recursiveSearch(int key) {
        return helper(head, key);
    }
    
    public void reverse() {
        Node prev = null;
        Node curr = head;
        Node next;
        while(curr!=null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    } //TC-> O(N), SC-> O(1)

    public void deleteNthfromEnd(int n) {
        if(head == null) {
            return;
        }
        // Calculate size
        int size = 0;
        Node temp = head;
        while(temp!=null) {
            temp = temp.next;
            size++;
        }

        if(n == size) { //Corner Case
            head = head.next; //removeFirst
            return;
        }

        //to reach (size-n)th idx {prev}
        int i = 1;
        int idxToFind = size-n; //finding prev node 
        Node prev = head;
        while(i < idxToFind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next; //prev ke next ka next
        return;
    } //TC-> O(L) {L is the no of nodes}, SC-> O(1) 

    //Slow-Fast Concept
    public Node findMid(Node head) { //helper
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next; //+1
            fast = fast.next.next; //+2
        }
        return slow; //slow is my midNode
    }

    public boolean isPalindrome() {
        if(head == null || head.next == null) { //empty LL or single element
            return true;
        }
        //step1 - find mid
        Node midNode = findMid(head);

        //step2 - reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev; //right half ka head
        Node left = head;

        //step3 - check left half & right half
        while(right != null) {
            if(left.data != right.data) {
                return false;
            }
            //updation
            left = left.next;
            right = right.next;
        }
        return true;
    } //TC-> O(N), SC->O(1)

    public static Node mid(Node head) {
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static Node mergeSort(Node head) { //O(nlogn)
        if(head == null || head.next == null) return head;
        Node mid = mid(head);
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);
        return merge(newLeft, newRight);
    }
    public static Node merge(Node leftHead, Node rightHead) {
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;
        while(leftHead != null && rightHead != null) {
            if(leftHead.data <= rightHead.data) {
                temp.next = leftHead;
                leftHead = leftHead.next;
            }
            else {
                temp.next = rightHead;
                rightHead = rightHead.next;
            }
            temp = temp.next;
        }
        while(leftHead!=null) {
            temp.next = leftHead;
            leftHead = leftHead.next;
            temp = temp.next;
        }
        while(rightHead!=null) {
            temp.next = rightHead;
            rightHead = rightHead.next;
            temp = temp.next;
        }
        Node finalHead = mergedLL.next;
        return finalHead;
    }
    public static void zigZag(Node head) {
        //find mid
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        //reverse 2nd half
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;
        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node  left = head;
        Node right = prev;
        Node nextL, nextR;

        //alt merge - zigZag merge
        while(left != null && right != null) {
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            left = nextL;
            right = nextR;
        }
    }
    public static void main(String args[]) {
        LinkedList ll = new LinkedList();
        // ll.addFirst(2);
        // ll.addFirst(1);
        // TC -> O(1) - while adding elements 
        // ll.addLast(4);
        // ll.addLast(5);
        // TC -> O(1) - while adding Last Elements

        // ll.addMiddle(2, 3);

        // ll.printLL();
        //System.out.println(ll.size);

        // ll.removeFirst();
        // ll.printLL();

        // ll.removeLast();
        // System.out.println(ll.removeLast());
        // ll.printLL();
        // System.out.println(ll.size);

        //System.out.println(ll.linearSearch(3));

        // System.out.println(ll.recursiveSearch(5));

        // ll.reverse();
        // ll.printLL();

        // ll.deleteNthfromEnd(3);
        // ll.printLL();

        // ll.addLast(1);
        // ll.addLast(2);
        // ll.addLast(1);
        // ll.addLast(1);
        // ll.addLast(2);
        // ll.addLast(1);
        // ll.printLL();
        // System.out.println(ll.isPalindrome());

        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        LinkedList.printLL();
        LinkedList.zigZag(head);
        LinkedList.printLL();
    } 
}
