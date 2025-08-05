import java.util.*;
public class Arr2DLargest {
    public static void largestnsmallest(int matrix[][]) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i<matrix.length; i++) {
            for(int j = 0; j<matrix[0].length; j++) {
                if(matrix[i][j]>max) {
                    max = matrix[i][j];
                }
                if(matrix[i][j]<min) {
                    min = matrix[i][j];
                }
            }
        }
        System.out.println("Largest : " +max);
        System.out.println("Smallest : " +min);
    }
    public static void main(String args[]) {
        int matrix[][] = new int[3][3];
        int n = matrix.length, m = matrix[0].length;  

        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<n; i++) {
             for(int j = 0; j<m; j++) {
                 matrix[i][j] = sc.nextInt();
            }
        }

        // //output
        // for(int i = 0; i<n; i++) {
        //     for(int j = 0; j<m; j++) {
        //         System.out.print(matrix[i][j] +" ");
        //     }
        //     System.out.println();
        // }

        largestnsmallest(matrix);

        sc.close();
    }
}
