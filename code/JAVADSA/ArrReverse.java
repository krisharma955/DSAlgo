import java.util.*;

public class ArrReverse {

    public static void reverse(int num[]) {
        int first = 0;
        int end = num.length-1;
        while(first<end) {
            int temp = num[end];
            num[end] = num[first];
            num[first] = temp;

            first++;
            end--;
        }
    }

    public static void main(String args[])   {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num array size : ");
        int num[] = new int[sc.nextInt()];
        System.out.println("enter " +num.length+ " elements : ");
        for(int i = 0; i<num.length; i++) {
            num[i] = sc.nextInt();
        }

        reverse(num);
        for(int i = 0;i<num.length;i++) {
            System.out.print(num[i] +" ");
        }
        System.out.println();

        sc.close();
    }  
}
