public class ListNode {
    int val;
    ListNode next;
    public ListNode(int val){
        this.val=val;
        this.next=null;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);  // Helper node
        ListNode current = dummy;
        int carry = 0;  // Start with no carry

        while (l1 != null || l2 != null || carry != 0) {
            // Get values (0 if node is null)
            int val1 = (l1 != null) ? l1.val : 0;
            int val2 = (l2 != null) ? l2.val : 0;

            // Add them + any carry from previous
            int sum = val1 + val2 + carry;

            // Your magic formula!
            int digit = sum % 10;
            carry = sum / 10;

            // Create new node with digit
            current.next = new ListNode(digit);
            current = current.next;

            // Move pointers forward (if they exist)
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        return dummy.next;  // Skip dummy node
    }
}
