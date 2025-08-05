public class RoundOff {
    public static void main(String[] args) {
        double x = 12.2222;
        double y = 11.2222;
        //answer should be upto 2 decimal places
        System.out.println(String.format("%.2f", (x+y)));
    }
}
