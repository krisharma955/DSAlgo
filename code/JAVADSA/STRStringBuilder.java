public class STRStringBuilder {
    public static void main(String args[]) {
        //StringBuilder
        StringBuilder sb = new StringBuilder("");
        for(char ch = 'a'; ch<='z'; ch++) {
         sb.append(ch);
        }
        System.out.println(sb);
        System.out.println(sb.length());
        //time complexity = O(26)
        //String builder can do and use all fxns of strings 
     }
    
}
