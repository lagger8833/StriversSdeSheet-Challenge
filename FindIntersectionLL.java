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

public class FindIntersectionLL {
    public static int findIntersection(Node headA, Node headB) {
        //Write your code here
        if(headA == headB) return headA.data;
        Node tempA = headA;
        while(tempA != null){
            Node tempB = headB;
            while(tempB != null){
                if(tempA == tempB){
                    return tempA.data;
                }
                tempB = tempB.next;
            }
            tempA = tempA.next;
        }
        return -1;
    }
}