public class Majority2 {
	public static int findMajority(int[] nums, int n) {
		// Write your code here.
		int element = -1;
        int count = 0;
        for(int i=0; i<n; i++){
            if(element == -1){
                element = nums[i];
                count++;
            }
            else if(nums[i] == element) count++;
            else count--;
            if(count == 0){
                element = -1;
            }
        }
        if(count <= 0) return -1;
		count = 0;
		for(int i=0; i<n; i++){
			if(nums[i] == element) count++;
		}
		if(count <= n/2) return -1;
        return element;
	}
	public static void main(String [] args){
		int [] arr = {1.3.2,2,1,3,2,2,5,2,2,2};
		System.out.print(findMajority(arr, arr.length));
		//ans = 2;
	}
}