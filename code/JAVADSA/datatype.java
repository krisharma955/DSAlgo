import java.util.*;
public class datatype {
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      double b = sc.nextDouble();
      sc.nextLine();
      String c = sc.next();  //next and nextLine both can be used
      sc.close();
      
      System.out.println("String: " +c);
      System.out.println("Double: " +b);
      System.out.println("Int: " +a);
  }
 }

