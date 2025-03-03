package ArrayLists;

import java.util.ArrayList;

public class Practice {
    public static int maxArea(ArrayList<Integer> height) {
        int left = 0;
        int right = height.size()-1;
        int maxWater = 0;
        while(left!=right) {
            int ht = Math.min(height.get(left), height.get(right));
            int width = right-left;
            int currWater = ht*width;
            maxWater = Math.max(maxWater, currWater);
            if(height.get(left)<height.get(right)) {
                left++;
            }
            else {
                right--;
            }
        }
        return maxWater;
    }

    public static void pairSum1(ArrayList<Integer> list, int target) {
        int left = 0;
        int right = list.size()-1;
        while(left!=right) {
            if(list.get(left)+list.get(right)==target) {
                System.out.println(left);
                System.out.println(right);
                break;
            }
            else if(list.get(left)+list.get(right)<target) {
                left++;
            }
            else {
                right--;
            }
        }
    }

    public static boolean pairSum2(ArrayList<Integer> list, int target) {
        int pivot = -1;
        for(int i = 0; i<list.size()-1; i++) {
            if(list.get(i)>list.get(i+1)) {
                pivot = i;
            }
        }

        int left = pivot+1;
        int right = pivot;
        while (left!=right) {
            if(list.get(left)+list.get(right)==target) {
                return true;
            }
            else if(list.get(left)+list.get(right)<target) {
                left = (left+1) % (list.size());
            }
            else {
                right = (list.size()+right-1) % (list.size());
            }
        }
        return false;
    }
    public static void main(String[] args) {
        // ArrayList<Integer> height = new ArrayList<>();
        // height.add(1);
        // height.add(8);
        // height.add(6);
        // height.add(2);
        // height.add(5);
        // height.add(4);
        // height.add(8);
        // height.add(3);
        // height.add(7);
        // System.out.println(maxArea(height));

        // ArrayList<Integer> list = new ArrayList<>();
        // for(int i = 1; i<6; i++) {
        //     list.add(i);
        // }
        // int target = 4;
        // pairSum1(list, target);

        ArrayList<Integer> list = new ArrayList<>();
        //11, 15, 6, 8, 9, 10 - Sorted & Rotated
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target = 21;
        System.out.println(pairSum2(list, target));
    }
}
