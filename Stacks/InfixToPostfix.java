package Stacks;

import java.util.Stack;

public class InfixToPostfix {
    public static int priority(char ch) {
        switch(ch) {
            case '+' :
            case '-' :
              return 1;
            case '*' :
            case '/' :
              return 2;
            case '^' :
              return 3;
        }
        return -1;
    }
    public static String infixTopostfix (String s) {
        Stack<Character> st = new Stack<>();
        int i = 0;
        String ans = "";
        while(i<s.length()) {
            // if((s.charAt(i)>= 'A' && s.charAt(i)<='Z') || (s.charAt(i)>= 'a' && s.charAt(i)<='z') || (s.charAt(i)>= 0 && s.charAt(i)<=9)) {
            //     ans += s.charAt(i);
            // }
            if(Character.isLetterOrDigit(s.charAt(i))) ans += s.charAt(i);
            else if(s.charAt(i) == '(') {
                st.push(s.charAt(i));
            }
            else if(s.charAt(i) == ')') {
                while(!st.isEmpty() && st.peek()!= '(') {
                    ans += st.peek();
                    st.pop();
                }
                st.pop();
            }
            else {
                while(!st.isEmpty() && priority(s.charAt(i)) <= priority(st.peek())) {
                    ans += st.peek();
                    st.pop();
                }
                st.push(s.charAt(i));
            }
            i++;
        }
        while(!st.empty()) {
            ans += st.peek();
            st.pop();
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(infixTopostfix("a+b*(c^d-e)^(f+g*h)-i"));
    }
}
