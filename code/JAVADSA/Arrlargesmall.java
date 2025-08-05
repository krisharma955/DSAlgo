public class Arrlargesmall {

    public static void largestsmallest(int num[]) {
        int largest = Integer.MIN_VALUE; // -infinty
        int smallest = Integer.MAX_VALUE; //infinty
        for(int i = 0; i<num.length; i++) {
            if(largest<num[i]) {
                largest = num[i];
            }
            if(smallest>num[i]) {
                smallest = num[i];
            }
        }
        System.out.println("Largest : " +largest);
        System.out.println("Smallest : " +smallest);
    }

    public static void main(String args[]) {
        int num[] = {44,63,4,1,16,55};
        largestsmallest(num);
    }
}
