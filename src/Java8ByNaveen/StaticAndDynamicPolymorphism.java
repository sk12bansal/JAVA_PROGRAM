package Java8ByNaveen;
class X {
    void show(){
        System.out.println("i am from class X");
    }
}
class Y extends X {
    @Override
    void show(){
        System.out.println("i am from class Y");
    }
}
public class StaticAndDynamicPolymorphism {
    public static void main(String args[]){
        X obj =new X(); // static polymorphism || compile time polymorphism
        obj.show();
        X obj1 = new Y(); // dynamic polymorphism  || run time polymorphism
        obj1.show();


    }
}
