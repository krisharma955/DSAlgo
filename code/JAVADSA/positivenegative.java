import java.util.*;
public class positivenegative {
    public static  void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number : ");

        int num = sc.nextInt();
        if(num>0) {
            System.out.println("Number entered is +ve");
        }
        else if (num<0) {
            System.out.println("Number entered is -ve");
        }
        else {System.out.println("ZERO");}

        sc.close();

    }
    
}
