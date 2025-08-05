import java.util.*;

public class binocoeffF {

    public static int factorial(int n) {
        int f=1;
    
        for(int i=1; i<=n; i++) {
          f=f*i;
        }
        return f; //factorial of n
      }
    
      public static int bicoeff(int n, int r) { // binomial coefficient
        int nfac = factorial(n);
        int rfac = factorial(r);
        int nrfac = factorial((n-r));
        int bfac = (nfac)/((rfac)*(nrfac));
        return bfac;
      }
    
      public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        System.out.println(bicoeff(n, r));
        sc.close();
    
      }

    
}
