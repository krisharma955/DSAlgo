import java.util.*;
public class bubblesort {
    public static void bubbsort(int arr[]) {
        for(int turn = 0; turn<arr.length-1; turn++) {
            for(int j = 0; j<arr.length-1-turn; j++) {
                if(arr[j] > arr[j+1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void printarr(int arr[]) {
        for(int i = 0; i<arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        bubbsort(arr);
        printarr(arr);
        sc.close();
        //time complexity = O(n^2)
        // try to get a code with time complexity = O(n)
    }
}
