class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode curr = head;
        while(curr != null){
            boolean duplicate = false;
            while(curr.next != null && curr.val == curr.next.val){
                curr = curr.next;
                duplicate = true;
            }
            if(duplicate){
                curr = curr.next;
                continue;
            }
            prev.next = curr;
            prev = curr;
            curr = curr.next;
        }
        prev.next = null;
        return dummy.next;
    }
}