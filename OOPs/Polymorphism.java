package OOPs;

public class Polymorphism {
    public static void main(String[] args) {
        // Calculator calc = new Calculator();
        // //Method OverLoading - Compile time Polymorphism
        // System.out.println(calc.sum(1, 2));
        // System.out.println(calc.sum((float)1.5, (float)1.5));
        // System.out.println(calc.sum(1, 2, 4));

        Deer d = new Deer();
        d.eat();
        
    }
}

class Animal {
    void eat() {
        System.out.println("eats annything");
    }
}

class Deer extends Animal {
    void eat() {
        System.out.println("eats grass");
    }
}


class Calculator { 
    int sum(int a, int b) {
        return a+b;
    }

    float sum(float a, float b) {
        return a+b;
    }

    int sum(int a, int b, int c) {
        return a+b+c;
    }
}
