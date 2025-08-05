public class ArrSearchMatrix {
    // public static void SearchMatrix(int matrix[][], int key) { //brute force, O(n^2)
    //     for(int i = 0; i<matrix.length; i++) {
    //         for(int j = 0; j<matrix[0].length; j++) {
    //             if(matrix[i][j]==key) {
    //                 System.out.println("(" +i+ "," +j+ ")");
    //                 break;
    //             }
    //         }
    //     }
    // } 
    
    public static boolean staircaseSearch(int matrix[][], int key) {
        int row = 0, col = matrix[0].length-1;

        while(row<matrix.length && col>=0) {
            if(matrix[row][col]==key) {
                System.out.println("(" +row+ "," +col+ ")");
                return true;
            }
            else if(key < matrix[row][col]) { //left
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("not found");
        return false;
    }
    
    public static void main(String args[]) {
        // int matrix[][] = {{10,20,30,40}, //Sorted Matrix
        //                   {15,25,35,45},
        //                   {27,29,37,48},
        //                   {32,33,39,50}};
        int matrix[][] = {{1,3}};
        int key = 3;
        staircaseSearch(matrix, key);
    }
}
