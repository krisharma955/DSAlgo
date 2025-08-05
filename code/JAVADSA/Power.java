public class Power {
    public static double power(double x, double n) {
        if(n==0) {
            return 1;
        }
        double halfPow = power(x, n/2);
        if(n%2!=0) {
            return x*halfPow*halfPow;
        }
        return halfPow*halfPow;
    }
    public static void main(String[] args) {
        System.out.println(power(4, 0.5));
    }
}
