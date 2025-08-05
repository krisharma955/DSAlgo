public class InsertionSort {
    public static void Isort(int arr[]) {
        for(int i = 1; i<arr.length; i++) {
            int curr = i;
            int prev = i-1;
            //finding out the correct pos to insert
            while(prev>=0 && arr[prev]>arr[curr]) {
                arr[prev+1] = arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1] = arr[curr];
        }
    }
    public static void main(String args[]) {
        int arr[] = {5,4,1,3,2};
        Isort(arr);
        Isort(arr);
    }
}
