package program;

abstract class SuperClass{
    public abstract void doSomeThings();
}

class A extends SuperClass{

    @Override
    public void doSomeThings() {
        System.out.println("doSomeThings from A");
    }

    void methodA(){

    }
}

class B extends SuperClass{

    @Override
    public void doSomeThings() {
        System.out.println("doSomeThings from B");
    }

    void methodB(){

    }
}
// Here is ambiguity problem
/*class C extends A,B{
    public void test(){
        //calling super class method
        doSomeThings();
    }
}*/
public class MultipleInheritance {
}
