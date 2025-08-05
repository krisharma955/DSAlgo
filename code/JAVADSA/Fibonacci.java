import java.util.*;

public class Fibonacci {

    //function to print n fibonacci number

    public static void fibonacci(int n) {

        int num1 = 0;
        int num2 = 1;

        for(int i = 0; i<n; i++) {
            //print the number
            System.out.print(num1+ " ");

            //swap
            int num3 = num1+num2;
            num1 = num2;
            num2 = num3;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        fibonacci(n);

        sc.close();
    } 
}
