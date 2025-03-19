package Stacks;

import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i = 0; i<s.length(); i++) {
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[') {
                st.push(s.charAt(i));
            }
            else {
                if(st.empty()) return false;
                char ch = st.peek();
                st.pop();
                if((s.charAt(i) == (')') && ch != '(') || (s.charAt(i) == ('}') && ch != '{') || (s.charAt(i) == (']') && ch != '[')) {
                    return false;
                }
            }
        }
        return st.empty();
    }
    public static void main(String[] args) {
        System.out.println(isValid("(){}}{"));
    }
}
