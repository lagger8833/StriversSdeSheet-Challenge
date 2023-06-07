import java.util.* ;
import java.io.*; 
public class CountInversion {
    public static long getInversions(long arr[], int n) {
        return mergeSort(arr,new long [n],0,n-1);
    }
    public static long merge(long [] arr, long [] temp, int left, int mid,int right){
        long inv_count = 0;
        int i = left, j = mid, k = left;
        while((i < mid) && (j <= right)){
            if(arr[i] <= arr[j]) temp[k++] = arr[i++];
            else {
                temp[k++] = arr[j++];
                inv_count += mid - i;
            }
        }
        while(i < mid){
            temp[k++] = arr[i++];
        }
        while(j <= right){
            temp[k++] = arr[j++];
        }
        for(i = left; i <= right; i++){
            arr[i] = temp[i];
        }
        return inv_count;
    }
    public static long mergeSort(long [] arr, long [] temp, int left, int right){
        int mid = 0;
        long inv_count = 0;
        if(left < right){
            mid = (right + left)/2;
            inv_count += mergeSort(arr, temp, left, mid);
            inv_count += mergeSort(arr, temp, mid+1, right);
            inv_count += merge(arr, temp, left, mid+1, right);
        }
        return inv_count;

    }
    public static void main(String [] args){
        long [] arr = {1,3,4,6,3,2};
        System.out.println(getInversions(arr, arr.length));
    }
}