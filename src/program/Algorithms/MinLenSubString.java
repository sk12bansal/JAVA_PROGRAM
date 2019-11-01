package program.Algorithms;

public class MinLenSubString {
    public static void main(String args[]){
        String str = "this is a test string";
        String pat = "tist";

        int[] hash_pat = new int [256];
        int[] hash_str = new int [256];
        int start =0,start_index =-1,min_len=Integer.MAX_VALUE;
        int count =0;

        for(int i=0;i<pat.length();i++){
            hash_pat[pat.charAt(i)]++;
        }
        for(int i=0;i<str.length();i++){
            hash_str[str.charAt(i)]++;

            if(hash_pat[str.charAt(i)]!=0  && hash_str[str.charAt(i)]<=hash_pat[str.charAt(i)]){
                count++;
            }

            if(count == pat.length()){
                while(hash_str[str.charAt(start)]> hash_pat[str.charAt(start)] || hash_pat[str.charAt(start)]==0){
                        if(hash_str[str.charAt(start)] > hash_pat[str.charAt(start)]){
                            hash_str[str.charAt(start)]--;
                        }
                        start++;
                }
                int window_len = i-start+1;
                if(min_len>window_len){
                    min_len = window_len;
                    start_index = start;
                }
            }
        }

        // If no window found
        if (start_index == -1)
        {
           System.out.println("No such window exists");
        }

        System.out.println(str.substring(start_index, start_index+min_len));

    }
}
