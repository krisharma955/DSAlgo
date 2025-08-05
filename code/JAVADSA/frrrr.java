public class frrrr {
    public static void pali(int matrix[][]) {
        int startRow = 0, startCol = 0;
        int endRow = matrix.length-1, endCol = matrix[0].length-1; 
        while(startRow<=endRow && startCol<=endCol) {
            for(int j = startCol; j<=endCol; j++) {
                if(matrix[startCol][endCol]==0) {
                    matrix[startCol][endCol]=0;
                }
            }

            for(int i = startRow+1; i<=endRow; i++) {
                if(matrix[startRow+1][endRow]==0) {
                    matrix[startRow+1][endRow]=0;
                }
            }

            for(int j = endCol-1; j<=0; j--) {
                if(matrix[endCol-1][0]==0) {
                    matrix[endCol-1][0]=0;
                } 
            }

            for(int i = endRow-1; i<=startRow+1; i--) {
                if(matrix[endRow-1][startRow+1]==0) {
                    matrix[endRow-1][startRow+1]=0;
                }
            }

            startRow++;
            startCol++;
            endCol--;
            endRow--;
        }
    }
     
    public static void print(int matrix[][]) {
        for(int i = 0; i<matrix.length; i++) {
            for(int j = 0; j<matrix[0].length; j++) {
                System.out.print(matrix[i][j] +" ");
            } 
            System.out.println();
        }

    }
    
    public static void main(String args[]) {
        int matrix[][] = {{1,1,1},
                          {1,0,1},
                          {1,1,1}};
        pali(matrix);
        print(matrix);


    }
}
