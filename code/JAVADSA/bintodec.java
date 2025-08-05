import java.util.*;

public class bintodec {
    
    public static void bitodec(int n) {
        int mynum = n;
        int pow = 0;
        int dec = 0;
        while(n>0) {
            int ld = n%10;
            dec = dec + (ld*(int)Math.pow(2,pow));
            pow++;
            n = n/10;
        }
        System.out.println("decimal number of " +mynum+ " = " +dec);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        bitodec(n);

        sc.close();

    }
}
