package program;

public class PalindromeCheck {
    public static void main(String args[]){
        String A = "MADAM";
        System.out.println(A.equals( new StringBuilder(A).reverse().toString())
                ? "Yes" : "No" );
    }
}
