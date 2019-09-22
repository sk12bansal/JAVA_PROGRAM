package program.Algorithms;

public class LongestPalindromeString {
    public static void main(String args[]){
        String str = "aaaabbaa";
        int max_len =1;
        int palindromeBegin =0;
        int n = str.length();
        int flag =0;
        boolean [][] dp = new boolean[n][n];

        for(int i=0;i<n;++i){
            dp[i][i] = true;
        }
        for(int i=0;i<n-1;++i){
            if(str.charAt(i) == str.charAt(i + 1)){
                dp[i][i+1] = true;
                if(flag == 0) {
                    palindromeBegin = i;
                    max_len = 2;
                    flag =1;
                }
            }
        }

        for(int k=3;k<=n;++k){
            for(int i=0;i<n-k+1;++i){
                int j = i+k-1;
                if(str.charAt(i) == str.charAt(j) && dp[i+1][j-1]){
                    dp[i][j] = true;
                    if(k>max_len) {
                        palindromeBegin = i;
                        max_len = k;
                    }
                }
            }
        }

        for(int i=palindromeBegin; i<=palindromeBegin+max_len-1; i++){
            System.out.print(str.charAt(i));
        }
    }
}
