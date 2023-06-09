import java.util.* ;
import java.io.*; 
public class PrintPermutation {
    public static void main(String [] args){
        System.out.println(findPermutations("abc"));
        //ans = ["abc","acb","bac","bca","cab","cba"]
    }
    public static List<String> findPermutations(String s) {
        List<String> res = new ArrayList<>();
        permute(res, s, new String());
        Collections.sort(res);
        return res;
    }
    public static void permute(List<String> res, String s, String ans){
        int n = s.length();
        if(n == 0){
            res.add(ans);
            return;
        }
        for(int i=0 ; i<n; i++){
            char c = s.charAt(i);
            String left = s.substring(0, i);
            String right = s.substring(i+1);
            String combined = left + right;
            permute(res, combined, ans + c);
        }
    }
}