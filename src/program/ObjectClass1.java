package program;
import java.lang.Object;
public class ObjectClass1 {

    @Override
    public String toString(){
        return "Suraj Kumar";
    }
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public static void main(String args[]){
        //ObjectClass1 s1 = new ObjectClass1();
        ObjectClass1 s1 = new ObjectClass1();
        System.out.println(s1);
    }
}
