import java.util.* ;
import java.io.*; 

public class Main {
	
	public static long maxSubarraySum(int[] nums, int n) {
		// write your code here
		long sum = 0, max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            sum += nums[i];
            max = Math.max(sum, max);
            if(sum < 0) sum = 0;
        }
        return max < 0 ? 0 : max;
	}
	
	public static void main(String [] args){
		int [] arr = {-2,3,5,5,2,-9,-7,3,5};
		System.out.println(maxSubarraySum(arr, arr.length));
		//ans= 15
	}
	
}
