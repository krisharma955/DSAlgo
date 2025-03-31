package Stacks;

import java.util.ArrayList;
import java.util.Stack;

public class NSE {
    public static ArrayList<Integer> reverse(ArrayList<Integer> list) {
        int start = 0;
        int end = list.size()-1;
        while(start<end) {
            int temp = list.get(end);
            list.set(end, list.get(start));
            list.set(start, temp);
            start++;
            end--;
        }
        return list;
    }
    public static ArrayList<Integer> nextSmallerElement(ArrayList<Integer> arr, int n){
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        for(int i = arr.size()-1; i>=0; i--) {
            while(!st.isEmpty() && st.peek()>=arr.get(i)) {
                st.pop();
            }
            if(st.isEmpty()) list.add(-1);
            else {
                list.add(st.peek());
            }
            st.push(arr.get(i));
        }
        return reverse(list);
    }
    public static void main(String[] args) {
    }
}
