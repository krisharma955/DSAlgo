package LinkedLists;
import java.util.LinkedList; //JCF (Optimized)

public class LLJCF {
    public static void main(String[] args) {
        //create -> use classes as datatypes (Integer, Float, Character)
        LinkedList<Integer> ll = new LinkedList<>();

        //add
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);
        //0->1->2

        //print
        System.out.println(ll);

        //remove 
        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);
    }
}
