/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;
    
     Node()
     {
         this.data = 0;
         this.next = null;
     }
    
     Node(int data)
     {
         this.data = data;
         this.next = null;
     }
    
     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
     }
 }

 *****************************************************************/

public class DetectCycleLL {

    public static boolean detectCycle(Node head) {
        //Your code goes here
        if(head == null) return false;
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow =slow.next;
            fast = fast.next.next;
            if(slow == fast) return true;
        }
        return false;
    }
}