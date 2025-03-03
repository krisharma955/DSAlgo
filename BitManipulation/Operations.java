package BitManipulation;

public class Operations {
    public static int getIthBit(int n, int i) {
        int bitMask = 1<<i;
        if((n & bitMask)==0) {
            return 0;
        }
        else {
            return 1; 
        }
    }

    public static int setIthBit(int n, int i) {
        int bitMask = 1<<i;
        return n | bitMask;
    }

    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1<<i);
        return n & bitMask;
    }

    public static int updateIthBit(int n, int i, int newBit) {
        // if(newBit==0) {
        //     return clearIthBit(n, i);
        // }
        // else {
        //     setIthBit(n, i);
        // }

        n = clearIthBit(n, i);
        int bitMask = newBit<<i;
        return n | bitMask;
    }

    public static int clearLastIBits(int n, int i) {
        int bitMask = (-1)<<i;
        return n & bitMask;
    }

    public static int clearRangeOfBits(int n, int i, int j) {
        int a = ((~0)<<(j+1));
        int b = (1<<i)-1;
        int bitMask = a | b;
        return n & bitMask;
    }
    public static void main(String[] args) {
        // System.out.println(getIthBit(10, 2));

        // System.out.println(setIthBit(10, 2));

        // System.out.println(clearIthBit(10, 1));

        // System.out.println(updateIthBit(10, 2, 1));

        // System.out.println(clearLastIBits(15, 2));

        System.out.println(clearRangeOfBits(10, 2, 4));
    }
}
