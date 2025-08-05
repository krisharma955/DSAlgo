import java.util.*;
public class tables {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int N = sc.nextInt();
        for(int i=1; i<=10;i++) {
            System.out.println(N+ " x " +i+ " = " +(N*i));
        }
        sc.close();
    }
}
