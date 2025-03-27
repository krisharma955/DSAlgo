package Stacks;

import java.util.Stack;

public class InfixToPrefix {
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
    public static String reverse(String s) {
        char[] arr = s.toCharArray();
        int left = 0, right = arr.length - 1;
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        for(int i = 0; i<arr.length; i++) {
            if(arr[i] == ')') arr[i] = '(';
            else if(arr[i] == '(') arr[i] = ')';
        }
        return new String(arr);
    }
    public static String inTopre(String s) {
        s = reverse(s);
        Stack<Character> st = new Stack<>();
        int i = 0;
        String ans = "";
        while(i<s.length()) {
            if(Character.isLetterOrDigit(s.charAt(i))) ans += s.charAt(i);
            else if(s.charAt(i)=='(') st.push(s.charAt(i));
            else if(s.charAt(i)==')') {
                while(!st.isEmpty() && st.peek()!='(') {
                    ans += st.peek();
                    st.pop();
                }
                st.pop();
            }
            else {
                if(s.charAt(i) == '^') {
                    while(!st.isEmpty() && priority(s.charAt(i)) <= priority(st.peek())) {
                        ans += st.pop();
                    }
                }
                else {
                    while(!st.isEmpty() && priority(s.charAt(i)) < priority(st.peek())) {
                        ans += st.pop();
                    }
                    st.push(s.charAt(i));
                }
            }
            i++;
        }
        while(!st.isEmpty()) {
            ans += st.pop();
        }
        System.out.println(ans);
        ans = reverse(ans);
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(inTopre("(A+B)*C-D+F"));
    }
}
