public class Practice {
    public static void main(String[] args) {
        ListNode head = new ListNode('x');
        

        ListNode other = new ListNode('m');
        head.next = other;
        
        head.next.next = new ListNode('v');
        head.next.next.next = new ListNode('e');
        head.next.next.next.next = new ListNode('m');
    
        printList(head);
        System.out.println(countLetter(head, 'm'));
    }

    public static void printlist(ListNode head) {
        ListNode current = head;
        while(current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    // count how many occurrences of letter in the list 
    public static void countLetter(ListNode head, char letter) {
        int count = 0;
        ListNode current = head;
        while(current != null) {
            if(current.data == letter) {
                count++;
            }
            current = current.next;
        }
        return count;
    }
}
