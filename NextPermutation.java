import java.util.* ;
import java.io.*; 
import java.util.ArrayList;
import java.util.Collections;

public class NextPermutationClass 
{
	public static ArrayList<Integer> nextPermutation(ArrayList<Integer> nums) 
	{
		int n= nums.size(), dip = -1;
        for(int i=n-2; i>=0; i--){
            if(nums.get(i) < nums.get(i+1)) {
                dip = i;
                break;
            }
        }
        if(dip == -1){
            int l = 0, r = n-1;
            while(l <= r){
                swap(nums, l, r);
                l++;r--;
            }
            return nums;
        }
        for(int i=n-1; i>dip; i--){
            if(nums.get(i) > nums.get(dip)){
                swap(nums, dip, i);
                break;
            }
        }
        int r = n-1, l = dip+1;
        while(l <= r){
            swap(nums , l, r);
            l++; r--;
        }
		return nums;
	}
	public static void swap(ArrayList<Integer> nums, int i, int j){
        int temp  = nums.get(i);
        nums.set(i, nums.get(j));
        nums.set(j , temp);
    }
	/*
	public static void main (String [] args){
		ArrayList<Integer> res = new ArrayList<>();
		res.add(1); res.add(2); res.add(4); res.add(1);
		for(int i : nextPermutation(res)){
			System.out.print(i);
		}
	}
	*/
}
