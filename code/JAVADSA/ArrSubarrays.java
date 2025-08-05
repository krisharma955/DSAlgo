public class ArrSubarrays {

    public static void Subarrays(int num[]) {
        int tp = 0;
        for(int i = 0; i<num.length; i++) {
            // int start = i;
            for(int j = i; j<num.length; j++) {
                // int end = j;
                for(int k = i; k<=j; k++) { //for print
                    System.out.print(num[k]+ " "); //subarray
                }
                tp++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total subarrays = " +tp);
    }

    public static void main(String args[]) {

        int[] num = {2,4,6,8,10};

        Subarrays(num);

        // Q. sum of each subarray and largest and smallest sum ??

    } 
}
