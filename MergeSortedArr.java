import java.io.*;
import java.util.* ;

public class MergeSortedArr {
    public static int[] ninjaAndSortedArrays(int nums1[], int nums2[], int m, int n) {
        // Write your code here.
        int k = m + n - 1;
        int i = m - 1;
        int j = n - 1;
        while(i >= 0 && j >= 0){
            if(nums1[i] > nums2[j]){
                nums1[k] = nums1[i];
                i--;
            }else{
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
        while(j >= 0){
            nums1[k] = nums2[j];
            j--;
            k--;
        }
        return nums1;

    }
    public void swap(int[] nums , int i, int j){
        int temp  = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static void main(String [] args){
        int [] nums1 = {8,3,2,1,0,0,0};
        int [] nums2 = {1,3,4};
        for(int i : ninjaAndSortedArrays(nums1, nums2, 4, 3)){
            System.out.print(i);
        }
        //ans-{1,1,2,3,3,4,8}
    }
}
