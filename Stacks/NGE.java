package Stacks;

import java.util.ArrayList;
import java.util.Stack;

public class NGE {
    public static ArrayList<Integer> NGEIbrute(int arr[]) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i<arr.length; i++) {
            boolean found = false;
            for(int j = i+1; j<arr.length; j++) {
                if(arr[j]>arr[i]) {
                    list.add(arr[j]);
                    found = true;
                    break;
                }
            }
            if(!found) {
                list.add(-1);
            }
        }
        return list;
    }
    public static ArrayList<Integer> NGEIopt(int arr[]) {
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        for(int i = arr.length-1; i>=0; i--) {
            while(!st.isEmpty() && st.peek()<=arr[i]) {
                st.pop();
            }
            if(st.isEmpty()) {
                list.add(-1);
            }
            else {
                list.add(st.peek());
            }
            st.push(arr[i]);
        }
        return reverse(list);
    }
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
    
    public static void main(String[] args) {
    }
}
