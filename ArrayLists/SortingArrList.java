package ArrayLists;
import java.util.*;

public class SortingArrList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(3);
        list.add(6);
        list.add(8);
        list.add(1);
        System.out.println(list);

        Collections.sort(list); //inbuilt meathod for sorting, sorts in ascending order (optimized)
        System.out.println(list);

        //descending order
        Collections.sort(list, Collections.reverseOrder());
        //Collections.reverseOrder - is a comparator, comparators are fxns in java which defines logic for sorting. So, we've passed descending order comparator here.
        System.out.println(list);
    }
}
