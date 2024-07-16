class Solution {
    public int majorityElement(int[] nums) {
        return majorityElementHelper(nums, 0, nums.length-1);
    }

    int majorityElementHelper(int nums[], int si, int ei){
        if(si == ei){
            return nums[si];
        }
        int mid = si + ((ei - si)/2);
        int left = majorityElementHelper(nums, si, mid);
        int right = majorityElementHelper(nums, mid+1, ei);

        if(left == right){
            return left;
        }

        int leftCount = countRange(nums, left, si, ei);
        int rightCount = countRange(nums, right, si, ei);

        return (leftCount > rightCount) ? left : right;
    }

    int countRange(int nums[], int key, int si, int ei){
        int count = 0;
        for(int i = si; i <= ei; i++){
            if(nums[i] == key){
                count++;
            }
        }
        return count;
    }
}