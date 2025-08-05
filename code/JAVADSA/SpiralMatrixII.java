public class SpiralMatrixII {
    public static int[][] spiralMatrix2(int n) {
        int matrix[][] = new int[n][n];
        int srow = 0;
        int scol = 0;
        int erow = matrix.length;
        int ecol = matrix[0].length;
        int addnum = 1;
        for(int i = 0; i<matrix.length; i++) {
            for(int j = 0; j<matrix[0].length; j++) {
                matrix[i][j] = addnum;
                addnum++;
            }
        }
        return matrix;
    }
    public static void main(String[] args) {
        int n = 3;
        spiralMatrix2(n);
    }
}
