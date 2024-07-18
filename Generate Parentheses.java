class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        helper(result, 0, 0, new StringBuilder(), n);
        return result;
    }
    public void helper(List<String> result, int left, int right, StringBuilder sb, int n){
        if(sb.length() == n*2){
            result.add(sb.toString());
            return;
        }
        if(left < n){
            helper(result, left+1, right, sb.append("("), n);
            sb.deleteCharAt(sb.length() - 1);
        }
        if(right < left){
            helper(result, left, right+1, sb.append(")"), n);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}