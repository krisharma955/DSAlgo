import java.util.*;
public class IMP6 {

    public static void mclaren(int p, int q, int r, int s) {
      
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int i = 0; i<t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if(b>=a && b>=c) {
                System.out.println("Yes");
            }
            else{System.out.println("No");}

        }

        sc.close();
    }
      
}
