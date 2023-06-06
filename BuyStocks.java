import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class BuyStocks{
    public static int maximumProfit(ArrayList<Integer> prices){
        // Write your code here.
        int buyPrice = Integer.MAX_VALUE;
        int max_profit = 0;
        for (int i=0; i< prices.size(); i++){
            int curr = prices.get(i);
            if(buyPrice > curr) buyPrice = curr;
            max_profit = Math.max(curr-buyPrice, max_profit);
        }
        return max_profit;
    }
    public static void main(String [] args){
        ArrayList<Integer> prices = new ArrayList<>(Arrays.asList(2,4,5,1,5,6,7,1,9));
        System.out.print(maximumProfit(prices));
        //ans = 8
    }
}