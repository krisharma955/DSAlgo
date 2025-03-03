package Recursion;

public class LastOcc {
    public static int lastOcc(int arr[], int i, int key) {
        if(arr[i]==key) {
            return i;
        }
        if(i==0) {
            return -1;
        }
        return lastOcc(arr, i-1, key);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,5,6,7,5};
        System.out.println(lastOcc(arr, arr.length-1, 5));
    }
}
