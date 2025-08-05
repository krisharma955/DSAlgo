import java.util.*;
public class IMP5 {

    public static void mclaren(int n, int x) {
        int c = n-x; //children left
        if(n>x && c%4==0) {
            System.out.println(c/4);
        }
        else if(n>x && c%4!=0) {
            System.out.println((c/4)+1);
        }
        else{System.out.println("0");}
        
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int i = 0; i<t; i++) {
            int n = sc.nextInt(); //no of children
            int x = sc.nextInt(); //no of candy already have

            mclaren(n,x);
        }

        sc.close();
    }

    
}
