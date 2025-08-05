package Patterns;

public class HollowRectangle {

    public static void hollow_rec(int totRows, int totCols) {
        //outer loop
        for(int i = 1; i<=totRows; i++) { 
            //inner - columns
            for(int j = 1; j<=totCols; j++) {
                //cells - (i,j)
                if(i == 1 || i == totRows || j == 1 || j == totCols) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();

        }
    }

    public static void main(String args[]) {
        hollow_rec(4, 5);

    }
    
}
