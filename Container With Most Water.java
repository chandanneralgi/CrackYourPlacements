class Solution {
    public int maxArea(int[] height) {
        int lp = 0;
        int rp = height.length - 1;
        int minHeight = 0;
        int maxWater = 0;
        while(lp < rp){
            minHeight = Math.min(height[lp], height[rp]);
            maxWater = Math.max(maxWater, minHeight * (rp - lp));
            while(lp < rp && height[lp] <= minHeight) lp++;
            while(lp < rp && height[rp] <= minHeight) rp--;
        }
        return maxWater;
    }
}