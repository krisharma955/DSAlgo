package ArrayLists;

import java.util.ArrayList;

public class PairSum2 {
    public static boolean bruteForce(ArrayList<Integer> list, int target) {
        for(int i = 0; i<list.size(); i++) {
            for(int j = i+1; j<list.size(); j++) {
                if(list.get(i)+list.get(j)==target) {
                    return true;
                }
            }
        }
        return false;
    } //O(N^2)

    public static boolean twoPointer(ArrayList<Integer> list, int target) {
        int pivot = -1;
        int n = list.size();
        for(int i = 0; i<list.size(); i++) {
            if(list.get(i)>list.get(i+1)) { //breaking point
                pivot = i;
                break;
            }
        }

        int left = pivot+1; //smallest
        int right = pivot; //largest

        while(left != right) { // or (left<right)
            if(list.get(right)+list.get(left)==target) {
                return true;
            }
            else if(list.get(right)+list.get(left)<target) {
                left = (left+1) % n; //using modular arithmetic
            }
            else {
                right = (n+right-1) % n;
            }
        }
        return false;
    } //O(N)
    //left and right pointer are increased in a rotated fashion

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        //11, 15, 6, 8, 9, 10 - Sorted & Rotated
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target = 21;

        // System.out.println(bruteForce(list, target));

        System.out.println(twoPointer(list, target));
    }
}
