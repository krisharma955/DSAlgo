import java.util.*;
public class WTF {
    public static boolean distinct(int nums[]) {
        Arrays.sort(nums);
        for(int i = 0; i<nums.length; i++) {
            if(nums[i]==nums[i+1]) {
                return false;
            }
        }
        return true;
    }
    public static void printNumbers(int n) {
        if(n==10) {
            System.out.println(n);
            return;
        }
        System.out.print(n +" ");
        printNumbers(n+1);
    }
    public static boolean isPrime(int n) {
        if(n==2) {
            return true;
        }
        for(int i = 2; i<=Math.sqrt(n); i++) {
            if(n%i==0) {
                return false;
            }
        }
        return true;
    }
    public static int factorial(int n) {
        // int fac = 1;
        // while(n>0) {
        //     fac*=n;
        //     n--;
        // }
        // System.out.println(fac);
        if(n==1) {
            return n;
        }
        return n*factorial(n-1);
    }
    public static void spiralMatrix(int arr[][]) {
        int startRow = 0;
        int startCol = 0;
        int endRow = arr.length-1;
        int endCol = arr[0].length-1;
        while(startRow<=endRow && startCol<=endCol) {
          for(int j = 0; j<=endCol; j++) {
            System.out.print(arr[startRow][j] +" ");
          }
          for(int i = startRow+1; i<=endRow; i++) {
            System.out.print(arr[i][endCol] +" ");
          }
          for(int j = endCol-1; j>=startCol; j--) {
            System.out.print(arr[endRow][j] +" ");
          }
          for(int i = endRow-1; i>startRow+1; i--) {
            System.out.print(arr[i][startCol] +" ");
          }
          startCol++;
          startRow++;
          endCol--;
          endRow--;
        }
      }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int temp = x;
        x = y;
        y = temp;
        System.out.println(x);
        System.out.println(y);
        sc.close();
    }
}