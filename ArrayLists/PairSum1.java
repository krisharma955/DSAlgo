package ArrayLists;

import java.util.ArrayList;

public class PairSum1 {
    public static boolean bruteForce(ArrayList<Integer> list, int target) {
        for(int i = 0; i<list.size(); i++) {
            for(int j = i+1; j<list.size(); j++) {
                if(list.get(i)+list.get(j)==target) {
                    return true;
                }
            }
        }
        return false;
    } //O(n^2)

    public static boolean twoPointer(ArrayList<Integer> list, int target) {
        int left = 0;
        int right = list.size()-1;
        while(left<right) {
            if(list.get(left)+list.get(right)==target) {
                return true;
            }
            else if(list.get(left)+list.get(right)<target) {
                left++;
            }
            else {
                right--;
            }
        }
        return false;
    } //O(n)

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1; i<=5; i++) {
            list.add(i); //1, 2, 3, 4, 5
        }
        int target = 5;

        // System.out.println(bruteForce(list, target));
        System.out.println(twoPointer(list, target));
    }
}
// LeetCode - Two Sum II 
