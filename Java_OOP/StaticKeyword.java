public class StaticKeyword {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.schoolName = "RNS";

        Student s2 = new Student();
        System.out.println(s2.schoolName);  // Prints "RNS"
    }
}

class Student {
    String name;
    int roll;
    static String schoolName;

    // Explicitly define a no-argument constructor
    Student() {}

    void setName(String name) { 
        this.name = name;
    }

    String getName() { 
        return this.name;
    }
}
