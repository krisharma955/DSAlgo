package Recursion;

public class BinarySearch {
    public static int binarySearch(int arr[], int target, int start, int end) {
        if(start>end) {
            return -1;
        }
        int mid = start + (end-start)/2;
        if(arr[mid]==target) {
            return mid;
        }
        else if(arr[mid]>target) {
            return binarySearch(arr, target, start, mid-1);
        }
        else {
            return binarySearch(arr, target, mid+1, end);
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int start = 0;
        int end = arr.length-1; 
        int target = 3;
        int index = binarySearch(arr, target, start, end);
        if(index == -1) {
            System.out.println("Target not found");
        }
        else {
            System.out.println(index);
        }
    }
}
