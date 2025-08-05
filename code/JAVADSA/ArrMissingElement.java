import java.util.*;
public class ArrMissingElement {
    public static int missingElement(int arr[]) {
        Arrays.sort(arr);
        for(int i = 0; i<arr.length; i++) {
            if(arr[i]<arr[i+1] && arr[i+1]!=arr[i]+1 || i==arr.length-1) {
                return arr[i]+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {2,3};
        System.out.println(missingElement(arr));
    }
}
