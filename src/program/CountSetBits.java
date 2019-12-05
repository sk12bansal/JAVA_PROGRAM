package program;

public class CountSetBits {
    public static void main(String args[]){
        int n=243;
        int count =0;

        while(n>0){
            count +=n&1;
            //System.out.println(count);
            n= n>>1;
            //System.out.println(n);
        }
        if((5&(1<<2))!=0){

        }
        System.out.println();
    }
}
