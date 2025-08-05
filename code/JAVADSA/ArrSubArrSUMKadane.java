public class ArrSubArrSUMKadane {
    public static void Kadane(int num[]) {
        int ms = Integer.MIN_VALUE; //maximum sum
        int cs = 0; //current sum
        for(int i = 0; i<num.length; i++) {
            cs = cs +num[i];
            ms = Math.max(cs, ms);
            if(cs<0) {
                cs = 0;
            }
        }
        System.out.println("Max subarray sum = " +ms);
    }
    public static void main(String args[]) {
        // int[] num = {-2,-3,4,-1,-2,1,5,-3};
        int[] num = {-1};
        Kadane(num);
        // time complexity = O(n)
    }
}
