import java.io.*;
import java.util.* ;

/************************************************************

    Following is the linked list node structure:
    
    class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;

        public LinkedListNode(T data) {
            this.data = data;
        }
    }

************************************************************/

public class MergeTwoSortedLL {
	public static LinkedListNode<Integer> sortTwoLists(LinkedListNode<Integer> first, LinkedListNode<Integer> second) {
		// Write your code here.
        LinkedListNode<Integer> res = new LinkedListNode(-1);
        LinkedListNode<Integer> curr = res;
        while(first != null || second != null){
            if(first == null){
                curr.next = second;
                second = second.next;
            }
            else if(second == null){
                curr.next = first;
                first = first.next;
            }else{
                if(first.data > second.data){
                    curr.next = second;
                    second = second.next;
                }else{
                    curr.next = first;
                    first = first.next;
                }      
            }
            curr = curr.next;
        }
        return res.next;
	}
}