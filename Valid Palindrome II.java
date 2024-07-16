class Solution {
    public boolean validPalindrome(String s) {
        return validPalindromeHelper(s, 0, s.length() - 1, false);
    }
    public boolean validPalindromeHelper(String s, int si, int ei, boolean removed){
        while(si < ei){
            if(s.charAt(si) != s.charAt(ei)){
                if(removed){
                    return false;
                }
                return validPalindromeHelper(s, si + 1, ei, true) || validPalindromeHelper(s, si, ei - 1, true);
            }
            si++;
            ei--;
        }
        return true;
    }
}