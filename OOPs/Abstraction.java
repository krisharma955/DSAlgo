package OOPs;

public class Abstraction {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        // Horse h = new Horse();
        // h.eat();
        // h.walk();
        // System.out.println(h.color);

        // Chicken c = new Chicken();
        // c.eat();
        // c.walk();

        Mustang myHorse = new Mustang();
        //Animal -> Horse -> Mustang
        //Constructor calling heirarchy
    }
}

abstract class Animal {
    String color;

    Animal() {
        color = "brown";
        System.out.println("Animal constructor called");
    }

    void eat() {
        System.out.println("animal eats");
    }

    abstract void walk();
}

class Horse extends Animal {
    Horse() {
        System.out.println("Horse constructor called");
    }
    void walk() {
        System.out.println("walks on 4 legs");
    }
    void changeColor() {
        color = "dark brown";
    }
}

class Mustang extends Horse{
    Mustang() {
        System.out.println("Mustang constructor called");
    }
}

class Chicken extends Animal {
    void walk() {
        System.out.println("walks on 2 legs");
    }
    void changeColor() {
        color = "yellow";
    }
}
