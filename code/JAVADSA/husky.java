import java.util.*;
public class husky {
    public static void discount(int x) {
        if(x<1000) {
            System.out.println(x);
        }
        else if(x>1000 && x<5000) {
            System.out.println(x+(x*0.5));
        }
        else if(x>5000 && x<10000) {
            System.out.println(x+(x*0.1));
        }
        else if(x>10000 && x<30000){
            System.out.println(x+(x*(0.15)));
        }
        else if(x>30000) {
            System.out.println(x+(x*(0.17)));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x<1000) {
            System.out.println(x);
        }
        else if(x>1000 && x<5000) {
            System.out.println(String.format("%.2f", x-(x*(0.05))));
        }
        else if(x>5000 && x<10000) {
            System.out.println(String.format("%.2f", x-(x*(0.1))));
        }
        else if(x>10000 && x<30000){
            System.out.println(String.format("%.2f", x-(x*(0.15))));
        }
        else if(x>30000) {
            System.out.println(String.format("%.2f", x-(x*(0.17))));
        }
        sc.close();
    }
}
