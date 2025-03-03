package Backtracking;

public class OnArrays {
    public static void addNum(int arr[], int i, int val) {
        //base case
        if(i==arr.length) {
            printArr(arr);
            return;
        }
        //recursion
        arr[i] = val;
        addNum(arr, i+1, val+1); //fxn call
        arr[i] -= 2; //backtracking step
    }
    public static void printArr(int arr[]) {
        for(int i = 0; i<arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
        System.out.println();  
    }
    public static void main(String[] args) {
        int arr[] = new int[5];
        int i = 0;
        int val = 1;
        addNum(arr, i, val);
        printArr(arr);
    }
}
