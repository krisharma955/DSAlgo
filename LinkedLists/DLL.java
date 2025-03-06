package LinkedLists;

public class DLL {
    public static class Node {
        int data;
        Node next;
        Node back;
        public Node(int data, Node next, Node back) {
            this.data = data;
            this.next = next;
            this.back = back;
        }
        public Node(int data) {
            this.data = data;
            this.next = null;
            this.back = null;
        }
    }
    public static Node convertArr2DLL(int arr[]) {
        Node head = new Node(arr[0]); //the next and the back ptr are pointing towards null 
        Node prev = head;
        for(int i = 1; i<arr.length; i++) {
            Node temp = new Node(arr[i], null, prev);
            prev.next = temp;
            prev = prev.next;
        }
        return head;
    }
    public static void printDLL(Node head) {
        while(head != null) {
            System.out.print(head.data +" ");
            head = head.next;
        }
        System.out.println();
    }
    public static int sizeOfDLL(Node head) {
        int cnt = 0;
        while(head != null) {
            head = head.next;
            cnt++;
        }
        return cnt;
    }
    public static Node removeHead(Node head) {
        if(head == null || head.next == null) return null;
        Node prev = head;
        head = head.next;
        head.back = null;
        prev.next = null;
        return head;
    }
    public static Node removeTail(Node head) {
        if(head == null || head.next == null) return null;
        Node temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        Node prev = temp.back;
        temp.back = null;
        prev.next = null;
        return head;
    }
    public static Node deleteKth(Node head, int k) {
        if(head == null) return null;
        Node temp = head;
        int i = 1;
        while(temp != null) {
            if(i==k) break;
            temp = temp.next;
            i++;
        }
        Node prev = temp.back;
        Node forw = temp.next;
        if(prev == null && forw == null) {
            return null;
        }
        else if(prev == null) {
            return removeHead(head);
        }
        else if(forw == null) {
            return removeTail(head);
        }
        prev.next = forw;
        forw.back = prev;
        temp.next = null;
        temp.back = null;
        return head;
    }
    public static Node deleteNode(Node head, int ele) {
        if(head == null) return null;
        Node temp = head;
        while(temp != null) {
            if(temp.data==ele) break;
            else{
                temp = temp.next;
            }
        }
        Node prev = temp.back;
        Node forw = temp.next;
        if(prev == null && forw == null) {
            return null;
        }
        else if(prev == null) {
            return removeHead(head);
        }
        else if(forw == null) {
            return removeTail(head);
        }
        prev.next = forw;
        forw.back = prev;
        temp.next = null;
        temp.back = null;
        return head;
    }
    public static void deleteNodeII(Node node) { //head node will not be given
        Node prev = node.back;
        Node forw = node.next;
        if(forw == null) {
            prev.next = null;
            node.back = null;
            return;
        }
        prev.next = forw;
        forw.back = prev;
        node.next = null;
        node.back = null;
    } //not deleting head from this fxn
    public static Node insertBeforeHead(Node head, int data) {
        Node newNode = new Node(data, head, null);
        head.back = newNode;
        return newNode;
    }
    public static Node insertBeforeTail(Node head, int data) {
        if(head.next == null) { //single element
            return insertBeforeHead(head, data);
        }
        Node temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        Node prev = temp.back;
        Node newNode = new Node(data, temp, prev);
        prev.next = newNode;
        temp.back = newNode;
        return head;
    }
    public static Node insertBeforeKthEle(Node head, int k, int data) {
        if(k==1) {
            return insertBeforeHead(head, data);
        }
        Node temp = head;
        while(temp.data != k) {
            temp = temp.next;
        }
        if(temp.next == null) {
            return insertBeforeTail(head, data);
        }
        Node prev = temp.back;
        Node newNode = new Node(data, temp, prev);
        prev.next = newNode;
        temp.back = newNode;
        return head;
    }
    public static Node insertBeforeKthNode(Node head, int k, int data) {
        if(k==1) return insertBeforeHead(head, data);
        Node temp = head;
        int i = 1;
        while(temp != null) {
            if(i==k) {
                break;
            }
            temp = temp.next;
            i++;
        }
        if(temp.next == null) {
            return insertBeforeTail(head, data);
        }
        Node prev = temp.back;
        Node newNode = new Node(data, temp, prev);
        prev.next = newNode;
        temp.back = newNode;
        return head;
    }
    public static void insertBeforeNode(Node node, int data) {
        Node prev = node.back;
        Node newNode = new Node(data, node, prev);
        prev.next = newNode;
        node.back = newNode;
    }
    public static Node insertAfterTail(Node head, int data) {
        if(head == null) {
            Node newNode = new Node(data);
            return newNode;
        }
        Node temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        Node newNode = new Node(data, null, temp);
        temp.next = newNode;
        return head;
    }
    public static Node reverseDLL(Node head) { //TC-O(N), SC-O(1)
        if(head == null || head.next == null) return head; 
        Node prev = null;
        Node curr = head;
        while(curr != null) {
            prev = curr.back;
            curr.back = curr.next;
            curr.next = prev;
            curr = curr.back;
        }
        return prev.back;
    }
    public static void main(String[] args) {
        int arr[] = {1,3,2,4};
        Node head = convertArr2DLL(arr);
        printDLL(head);

        //System.out.println(sizeOfDLL(head));

        //head = removeHead(head);
        //printDLL(head);

        //head = removeTail(head);
        //printDLL(head);

        //head = deleteKth(head, 4);
        //printDLL(head);

        //head = deleteNode(head, 1);
        //printDLL(head);

        //deleteNodeII(head.next);
        //printDLL(head);

        //head = insertBeforeHead(head, 0);
        //printDLL(head);

        //head = insertBeforeTail(head, 0);
        //printDLL(head);

        //head = insertBeforeKthEle(head, 3, 0);
        //printDLL(head);

        //head = insertBeforeKthNode(head,3, 0);
        //printDLL(head);

        //insertBeforeNode(head.next.next, 0);
        //printDLL(head);

        head = reverseDLL(head);
        printDLL(head);
    }
}
