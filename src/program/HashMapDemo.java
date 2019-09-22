package program;
import java.util.*;

public class HashMapDemo {
    public static void main(String[] args){
        HashMap<Integer,String> hm = new HashMap<>();
        hm.put(100,"suraj");
        hm.put(101,"rahul");
        hm.put(102,"aman");

        for(Map.Entry m : hm.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        hm.putIfAbsent(103, "Gaurav");
        System.out.println("After invoking putIfAbsent() method ");
        for(Map.Entry m:hm.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

        HashMap<Integer,String> map=new HashMap<>();
        map.put(104,"Ravi");
        map.putAll(hm);
        System.out.println("After invoking putAll() method ");
        for(Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }


    }
}
