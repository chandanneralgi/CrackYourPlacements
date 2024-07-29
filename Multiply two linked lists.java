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
}