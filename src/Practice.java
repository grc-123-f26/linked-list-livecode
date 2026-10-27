import java.util.LinkedList;

public class Practice {

    public static void main(String[] args) {
       // ListNode is the container
        ListNode head = new ListNode('s');
        

        ListNode other = new ListNode('m');
        
        head.next =other;
        // other.data = head.next
       // other.data ='w';
        head.next.next =new ListNode('v');
        head.next.next.next= new ListNode('e');
        head.next.next.next.next= new ListNode('m');

        // System.out.println(other.data);
        // System.out.println(head.next.data);
        // System.out.println(head.next.next.data);

         printList(head);
         countLetter(head, 'f');

    }
    public static void printList(ListNode head){
        ListNode current = head;
        while ( current != null){
            System.out.println(current.data);
            current=current.next;
        }
    }
    
    public static int countLetter( ListNode head, char letter) {
       int count = 0;
       ListNode curr = head;

         while ( curr != null){
           if ( curr.data ==letter){
            count++;
        }
        curr=curr.next;
    }
        return count;

    }
}
