import java.util.Scanner;

public class matrix {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int [][] mat = new int[3][3];

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                mat[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(i==j) {
                    System.out.print(mat[i][j] + " ");
                }

               // if(i!=j && j==i && i!=j)
            }
            System.out.println();
        }
    }
}
