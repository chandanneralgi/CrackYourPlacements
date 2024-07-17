class Solution {
    public static void printDups(String str){
        int n = str.length();
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        for (int i = 0; i < n; i++) {
            int count = 1;
            while (i < n - 1 && chars[i] == chars[i + 1]) {
                count++;
                i++;
            }
            if (count > 1)
                System.out.println(chars[i] + ", count = " + count);
        }
    }
}