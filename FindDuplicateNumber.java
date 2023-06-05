import java.util.*;

 // Compiler version JDK 11.0.2

 class FindDuplicateNumber
 {
   public static int findDuplicate(List<Integer> arr){
     int slow = arr.get(0), fast = arr.get(0);
     do{
        slow = arr.get(slow);
        fast = arr.get(arr.get(fast));
     }while(slow != fast);
     fast = arr.get(0);
     while(slow != fast){
        slow = arr.get(slow);
        fast = arr.get(fast);
     }
     return slow;
   }
   public static void main(String args[])
   { 
      List<Integer> arr = new ArrayList<>(Arrays.asList(1,2,6,4,3,2));
      System.out.print(findDuplicate(arr));
    //Output is 2
   }
 }
