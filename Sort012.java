import java.util.* ;
import java.io.*; 
public class SortNums 
{
    public static void swap(int [] nums, int index1, int index2){
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
    public static void sort012(int[] nums)
    {
        //Write your code here
        int zeroes = 0;
        int ones = 0;
        int twos = nums.length-1;
        while(ones <= twos){
            switch(nums[ones]){
                case 0:{
                    swap(nums, zeroes, ones);
                    zeroes++;
                    ones++;
                    break;
                }
                case 1:{
                    ones++;
                    break;
                }
                case 2:{
                    swap(nums, twos, ones);
                    twos--;
                    break;
                }
            }
        }
    }
    public static void main (String [] args){
        int [] nums = {0,2,1,1,2,0,0,1,2};
        sort012(nums);
        for(int n : nums){
            System.out.print(n);
        }
        //ans - {0,0,0,1,1,1,2,2,2}
    }
}
