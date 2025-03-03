package OOPs;

public class OOPS {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
       //public - keyword - access specifier
    //    Pen p1 = new Pen(); // created a pen object called p1
    //    p1.setColor("Blue");
    //    System.out.println(p1.getColor()); //after private  
    //    p1.setTip(5);
    //    System.out.println(p1.getTip());
    //    //p1.setColor("Yellow");
    //    p1.setColor("Yellow");
    //    System.out.println(p1.getColor());

    //    BankAccount myAccount = new BankAccount();
    //    myAccount.userName = "KrishSharma";
    //    //myAccount.password = "abcd" //error (private)
    //    myAccount.setPassword("abcd");
    //    //can't access password here.

    Student s1 = new Student();
    Student s2 = new Student("krish");
    Student s3 = new Student(22);
    // Student s4 = new Student("lewis", 44); //error bcz no constructor has a striing and a roll

    s1.name = "krish";
    s1.roll = 23;
    s1.pass = "abcd";
    s1.marks[0] = 100;
    s1.marks[1] = 90;
    s1.marks[2] = 80;

    Student s5 = new Student(s1);
    s5.pass = "xyz";
    s1.marks[2] = 100;

    for(int i = 0; i<3; i++) {
        System.out.println(s5.marks[i]);
    }


    }
}

// class BankAccount {
//     public String userName;
//     private String password;
//     void setPassword(String pwd) {
//         password = pwd;
//     }
// }

// class Pen {
//     private String color;
//     private int tip;

//     String getColor() { // Getter
//         return this.color; //this - is a keyword used to refer to the current object.
//     }
//     int getTip() { //Getter
//         return this.tip;
//     }
//     void setColor(String newColor) { //setter
//         this.color = newColor;
//     }

//     void setTip(int newTip) { //setter
//         this.tip = newTip;
//     }
// }

class Student {
    String name;
    int roll;
    String pass;
    int marks[];

    //Constructor Overloading - this is an ex of polymorphism (multiple forms)
    Student() { // non-parameterized constructor
        // System.out.println("constructor is called..");
        marks = new int[3];
    }
    Student(String name) { //parameterized constructor
        this.name = name;
        marks = new int[3];
    }
    Student(int roll) {
        this.roll = roll;
        marks = new int[3];
    }

    //copy constructor - shallow copy (reference is copied) (changes made are reflected)
    // Student(Student s1) {
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     marks = new int[3];
    //     this.marks = s1.marks; //reference of array is copied
    // }

    //deep copy (Changes don't reflect)
    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for(int i = 0; i<marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
    }

    //LAZY COPY


}