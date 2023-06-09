import java.io.*;
import java.util.* ;

public class PairSumClass{
    public static List<int[]> pairSum(int[] nums, int target) {
        // Write your code here.
        List<int[]> result = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for(int n : nums){
            map.put(n, map.getOrDefault(0,n)+1);
            if(map.containsKey(target-n) && map.get(target-n) > 0){
                int [] temp = {n, target-n};
                Arrays.sort(temp);
                result.add(temp);
                map.put(target - n, map.get(target-n) - 1);
                if(map.containsKey(n)) map.put(n, map.get(n)-1);
            }
        }
        Collections.sort(result, (a,b)-> a[0] - b[0]);
        return result;
    }
}
