import java.util.*;

public class IMP3 {

    public static void mclaren(int n, int x) {
        if((x*n)%4==0) {
            System.out.println((x*n)/4);
        }
        else if((x*n)%4!=0) {
            System.out.println(((x*n)/4)+1);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int i = 0; i<t; i++) {
            int n = sc.nextInt(); //no of friends
            int x = sc.nextInt(); //no of slices each friend wants

            mclaren(n, x);

        }

        sc.close();
    }
}

    
