class Solution
{
    public Node compute(Node head) {
        head = reverse(head);
        
        Node current = head;
        Node maxNode = head;
        Node temp = head;
        
        while (temp != null && temp.next != null) {
            if (temp.next.data < maxNode.data) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
                maxNode = temp;
            }
        }
        
        head = reverse(head);
        
        return head;
    }
    private Node reverse(Node head) {
        Node prev = null;
        Node current = head;
        
        while (current != null) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        
        return prev;
    }
}