import java.util.*;
public class try {
    public static boolean search(int matrix[][], int key) {
        for(int i = 0; i<matrix.length; i++) {
            for(int j = 0; j<matrix[0].length; j++) {
                if(matrix[i][j]==key) {
                    System.out.println("(" +i+ "," +j+ ")");
                    return true;
                }
            }
        }
        System.out.println("not found");
        return false;
    }
    public static void matrix(int matrix[][]) {
        int srow = 0;
        int scol = 0;
        int erow = matrix.length-1;
        int ecol = matrix[0].length-1;
        while(srow<=erow && scol<=ecol) {
            for(int j = scol; j<=ecol; j++) {
                s += matrix[srow][j];
            }
            for(int i = srow+1; i<=erow; i++) {
                s += matrix[]
            }
        }
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

        for(int i = 0; i<n; i++) { //output
            for(int j = 0; j<m; j++) {
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
