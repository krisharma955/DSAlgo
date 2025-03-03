package Recursion;

public class Practice {
    public static void printNum(int n) {
        if(n==1) {
            System.out.print(n +" ");
            return;
        }
        System.out.print(n +" ");
        printNum(n-1);
    }

    public static void incNum(int n) {
        if(n==10) {
            System.out.println(n);
            return;
        }
        System.out.print(n +" ");
        incNum(n+1);
    }

    public static int factorial(int n) {
        if(n==0) {
            return 1;
        }
        return n*factorial(n-1);
    }

    public static int fibonacci(int n) {
        if(n==0 || n==1) {
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }

    public static int sum(int n) {
        if(n==1) {
            return n;
        }
        return n+sum(n-1);
    }

    public static boolean sortedArray(int arr[], int index) {
        if(index == arr.length) {
            return true;
        }
        if(arr[index]>arr[index+1]) {
            return false;
        }
        return sortedArray(arr, index+1);
    }

    public static int binarySearch(int arr[], int start, int end, int target) {
        if(start>end) {
            return -1;
        }
        int mid = start + (end-start)/2;
        if(arr[mid]==target) {
            return mid;
        }
        else if(arr[mid]<target) {
            return binarySearch(arr, mid+1, end, target);
        }
        else {
            return binarySearch(arr, start, mid-1, target);
        }
    }

    public static int power(int a, int n) {
        if(n==0) {
            return 1;
        }
        if(n<0) {
            a = 1/a;
            n = -n;
        }
        int halfPow = power(a, n/2);
        if(n%2!=0) {
            return a*halfPow*halfPow;
        }
        return halfPow*halfPow;
    }
    public static void main(String[] args) {
        // printNum(10);
        // incNum(1);
        // System.out.println(factorial(5));
        // System.out.println(fibonacci(6));
        // System.out.println(sum(10));

        // int arr[] = {5,6,1,3,6,4};
        // System.out.println(sortedArray(arr, 0));

        // int target = 1;
        // System.out.println(binarySearch(arr, 0, arr.length-1, target));

        // System.out.println(power(2, 3));

    }
}
