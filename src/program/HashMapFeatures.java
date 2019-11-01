package program;

import java.util.HashMap;
import java.util.Map;

class Person1{
    int age;
    String name;

    Person1(){

    }

    Person1(String name,int age){
        this.name = name;
        this.age = age;
    }
}

class Person2{
    int age;
    String name;

    Person2(){

    }

    Person2(String name,int age){
        this.name = name;
        this.age = age;
    }
}

public class HashMapFeatures {
    public static void main(String args[]){
        Person1 p1 = new Person1("suraj",26);
        Person2 p2 = new Person2("suraj",26);

        Map<Object,String> map = new HashMap<>();

        map.put(p1,"Cisco");
        map.put(p2,"Coviam");

        System.out.println(map.get(p1));
        System.out.println(map.get(p2));
    }
}
