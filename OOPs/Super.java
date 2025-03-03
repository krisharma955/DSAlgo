package OOPs;

public class Super {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Horse h = new Horse();
    }
}

class Animal {
    Animal() {
        System.out.println("animal constructor is called");
    }
}

class Horse extends Animal {
    Horse() {
        super(); //called constructor of immediate parent class
        System.out.println("Horse constructor is called");
    }
}
