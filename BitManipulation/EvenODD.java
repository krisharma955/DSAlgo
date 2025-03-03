package BitManipulation;

public class EvenODD {
    public static void oddEven(int n) {
        int bitMask = 1;
        if((n & bitMask)==0) {
            //even
            System.out.println("even");
        }
        else {
            System.out.println("odd");
        }
    }
    public static void main(String[] args) {
        //LSB of odd no = 1, even no = 0
        // n&0 = 0
        // n&1 = 1
        // number and & 1 ke sath - agar lsb 1 toh odd, 0 toh even
        // this 1 is called bitmask

        oddEven(2);
        oddEven(11);
    }
}
