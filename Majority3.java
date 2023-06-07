import java.io.*;
import java.util.* ;

import java.util.ArrayList;


public class Majority3
{
    public static void main(String [] args){
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,2,4,2,4,4));
        System.out.print( majorityElementII(arr));
        //ans = {2, 4}
    }
    public static ArrayList<Integer> majorityElementII(ArrayList<Integer> arr) 
    {
        // Write your code here.
        int n = arr.size(), count1 = 0, count2 = 0, element1 = -1, element2 = -1;
        for(int a : arr){
            if(count1 == 0 && a != element2){
                element1 = a;
                count1++;
            }
            else if(count2 == 0 && element1 != a){
                element2 = a;
                count2++;
            }
            else if(element1 == a) count1++;
            else if(element2 == a) count2++;
            else{ 
                count1--;
                count2--;
            }
        }
        ArrayList<Integer> res = new ArrayList<>();
        count1 = 0; count2 = 0;
        for(int a : arr){
            if(a == element2) count2++;
            if(a == element1) count1++;
        }
        if(count1 > n/3) res.add(element1);
        if(count2 > n/3) res.add(element2);
        return res;
    
   
    }
}
