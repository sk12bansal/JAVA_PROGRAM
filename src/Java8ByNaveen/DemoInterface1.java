package Java8ByNaveen;

interface A {
    default void show() {
        System.out.println("A");
    }
}

interface B {
    default void show() {
        System.out.println("B");
    }
}

class C {
    void show() {
        System.out.println("C class");
    }
}

public class DemoInterface1 extends C {
    public static void main(String args[]) {
        DemoInterface1 demo = new DemoInterface1();
        demo.show();
    }
}
