public class selectionsort {
    public static void Ssort(int num[]) {
        for(int i = 0; i<num.length-1; i++) {
            int min = i; //minposition
            for(int j = i+1; j<num.length; j++) {
                if(num[min] < num[j]) {
                    min = j;
                }
            }
            //swap
            int temp = num[min];
            num[min] = num[i];
            num[i] = temp;
        }
    }

    public static void printSsort(int num[]) {
        for(int i = 0; i<num.length; i++) {
            System.out.print(num[i]+ " ");
        }
    }
    public static void main(String args[]) {
        int num[] = {5,4,1,3,2};
        Ssort(num);
        printSsort(num);
        //time complexity O(n^2)
    }
}
