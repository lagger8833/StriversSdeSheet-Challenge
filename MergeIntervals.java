import java.util.* ;
import java.io.*; 
/*******************************************************

    Following is the Interval class structure

    class Interval {
        int start, int finish;

        Interval(int start, int finish) {
            this.start = start;
            this.finish = finish;
        }
    }
    
*******************************************************/

import java.util.List;

import java.util.ArrayList;

public class Merge {
    public static List<Interval> mergeIntervals(Interval[] intervals) {
        Arrays.sort(intervals, (a,b)-> a.start - b.start);
        int n = intervals.length, last = -1;
        List<Interval> ansList = new ArrayList<>();
        for(int i=0; i<n; i++){
            int start = intervals[i].start;
            int end = intervals[i].finish;
            if(ansList.isEmpty() || start > ansList.get(ansList.size()-1).finish) ansList.add(intervals[i]);
            else{
                Interval rem = ansList.remove(ansList.size()-1);
                ansList.add(new Interval (rem.start , Math.max(end, rem.finish)));
            }
        }
        return ansList;
    }

}
