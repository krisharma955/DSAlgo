package DividenConquer;

public class SearchRotSortArr2 {
    public static int search(int nums[], int target) {
        int si = 0;
        int ei = nums.length-1;
        while(si<=ei) {
            int mid = si + (ei-si)/2;

            if(nums[mid]==target) {
                return mid;
            }
            
            if(nums[si]<=nums[mid]) {
                if(nums[si]<=target && target<=nums[mid]) {
                    ei = mid-1;
                }
                else {
                    si = mid+1;
                }
            }
            else {
                if(nums[mid]<=target && target<=nums[ei]) {
                    si = mid+1;
                }
                else {
                    ei = mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[] = {1,0,1,1,1};
        int target = 0;
        System.out.println(search(nums, target));
    }
}
