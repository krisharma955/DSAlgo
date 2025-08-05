public class prime {

    // //for n>=2
    // public static boolean isprime(int n) {
    //    //corner cases
    //    //for2

    //     if(n==2) {
    //         return true;
    //       }
    //     boolean isprime = true;
    //     for(int i = 2; i<=(n-1); i++) {
    //       if(n%i==0) {
    //         isprime = false;
    //         return isprime;
    //       }
    //     }
    //     return isprime;
    
    //   }
    //   public static void main(String args[]) {
    //     System.out.println(isprime(12));
    //   } 
    


    public static boolean isprime(int n) {
        if(n==2) {
          return true;
        }
    
        for(int i = 2; i<=Math.sqrt(n); i++) {
          if(n%i==0) {
            return false;
          }
        }
        return true;
      }
    
    
    
      
      public static void main(String args[]) {
        System.out.println(isprime(75));
        
      }
}
