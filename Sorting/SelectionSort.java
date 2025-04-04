package Sorting;

public class SelectionSort {
    public static void selectionSort(int arr[]) {
        for(int i = 0; i<arr.length-1; i++) {
            int min = i;
            for(int j = i+1; j<arr.length; j++) { //this loop gets smallest from the unsorted part
                if(arr[min]>arr[j]) { // for decreasing order arr[min] < arr[j]
                    min = j;
                }
            }
            //swap
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    } //TC - O(N^2)
    public static void printArr(int arr[]) {
        for(int i = 0; i<arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        selectionSort(arr);
        printArr(arr);
    }
}
