import java.util.*;
public class MinPlatform {
    public static int calculateMinPatforms(int at[], int dt[], int n) {
        // Write your code here.
        Arrays.sort(at); Arrays.sort(dt);
        int i = 1, max = 1 ,curr = 1, j =0;
        while(i < n && j < n){
            if(at[i] <= dt[j]){
                curr++;
                i++;
            }
            else{
                curr--;
                j++;
            }
            max = Math.max(max, curr);
        }
        return max;
    }
}