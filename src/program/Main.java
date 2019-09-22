package program;

// Accessing Grandparent’s member in Java using super
class Grandparent {
    public void Print() {
        System.out.println("Grandparent's Print()");
    }
}

class Parent extends Grandparent {
    public void Print() {
        System.out.println("Parent's Print()");
    }
}

class Child extends Parent {
    public void Print() {
       // super.super.Print();  // Trying to access Grandparent's Print() error
       /* There is error in line “super.super.print();”. In Java, a class cannot directly access the grandparent’s members.
        It is allowed in C++ though. In C++, we can use scope resolution operator (::) to access any ancestor’s member in
        inheritance hierarchy. In Java, we can access grandparent’s members only through the parent class.*/
        System.out.println("Child's Print()");
    }
}

public class Main {
    public static void main(String[] args) {
        Child c = new Child();
        c.Print();
    }
}
