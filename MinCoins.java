import java.util.* ;
import java.io.*; 
public class MinCoins
{
public static int findMinimumCoins(int amount)
    {
        // Write your code here.
        int [] currency = {1000, 500, 100, 50, 20, 10, 5, 2, 1};
        int notes = 0, i = 0;
        while(amount > 0){
            int curr = currency[i];
            if(curr > amount){
                i++;
                continue;
            }
            if(curr == amount){
                notes++;
                break;
            }
            else{
                notes += amount/curr;
                amount = amount%curr;
            }
            i++;
        }
        return notes;
    }
}
