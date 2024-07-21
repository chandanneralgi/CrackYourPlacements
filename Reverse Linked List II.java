class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null || left == right){
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        for(int i = 1; i < left; i++){
            prev = prev.next;
        }
        ListNode leftPointer = prev;
        ListNode curr = prev.next;
        prev = null;
        ListNode next;
        for(int i = 0; i < (right - left + 1); i++){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        leftPointer.next.next = curr;
        leftPointer.next = prev;
        return dummy.next;
    }
}