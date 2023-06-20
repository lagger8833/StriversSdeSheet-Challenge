import java.util.* ;
import java.io.*; 
public class JobSchedule
{
    public static int jobScheduling(int[][] jobs)
    {
        // Write your code here
        int n = jobs.length, profit = 0, maxDeadline = -1;
        Arrays.sort(jobs, (a,b)-> b[1] - a[1]);
        for(int i=0; i<n; i++){
            maxDeadline = Math.max(maxDeadline , jobs[i][0]);
        }
        int [] res = new int [maxDeadline + 1];
        Arrays.fill(res, -1);
        res[0] = 0;
        for(int i=0; i<n; i++){
            for(int j = jobs[i][0]; j>0; j--){
                if(res[j] == -1){
                    profit += jobs[i][1];
                    res[j] = i;
                    break;
                }
            }
        }
        return profit;
    }
}

