package Stacks;

import java.util.Stack;

public class PrefixToPostfix {
    public static String preTopost(String s) {
        Stack<String> st = new Stack<>();
        int i = s.length()-1;
        while(i>=0) {
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch)) {
                st.push(String.valueOf(ch));
            }
            else {
                String t1 = st.pop();
                String t2 = st.pop();
                st.push(t1 + t2 + ch);
            }
            i--;
        }
        return st.peek();
    }
    public static void main(String[] args) {
        System.out.println(preTopost("/-AB*+DEF"));
    }
}
