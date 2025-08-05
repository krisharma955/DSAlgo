import java.util.*;
public class IMP2 {

  public static double mclaren(double x, double y, double z) {    
    return ((z/(x*y))*100);
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int t = sc.nextInt();

    for(int i = 0; i<t; i++) {
      double x = sc.nextInt(); //no of schools
      double y = sc.nextInt(); //no of students in each school
      double z = sc.nextInt(); //no of students passed
      double passed = mclaren(x,y,z); 
      if(passed>50.0) {
        System.out.println("YES");
      } else{System.out.println("NO");}
    }
    sc.close();
  }
}


 

 