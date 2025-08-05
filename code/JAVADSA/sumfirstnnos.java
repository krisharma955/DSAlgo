import java.util.*;

public class sumfirstnnos {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number : ");
        int n = sc.nextInt();
        int sum = 0;

        for(int i = 1; i<=n; i++) {
            sum = (int) (sum+i);
        }

        System.out.println("Sum of first " +n+ " natural nos : " +sum);

        sc.close();

        

    }
    
}
