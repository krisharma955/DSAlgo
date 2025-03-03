package OOPs;

public class Inheritance {
    public static void main(String[] args) {
        // Fish shark = new Fish();
        // shark.eat();

        // Dog dobby = new Dog();
        // dobby.eat();
        // dobby.legs = 4;
        // System.out.println(dobby.legs);

        bird sparrow = new bird();
        sparrow.breathe();
    }
}

//Base Class
class Animal {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathes");
    }
}

//Mammal ,fish, bird - HEERARCHIAL INHERITANCE
class Mammal extends Animal{
    int legs;
    void walk() {
        System.out.println("walks");
    }
}

class fish extends Animal{
    void swim() {
        System.out.println("swims");
    }
}

class bird extends Animal{
    void fly() {
        System.out.println("fly");
    }
}


class Dog extends Mammal{ //MULTI LVL INHERITANCE
    String breed;
}


//Derived Class / subclass
class Fish extends Animal { //SINGLE LEVEL INHERITANCE
    int fins;

    void swim() {
        System.out.println("swims in water");
    }
}


