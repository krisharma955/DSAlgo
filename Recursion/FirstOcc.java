package Recursion;

public class FirstOcc {
    public static int firstOcc(int arr[], int i, int key) {
        if(arr[i]==key) {
            return i;
        }
        if(i==arr.length-1) {
            return -1;
        }
        return firstOcc(arr, i+1, key);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,3,5};
        System.out.println(firstOcc(arr, 0, 3));
    }
}
