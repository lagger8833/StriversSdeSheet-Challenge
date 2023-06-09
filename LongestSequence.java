import java.io.*;
import java.util.* ;

public class Main {
    public static void main(String [] args){
        int [] arr = {1,1,2,3,2,4,2,6,7,8,3,5};
        System.out.println(lengthOfLongestConsecutiveSequence(arr, arr.length));
        //ans = 8;
    }
    public static int lengthOfLongestConsecutiveSequence(int[] nums, int N) {
        // Write your code here.
        if(N == 0) return 0;
        Set<Integer> set = new HashSet<>();
        int longest = 1;
        for(int num : nums){
            set.add(num);
        }
        for(int num : set){
            if(set.contains(num - 1)) continue;
            int count  = 1;
            int x = num;
            while(set.contains(x+1)){
                x++;
                count++;
            }
            longest = Math.max(longest, count);
        }
        return longest;   
    }
}