package Recursion;

public class ArrSorted {
    public static boolean isArrSorted(int arr[], int i) {
        if(i==arr.length-1) {
            return true;
        }
        else if(arr[i]>arr[i+1]) {
            return false;
        }
        return isArrSorted(arr, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        int i = 0;
        System.out.println(isArrSorted(arr, i));
    }
}
