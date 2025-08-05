import java.util.*;
public class IMP4 {

    public static void mclaren(int a, int b, int x, int y) {
        if((x*y)>=(a*b)) {
            System.out.println("Yes");
        }
        else{System.out.println("No");}


    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int i = 0; i<t; i++) {
            int a = sc.nextInt(); // units of power
            int b = sc.nextInt(); // years
            int x = sc.nextInt(); // moon has x gm of helium
            int y = sc.nextInt(); // 1 gm of helium provide y unit of power

            mclaren(a, b, x, y);


        }

        sc.close();

    }

    
}
