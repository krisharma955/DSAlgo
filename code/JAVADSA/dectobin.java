import java.util.Scanner;

public class dectobin {

    public static void dectobi(int n) {
    int mynum = n;
    int pow = 0;
    int bin = 0;
    while(n>0) {
      int rem = n%2;
      bin = bin + rem*(int)Math.pow(10,pow);
      pow++;
      n = n/2;
    }
    System.out.println("decimal of " +mynum+ " = " +bin);
  }
    

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a decimal number : ");
    int n = sc.nextInt();
    dectobi(n);
    sc.close();
    
 }
    
}
