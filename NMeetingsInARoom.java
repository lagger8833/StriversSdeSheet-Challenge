import java.util.* ;
import java.io.*; 
class Meeting{
    int start;
    int end;
    int index;
    public Meeting (int start, int end, int index){
        this.start = start;
        this.end = end;
        this.index = index;
    }
}
class MeetingComparator implements Comparator<Meeting>{
    @Override
    public int compare (Meeting m1, Meeting m2){
        if(m1.end < m2.end) return -1;
        if(m1.end > m2.end) return 1;
        if(m1.index > m2.index) return 1;
        return -1;
    }
}
public class NMeetingsinARoom {
    public static List<Integer> maximumMeetings(int[] start, int[] end) {        
        //Write your code here
        List<Integer> res = new ArrayList<>();
        List<Meeting> meetings = new ArrayList<>();
        for(int i=0; i<start.length; i++){
            meetings.add(new Meeting(start[i], end[i], i+1));
        }
        MeetingComparator mc = new MeetingComparator();
        Collections.sort(meetings, mc);
        int endTime = -1;
        for(Meeting m : meetings){
            if(m.start > endTime){
                endTime = m.end;
                res.add(m.index);
            }
        }
        return res;
    }
}