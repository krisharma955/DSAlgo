public class ArrSubarrSUMPreSum {
    public static void PreSum(int num[]) {
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        int prefix[] =  new int[num.length];
        //calculate preffix array
        prefix[0] = num[0];
        for(int i = 1; i<prefix.length; i++) {
            prefix[i] = prefix[i-1] + num[i];
        }   
        for(int i = 0; i<num.length; i++) {
            for(int j = i; j<num.length; j++) {
                currsum = i == 0 ? prefix[j] : prefix[j] - prefix[i-1]; //imp formulae and use of ternary operator
            }
            if(maxsum<currsum) {
                maxsum = currsum;
            }
        }
        System.out.println("Max Sum = " +maxsum);
    }
    public static void main(String args[]) {
        int[] num = {1,-2,6,-1,3};
        PreSum(num);
    }
}
