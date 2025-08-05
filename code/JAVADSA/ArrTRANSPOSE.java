public class ArrTRANSPOSE {
    // public static void transpose(int arr[][]) {
    //     for(int i = 0; i<arr.length; i++) {
    //         for(int j = 0; j<arr[0].length; j++) {
    //             int temp = 0;
    //             temp = arr[i][j];
    //             arr[i][j] = arr[j][i];
    //             arr[j][i] = temp;
    //         }
    //     }
    // }
    public static void print(int arr[][]) {
        for(int i = 0; i<arr.length; i++) {
            for(int j = 0; j<arr[0].length; j++) {
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        int arr[][] = {{1,2,3},
                       {4,5,6}};
        print(arr);

        // transpose(arr);

        int transpose[][] = new int[arr[0].length][arr.length];
        for(int i = 0; i<arr.length; i++) {
            for(int j = 0; j<arr[0].length; j++) {
                transpose[j][i] = arr[i][j];
            }
        }
        
        print(transpose);
    }
    
}
