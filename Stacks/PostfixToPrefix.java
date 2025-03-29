package Stacks;

import java.util.Stack;

public class PostfixToPrefix {
    public static String postTopre(String s) {
        Stack<String> st = new Stack<>();
        int i = 0;
        while(i<s.length()) {
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch)) {
                st.push(String.valueOf(ch));
            }
            else {
                String t1 = st.pop();
                String t2 = st.pop();
                st.push(ch + t2 + t1);
            }
            i++;
        }
        return st.peek();
    }
    public static void main(String[] args) {
        System.out.println(postTopre("AB-DE+F*/"));
    }
}
