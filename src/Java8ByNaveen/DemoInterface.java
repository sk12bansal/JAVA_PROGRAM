package Java8ByNaveen;

interface I {
    default void show() {
        System.out.println("I");
    }
}

interface J {
    default void show() {
        System.out.println("J");
    }
}

public class DemoInterface implements I,J {
    public static void main(String args[]) {
        DemoInterface demo = new DemoInterface();
        demo.show();
    }

    @Override
    public void show() {
        System.out.println("DemoInterface");
    }
}
