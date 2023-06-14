import java.util.* ;
import java.io.*; 
public class TrappingRainWater {
    public static long getTrappedWater(long[] height, int n) {
        long [] leftMax = new long [n];
        leftMax[0] = height[0];
        for (int i=1; i<n; i++){
            leftMax[i] = Math.max(leftMax[i-1], height[i]);
        }
        long [] rightMax = new long [n];
        rightMax[n-1] = height[n-1];
        for (int i=n-2; i>=0; i--){
            rightMax[i] = Math.max(rightMax[i+1], height[i]);
        }
        long trappedWater = 0;
        for(int i=0; i<n; i++){
            trappedWater += (Math.min(leftMax[i], rightMax[i]) - height[i]);
       }
       return trappedWater;
    }
}
