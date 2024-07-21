class Solution {
    private ListNode getMid(ListNode head){
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    private ListNode merge(ListNode l1, ListNode l2){
        ListNode mergedLL = new ListNode(-1);
        ListNode temp = mergedLL;
        while(l1 != null && l2 != null){
            if(l1.val <= l2.val){
                temp.next = l1;
                l1 = l1.next;
            }else{
                temp.next = l2;
                l2 = l2.next;
            }
            temp = temp.next;
        }
        if(l1 != null){
            temp.next = l1;
        }
        if(l2 != null){
            temp.next = l2;
        }
        return mergedLL.next;
    }
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode mid = getMid(head);
        ListNode rightHead = mid.next;
        mid.next = null;
        ListNode newLeft = sortList(head);
        ListNode newRight = sortList(rightHead);
        return merge(newLeft, newRight);
    }
}