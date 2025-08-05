import java.util.*;

public class Arrlinearsearch {

    public static int linearsearch(int marks[],int key) {
        for(int i = 0; i<marks.length; i++) {
            if(marks[i]==key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int marks[] = {99,98,97,96,95,94,93,92,91,90};
        // System.out.println(marks.length);
        System.out.println("99,98,97,96,95,94,93,92,91,90");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number whose index is req : ");
        int key = sc.nextInt();

        int index = linearsearch(marks,key);

        if(index==-1){
            System.out.println("not found");
        } else{System.out.println("index of " +key+ " = " +index);}

        sc.close();
    }
}
