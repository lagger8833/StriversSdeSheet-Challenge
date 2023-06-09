import java.io.*;
import java.util.* ;

/*
	Following is the structure of the Singly Linked List.	
	class LinkedListNode<T> 
    {
    	T data;
    	LinkedListNode<T> next;
    	public LinkedListNode(T data) 
        {
        	this.data = data;
    	}
	}

*/
public class ReveseLL 
{
    public static LinkedListNode<Integer> reverseLinkedList(LinkedListNode<Integer> head) 
    {
        // Write your code here!
		if(head == null) return null;
        LinkedListNode curr = head;
        LinkedListNode prev = null;
        LinkedListNode next;
        while(curr != null){
            next = curr.next;
            curr.next = prev; 
            prev = curr;
            curr =next;
        }
        return prev;
    }
}