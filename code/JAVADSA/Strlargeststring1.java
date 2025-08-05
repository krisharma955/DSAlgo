public class Strlargeststring1 {
    public static void main(String args[]) { //lexicographic order
        String name[] = {"lewis","lando","george","carlos"};
        String largest = name[0];
        for(int i = 0; i<name.length; i++) {
            if(largest.compareTo(name[i])<0) {
                largest = name[i];
            }
        }
        System.out.println(largest);
    }
}
    

