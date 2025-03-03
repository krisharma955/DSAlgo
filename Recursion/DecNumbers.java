package Recursion;

public class DecNumbers {
    public static void decNumbers(int n) {
        if(n==1) {
            System.out.println(n);
            return;
        }
        System.out.print(n +" ");
        decNumbers(n-1);
    }
    public static void main(String[] args) {
        decNumbers(10);
    }
}
