import java.util.Scanner;

public class iseven {

     public static boolean isEven(int n) {
    boolean iseven = false;
    if(n%2==0) {
      iseven = true;
      
    }
    return iseven;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println(isEven(n));
    sc.close();
    
  } 
}
