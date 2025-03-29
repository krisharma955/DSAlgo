package Stacks;

import java.util.Stack;

public class PrefixToInfix {
    public static String preToin(String s) {
        Stack<String> st = new Stack<>();
        int i = s.length()-1;
        while(i>=0) {
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(s.charAt(i))) {
                st.push(String.valueOf(ch));
            }
            else {
                String t1 = st.pop();
                String t2 = st.pop();
                String str = "(" + t1 + ch + t2 + ")";
                st.push(str);
            }
            i--;
        }
        return st.peek();
    }
    public static void main(String[] args) {
        System.out.println(preToin("*+PQ-MN"));
    }
}
