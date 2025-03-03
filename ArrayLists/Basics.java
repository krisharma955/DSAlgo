package ArrayLists;
import java.util.*;

public class Basics {
    public static void main(String[] args) {
        // ArrayLists is a part of Java Collection Framework
        ArrayList<Integer> list1 = new ArrayList<>();
        // ArrayList<String> list2 = new ArrayList<>();
        // ArrayList<Boolean> list3 = new ArrayList<>();

        //Adding elements - Add Element - O(1)
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        // TC in adding a number - O(1)
        System.out.println(list1);

        // //Get Element - O(1)
        // int element = list1.get(2);
        // System.out.println(element);

        // //Remove Element - O(n)
        // list1.remove(2);
        // System.out.println(list1);

        // //Set Element at Index - O(n)
        // list1.set(2, 10);
        // System.out.println(list1);

        // //Contains Element - O(n)
        // System.out.println(list1.contains(2));
        // System.out.println(list1.contains(3));

        // //Adding value to a particular index - O(n)
        // list1.add(1,9);
        // System.out.println(list1);

        // //Size of ArrayList
        // System.out.println(list1.size());

        // //print the arrayList
        // //iteration on an ArrayList
        // for(int i = 0; i<list1.size(); i++) {
        //     System.out.print(list1.get(i) +" ");
        // }
        // System.out.println();
    }
}
