public class Practice {
    public static void main(String[] args) {
        ListNode head = new ListNode('x');


        ListNode other = new ListNode('h');

        head.next = other;

        other.data = 'w';

        head.next.next = new ListNode('v');

        head.next.next.next = new ListNode('o');

        System.out.println(other.data);
        System.out.println(head.next.next.data);
        System.out.println(head.next.next.next.data);

        printList(head);

        

        System.out.println(countLetter(head, 'v'));




        
    }

    public static void printList(ListNode head){

        ListNode current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }

    }

    public static int countLetter(ListNode head, char letter){
        ListNode current = head;
        int count = 0;
        while(current != null){
            if(current.data == letter){
                count ++;
            }
        current = current.next;
        }
        return count;
    }
}
