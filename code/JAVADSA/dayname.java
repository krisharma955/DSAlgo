import java.util.*;
public class dayname {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter week number : ");
        int num = sc.nextInt();

        switch (num) {
            case 1 : {System.out.println("Monday");}
            break;
            case 2 : {System.out.println("Tuesday");}
            break;
            case 3 : {System.out.println("Wednesday");}
            break;
            case 4 : {System.out.println("Thrusday");}
            break;
            case 5 : {System.out.println("Friday");}
            break;
            case 6 : {System.out.println("Saturday");}
            break;
            case 7 : {System.out.println("Sunday");}
            break;
            default : {System.out.println("enter a number btw 1 and 7");}
        }

        sc.close();

    }
    
    
    
}
