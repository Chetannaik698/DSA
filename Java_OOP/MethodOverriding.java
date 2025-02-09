class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}

class Deer extends Animal {
    void eat() {
        System.out.println("Eat's Grass");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Deer d1 = new Deer();
        d1.eat();
    }
}
