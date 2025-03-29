package Stacks;

import java.util.Stack;

public class PostfixToInfix {
    public static String postToin(String s) {
        Stack<String> st = new Stack<>();
        int i = 0;
        while(i<s.length()) {
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(s.charAt(i))) {
                st.push(String.valueOf(ch));
            }
            else {
                String t1 = st.pop();
                String t2 = st.pop();
                String str = "(" + t2 + s.charAt(i) + t1 + ")";
                st.push(str);
            }
            i++;
        }
        return st.peek();
    }
    public static void main(String[] args) {
        System.out.println(postToin("AB-DE+F*/"));
    }
}
