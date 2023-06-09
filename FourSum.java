import java.io.*;
import java.util.* ;

public class FourSum {
  public static String fourSum(int[] arr, int target, int n) {
      Arrays.sort(arr);
      List<List<Integer>> res = new ArrayList<>();
      for(int i=0; i<n; i++){
        if(i > 0 && arr[i] == arr[i-1]) continue;
        for(int j = i+1; j<n; j++){
          if(j > i+1 && arr[j] == arr[j-1]) continue;
          int k = j+1;
          int l = n-1;
          while(k < l){
            long sum = arr[i] + arr[j];
            sum += arr[k] + arr[l];
            if(sum == target){
              return "Yes";
            }
            else if(sum < target) k++;
            else l--;
          }
        }
      }
      return "No";
  }
  public static void main(String [] args){
    int [] arr = {1,2,3,4,5,6,7,8,9};
    System.out.print(fourSum(arr, 18, 9));
    //ans - Yes
  }
}
