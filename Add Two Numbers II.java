class Solution {
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        ListNode next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1 = reverse(l1);
        l2 = reverse(l2);
        int sum = 0;
        int carry = 0;
        ListNode result = new ListNode(0);
        while(l1 != null || l2 != null){
            if(l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }
            result.val = sum % 10;
            carry = sum / 10;
            ListNode head = new ListNode(carry);
            head.next = result;
            result = head;
            sum = carry;
        }
        return (carry == 0)? result.next : result;
    }
}