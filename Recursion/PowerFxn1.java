package Recursion;

public class PowerFxn1 {
    public static int power(int a, int n) {
        if(n==0) {
            return 1;
        }
        return a*power(a, n-1);
    }
    public static void main(String[] args) {
        System.out.println(power(2, 5));
    }
}
// TC - O(n)
// SC - O(n)