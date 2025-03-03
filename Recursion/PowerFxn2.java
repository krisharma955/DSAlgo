package Recursion;

public class PowerFxn2 {
    public static int power2(int a, int n) {
        if(n==0) {
            return 1;
        }
        int halfPowSq = power2(a, n/2) * power2(a, n/2);
        if(n%2!=0) { //a is odd
            return a*halfPowSq;
        }
        return halfPowSq;
    }
    public static void main(String[] args) {
        System.out.println(power2(2, 5));
    }
}
