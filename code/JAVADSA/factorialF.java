import java.util.*;

public class factorialF {

    public static int factorial(int n) {
        int f = 1;
        for(int i = 1; i<=n; i++) {
            f = f*i;
        }
        return f;
    }
    public static void main(String args[]) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // System.out.println(factorial(n));
        // sc.close();
        System.out.println(factorial(21)/(factorial(5)*factorial(16)));
    }
}
