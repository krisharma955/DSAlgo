package Recursion;

public class RemoveDuplicatesSTR {
    public static void removeDuplicates(String str, int index, StringBuilder newStr, boolean map[]) {
        str = str.toLowerCase();
        if(index==str.length()) {
            System.out.println(newStr);
            return;
        }
        char currchar = str.charAt(index);
        if(map[currchar-'a']==true) { //duplicate
            removeDuplicates(str, index+1, newStr, map);
        }
        else {
            map[currchar-'a'] = true;
            removeDuplicates(str, index+1, newStr.append(currchar), map);
        }
    }
    public static void main(String[] args) {
        removeDuplicates("LifeGoesOnAndOn", 0, new StringBuilder(""), new boolean[26]);
    }
}
