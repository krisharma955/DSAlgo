public class ArrMAXSubarraySUM {

    public static void MAXSSUM(int num[]) {
        int Currsum = 0;
        int Maxsum = Integer.MIN_VALUE;
        for(int i = 0; i<num.length; i++) {
            for(int j = i; j<num.length; j++) {
                Currsum = 0;
                for(int k = i; k<=j; k++) {
                    //subarray sum
                    Currsum += num[k];
                }
                System.out.println(Currsum);
                if(Maxsum<Currsum) {
                    Maxsum = Currsum;
                }
            }
        }
        System.out.println("Max Sum = " +Maxsum);
    }

    public static void main(String args[]) {
        int num[] = {2,4,6,8,10};
        MAXSSUM(num);
        // time complexity = O(n^3) {very bad} {brute force}
    }
}
