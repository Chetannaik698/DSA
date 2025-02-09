abstract class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
    abstract void walk();
}

class Horse extends Animal {
    void walk() {
        System.out.println("Walks on four legs");
    }
}
 
class Chicken extends Animal {
    void walk() {
        System.out.println("Walks on 2 legs");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();

        Chicken c = new Chicken();
        c.eat();
        c.walk();
    }
}
