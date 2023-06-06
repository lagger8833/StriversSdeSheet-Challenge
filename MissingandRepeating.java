import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class MissingandRepeat {

    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        // Write your code here
        int [] freq = new int [n+1];
        for(int i : arr){
            freq[i]++;
        }
        int missing = -1, repeat = -1;
        for(int i=0; i<=n; i++){
            if(freq[i] > 1) repeat = i;
            if(freq[i] == 0) missing = i;
        }
        return new int[] {missing, repeat};
    }
    public static void main(String [] args){
        int [] arr = {1,2,2,3,4,6};
        for(int i : missingAndRepeating(arr, arr.length)){
            System.out.print(i);
        }
        //ans = {2,5};
    }
}