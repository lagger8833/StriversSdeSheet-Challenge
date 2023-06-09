import java.util.ArrayList;

public class KthPermutaionString {
    public static void main(String [] args){
        System.out.println(kthPermutation(4, 17));
        // ans = 3412
    }
    public static String kthPermutation(int n, int k) {
        // Write your code here.
        int fact = 1;
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=1; i<n; i++){
            fact = fact * i;
            al.add(i);
        }
        al.add(n);
        StringBuilder sb = new StringBuilder();
        k--;
        while(true){
            sb.append(al.remove(k/fact));
            if(al.size() == 0) break;
            k %= fact;
            fact = fact/al.size();
        }
        return sb.toString();
    }
}