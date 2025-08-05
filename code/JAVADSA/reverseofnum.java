import java.util.*;

public class reverseofnum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number to be reversed : ");
        int num = sc.nextInt();
        int i=0;

        while(num>0) {
            i = (num%10);
            System.out.print(i);
            num = (num/10);
        }

        sc.close();

    }
    
}


// public static void main(String args[]) {
//     Scanner sc = new Scanner(System.in);
    
//     int t = sc.nextInt();

//     for(int i = 0; i<t; i++) {
//         int n = sc.nextInt();

//         int rev = 0;

//         while(n>0) {
//             int ld = n%10;
//             rev = (rev*10)+ld;
//             n = n/10;
//         }
//         System.out.println(rev);
//     }

//     sc.close();
// }