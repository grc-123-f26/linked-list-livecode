public class Practice {
    public static void main(String[] args) {
        ListNode head = new ListNode('x');

        ListNode other = new ListNode('m');
        head.next = other;

        // System.out.println(head.next.data);
        // head.next = new ListNode('a');
        head.next.next = new ListNode('v');
        head.next.next.next = new ListNode('e');
        head.next.next.next.next = new ListNode('m');
        // head.next = new ListNode('a');

        System.out.println(head.data);
        System.out.println(head.next.data);
        System.out.println(head.next.next.data);
        System.out.println("");

        printList(head);
        System.out.println(countLetter(head,'m'));
        System.out.println("");
        // countLetter(head,'m');
    }

    public static void printList(ListNode head)
    {
        ListNode current = head;

        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }
        System.out.println(current);
    }

    //count how many occurences of letter in the list
    public static int countLetter(ListNode head, char letter)
    {
        int count = 0;
        ListNode current = head;

        while(current != null)
            {
                if(current.data == letter){
                    count++;
                }
                current = current.next;
            }
        return count;
    }
}
