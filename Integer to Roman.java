class Solution {
    final String roman[] = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
    final int value[] = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        while(num > 0){
            int i = helper(num);
            sb.append(roman[i]);
            num -= value[i];
        }
        return sb.toString();
    }
    public int helper(int num){
        for(int i = 0; i < 13; i++){
            if(value[i] > num){
                return i-1;
            }
        }
        return 12;
    }
}