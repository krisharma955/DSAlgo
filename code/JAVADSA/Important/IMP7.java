import java.util.*;
public class IMP7 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int i = 0; i<t; i++) {
            int n = sc.nextInt(); //n problems
            int x = sc.nextInt(); //marks for each problem
            int y = sc.nextInt(); //y marks to be obtained

            if(y%x==0 && (y%x)<=n) {
                System.out.println("YES");
            }
            else{System.out.println("NO");}
            
        }

        
        sc.close();
    }
}

   
