import java.util.*;

public class Practice {
    public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        int index = 0;
        while(start<=end) {
            int mid = (start+end)/2;
            if(nums[mid]==target) {
                index = mid;
                return mid;
            }
            else if(nums[mid]>target) {
                end = mid-1;
            }
            else {
                start = mid+1;
            }
        }
        return index;
    }
    public static void main(String args[]) {
       int nums[] = {1,3,5,6};
       int target = 5;
       System.out.println(searchInsert(nums,target));
    }
}
