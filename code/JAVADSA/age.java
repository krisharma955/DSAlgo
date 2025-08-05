import java.util.*;
public class age {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER AGE: ");
        int age = sc.nextInt();

        if(age<13) {
            System.out.println("CHILD");
        }
        else if(age>=13 && age<17) {
            System.out.println("TEENAGER");
        }
        else {System.out.println("ADULT");}

        sc.close(); 
    }
    
}
