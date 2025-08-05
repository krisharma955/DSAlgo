package Patterns;

public class INVSTAR {

    public static void main(String args[]) {
        // my logic
        // for(int line = 4; line<=4 && line>0; line--) {
        //     for(int star = 1; star<=line; star++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();

        // }

        int n = 4;
        for(int line = 1; line<=n; line++) {
            for(int star = 1; star<=(n-line+1); star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
