import java.util.*;

public class evaluation {

    public static void eval(int amt, int per) {
        System.out.println("Evaluation : " +((100*amt)/per));

    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter amount offered : ");
        int amt = sc.nextInt();

        System.out.println("Enter percentage at which amt is raised : ");
        int per = sc.nextInt();

        eval(amt,per);

        sc.close();
    } 
}
