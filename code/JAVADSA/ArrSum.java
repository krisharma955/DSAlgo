import java.util.*;

public class ArrSum {

    public static int simpleArraySum(int arr[]) {
        int sum = 0;
        for(int i = 0; i<arr.length; i++) {
            sum = sum + arr[i];
        } 
        return sum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size : ");
        int arr_size = sc.nextInt();
        int arr[] = new int[arr_size];
        for(int i = 0; i<arr_size; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Sum of elements of array : " +(simpleArraySum(arr)));

        sc.close();
    }
}
