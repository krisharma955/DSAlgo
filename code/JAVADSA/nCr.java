import java.math.BigInteger;
import java.util.*;
public class nCr {
    public static BigInteger fac(int n) {
        BigInteger fac = BigInteger.ONE;
        for(int i = 2; i<=n; i++) {
            fac = fac.multiply(BigInteger.valueOf(i));
        }
        return fac;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        System.out.println("Enter r: ");
        int r = sc.nextInt();
        System.out.println("nCr: ");
        BigInteger nf = fac(n);
        BigInteger rf = fac(r);
        BigInteger nrf = fac(n-r);
        System.out.println(nf/(rf.multiply(BigInteger.valueOf(nrf)));
        sc.close();
        // System.out.println("n!: " +fac(21));
        // System.out.println("r!: " +fac(16));
        // System.out.println("(n-r)!: " +fac(21-16));
    }
}
