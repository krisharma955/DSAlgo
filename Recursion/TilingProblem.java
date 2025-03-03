package Recursion;

public class TilingProblem {
    public static int tilingProblem(int n) {
        if(n==0 || n==1) {
            return 1;
        }
        int fnm1 = tilingProblem(n-1); //vertical choice
        int fnm2 = tilingProblem(n-2); //horizontal choice
        return fnm1+fnm2; //total ways
    }
    public static void main(String[] args) {
        System.out.println(tilingProblem(3));
    }
}
