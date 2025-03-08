package DividenConquer;

public class MergeSort {
    public static void mergeSort(int arr[], int si, int ei) {
        if(si>=ei) {
            return;
        }
        //kaam
        int mid = si + (ei-si)/2;
        mergeSort(arr, si, mid); //left part
        mergeSort(arr, mid+1, ei); //right part
        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei-si+1]; //size of temp array IMP
        int i = si; //iterator for left part
        int j = mid+1; //iterator for right part
        int k = 0; //iterator for temp arr
        
        while(i<=mid && j<=ei) {
            if(arr[i]<arr[j]) {
                temp[k] = arr[i];
                i++;
            }
            else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        //for leftover elements, if there are
        //left part
        while(i<=mid) {
            temp[k++] = arr[i++];
        }
        //right part
        while(j<=ei) {
            temp[k++] = arr[j++];
        }

        //copy temp arr to original arr
        for(k = 0, i = si; k<temp.length; k++,i++) {
            arr[i] = temp[k];
        }
    }

    public static void mergeeSort(int arr[], int low, int high) {
        if(low>=high) return;
        int mid = low + (high-low)/2;
        mergeeSort(arr, low, mid);
        mergeeSort(arr, mid+1, high);
        mergee(arr, low, mid, high);
    }
    public static void mergee(int arr[], int low, int mid, int high) {
        int temp[] = new int[high-low+1];
        int left = low;
        int right = mid+1;
        int i = 0;
        while(left <= mid && right <= high) {
            if(arr[left]<=arr[right]) {
                temp[i] = arr[left];
                left++;
            }
            else {
                temp[i] = arr[right];
                right++;
            }
            i++;
        }
        while(left<=mid) {
            temp[i++] = arr[left++];        
        }
        while(right<=high) {
            temp[i++] = arr[right++];
        }
        for(int j = 0; j<temp.length; j++) {
            arr[j+low] = temp[j];
        }
    }
    public static void printArr(int arr[]) {
        for(int i = 0; i<arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {3,5,2,-1,7,8};
        //mergeSort(arr, 0, arr.length-1);
        //printArr(arr);

        mergeeSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}
//TC - O(nlogn)
//SC - O(n) {because of temp arr}
