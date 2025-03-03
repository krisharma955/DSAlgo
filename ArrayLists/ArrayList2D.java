package ArrayLists;
import java.util.*;

public class ArrayList2D {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>(); //syntax

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        //Adding Elements
        for(int i = 1; i<=5; i++) {
            list1.add(i*1); //1 2 3 4 5
            list2.add(i*2); //2 4 6 8 10
            list3.add(i*3); //3 6 9 12 15
        }

        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);

        System.out.println(mainList);

        //nested Loop - for printing
        for(int i = 0; i<mainList.size(); i++) {
            ArrayList<Integer> currList = mainList.get(i);
            for(int j = 0; j<currList.size(); j++) {
                System.out.print(currList.get(j) +" ");
            }
            System.out.println();
        }

        for(int i = 0; i<mainList.size(); i++) {
            for(int j = 0; j<mainList.get(i).size(); j++) {
                System.out.print(mainList.get(i).get(j) +" ");
            }
            System.out.println();
        }
    }
}
