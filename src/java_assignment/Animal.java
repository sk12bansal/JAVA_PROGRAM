package java_assignment;


class Dog extends Animal {

    @Override
    public void shout() {
        System.out.println("woof");
    }
}

class Horse extends Animal {

    @Override
    public void shout() {
        System.out.println("Neigh");
    }
}

class Cat extends Animal {

    @Override
    public void shout() {
        System.out.println("Meow");
    }
}

public class Animal {

    public void shout() {
        System.out.println("Animal is making a sound");
    }

    public static void main(String args[]) {
        Animal obj = new Dog();
        obj.shout();
        obj = new Horse();
        obj.shout();
        obj = new Cat();
        obj.shout();
    }
}

