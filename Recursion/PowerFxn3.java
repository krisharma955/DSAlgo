package Recursion;

public class PowerFxn3 {
    public static double power3(double a, int n) {
        if(n==0) {
            return 1;
        }
        if(n<0) {
            a = 1/a;
            n = -n;
        }
        double halfPow = power3(a, n/2);
        if(n%2!=0) { // a is odd
            return a*halfPow*halfPow;
        }
        return halfPow*halfPow;
    }
    public static void main(String[] args) {
        // System.out.println(power3(2, -2147483648));
        System.out.println(power3(2, 10));
    }
}
