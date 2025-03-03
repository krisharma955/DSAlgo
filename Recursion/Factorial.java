package Recursion;

public class Factorial {
    public static int fac(int n) {
        if(n==0 || n==1) {
            return n;
        }
        return n*fac(n-1);
    }
    public static void main(String[] args) {
        System.out.println(fac(5));
    }
}
