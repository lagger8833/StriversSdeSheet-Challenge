import java.util.* ;
import java.io.*; 
public class ThreeSum {

	public static ArrayList<ArrayList<Integer>> findTriplets(int[] nums, int n, int K)  {
	    ArrayList<ArrayList<Integer>> res= new ArrayList<>();
        Arrays.sort(nums);
        int previ = -1, prevj = -1, prevk = -1;
        for(int i=0; i<n; i++){
            if(i >  0 && nums[i] == nums[i-1]) continue;
            int j = i+1, k = n-1;
            while(j < k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum > K) k--;
                else if(sum < K) j++;
                else{
                    ArrayList<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    res.add(temp);
                    j++;
                    k--;
                    while(nums[j] == nums[j-1] && j < k){j++;}
                    while(nums[k] == nums[k+1] && j < k){k--;}
                }
            }
        }
        return res;

	}
}
