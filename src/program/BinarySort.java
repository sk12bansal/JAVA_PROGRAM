package program;

import java.util.*;

class Object1{
    int ele;
    int bits;
    Object1(int ele,int bits){
        this.ele = ele;
        this.bits = bits;
    }
}
public class BinarySort {
    public static void main(String args[]){
        //List<Integer>  list = Arrays.asList(5, 2, 3, 9, 4, 6, 7, 15, 32);
        List<Integer>  list = Arrays.asList(3,5,10,7,14);
        List<Integer> bits = new ArrayList<>();
        List<Object1> list1 = new ArrayList<>();
        for(int i=0;i<list.size();i++){
            Object1 object1 = new Object1(list.get(i),Integer.bitCount(list.get(i)));
            list1.add(object1);
        }
        Collections.sort(list1, new Comparator<Object1>() {
            @Override
            public int compare(Object1 o1, Object1 o2) {
                if(o2.bits ==o1.bits){
                    return o1.ele-o2.ele;
                }else{
                    return o1.bits-o2.bits;
                }
            }
        });
    for(int i=0;i<list1.size();i++){
        System.out.println(list1.get(i).ele+"  "+list1.get(i).bits);
        //System.out.println(list1.get(i).ele +" ");
    }
    }
}
