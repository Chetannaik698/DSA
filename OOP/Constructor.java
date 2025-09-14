package OOP;

public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student("Chetan", 05);
        System.out.println(s1.name + " " + s1.roll);
    }
}

class Student {
    String name;
    int roll;

    Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }
}
