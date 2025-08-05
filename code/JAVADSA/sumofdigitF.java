import java.util.Scanner;

public class sumofdigitF {

    public static int sumofdigits(int n) {
    int i = 0;
    while(n>0) {
      int lastdigit = (n%10);
      i+=lastdigit;
      n = n/10;
    } 
    return i;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println(sumofdigits(n));
    sc.close();
    
  } 
    
}
