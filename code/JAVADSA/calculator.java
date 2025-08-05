import java.util.*;
public class calculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("WELCOME TO CALCULATOR !");
        System.out.println("Choose a Operation :");
        System.out.println("1. Addition");
        System.out.println("2. Subtractoin");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Floor Division");

        int choice = sc.nextInt();
        System.out.println("Enter the first number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number : ");
        int num2 = sc.nextInt();

        switch (choice) {
            case 1 : {System.out.println("Result = " +(num1+num2));}
            break;
            case 2 : {System.out.println("Result = " +(num1-num2));}
            break;
            case 3 : {System.out.println("Result = " +(num1*num2));}
            break;
            case 4 : {System.out.println("Result = " +(num1/num2));}
            break;
            case 5 : {System.out.println("Result = " +(num1%num2));}
            break;
            default : {System.out.println("Choose a valid operator");}
        }

        sc.close();
    }
    
}
