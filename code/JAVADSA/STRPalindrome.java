public class STRPalindrome {
    public static boolean Palindrome(String s) {
       String str = "";
       for(int i = 0; i<s.length(); i++) {
        if(Character.isLetterOrDigit(s.charAt(i))) {
            str += s.charAt(i);
        }
       }

       str = str.toLowerCase();
       for(int i = 0; i<str.length(); i++) {
        if(str.charAt(i)!=str.charAt(str.length()-1-i)) {
            return false;
        }
       }
       return true;
    }
    public static void main(String args[]) {
        String s = "AmanaplanacanalPanama";
        System.out.println(Palindrome(s));
    }
}
