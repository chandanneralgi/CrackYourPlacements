class Solution {
    private static final long MOD = 1000000007;

    public long multiplyTwoLists(Node first, Node second) {
        long num1 = listToNumber(first);
        long num2 = listToNumber(second);

        return (num1 * num2) % MOD;
    }

    private long listToNumber(Node node) {
        long num = 0;
        while (node != null) {
            num = (num * 10 + node.data) % MOD;
            node = node.next;
        }
        return num;
    }

    public static Node createLinkedList(int[] values) {
        if (values.length == 0) return null;
        
        Node head = new Node(values[0]);
        Node current = head;
        
        for (int i = 1; i < values.length; i++) {
            current.next = new Node(values[i]);
            current = current.next;
        }
        
        return head;
    }
}