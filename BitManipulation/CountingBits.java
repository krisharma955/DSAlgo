package BitManipulation;

public class CountingBits {
    public static void countBits(int n) {
        String str = "";
        @SuppressWarnings("unused")
        int count = 0;
        while(n>0) {
            if((n & 1)!=0) {
                count++;
            }
            n = n>>1;
        }
        System.out.println(str);
    }
    public static void main(String[] args) {
        countBits(2);
    }
}
