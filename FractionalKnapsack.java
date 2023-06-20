import java.util.* ;
import java.io.*; 
/****************************************************************

    Following is the class structure of the Pair class:

        class Pair
        {
        	int weight;
	        int value;
	        Pair(int weight, int value)
	        {
		        this.weight = weight;
		        this.value = value;
	        }
	        
        }
        
*****************************************************************/
class PairComparator implements Comparator<Pair>{
	@Override
	public int compare (Pair a, Pair b){
		double r1 = (double) a.value/(double) a.weight;
		double r2 = (double) b.value/(double) b.weight;
		if(r1 < r2) return 1;
		else if(r1 > r2) return -1;
		return 0;
	}
}

public class FractionKnapsack {
    public static double maximumValue(Pair[] items, int n, int W) {
            // Write your code here.
    	    // ITEMS contains {weight, value} pairs.
			PairComparator pc = new PairComparator();
			Arrays.sort(items, pc);
			int i=0;
			double res = 0;
			while(W > 0  && i < n){
				if(items[i].weight <= W){
					res += items[i].value;
					W -= items[i].weight;
				}else{
					res += ((double) W / (double) items[i].weight) * items[i].value;
					break;
				}
				i++;
			}
			return res;
    }
}
