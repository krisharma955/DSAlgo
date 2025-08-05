    public class ArrBinarySearch {

    public static int binarysearch(int num[], int key) {
        int start = 0;
        int end = num.length-1;
        while(start<=end) {
            int mid = (start+end)/2;
            if(num[mid]==key) {
                return mid;
            }
            if(num[mid]>key) { //left
                end = mid-1;
            } else{ //right
                start = mid+1;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int num[] = {5,7,7,8,8,10};
        int key = 8;
        System.out.println("index for key : " +binarysearch(num, key));
    }
    
}
