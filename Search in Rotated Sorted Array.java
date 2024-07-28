class Solution {
    public int search(int[] nums, int target) {
        int min = minPos(nums);
        if(nums[min] <= target && nums[nums.length - 1] >= target){
            return helper(nums, min, nums.length - 1, target);
        }else{
            return helper(nums, 0, min, target);
        }
    }

    public static int helper(int nums[], int si, int ei, int target){
        while(si <= ei){
            int mid = si + (ei - si) / 2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] < target){
                si = mid + 1;
            }else{
                ei = mid - 1;
            }
        }
        return -1;
    }

    public static int minPos(int[] nums){
        int si = 0, ei = nums.length - 1;
        while(si < ei){
            int mid = si + (ei - si) / 2;
            if(mid > 0 && nums[mid - 1] > nums[mid]){
                return mid;
            }else if(nums[si] <= nums[mid] && nums[mid] > nums[ei]){
                si = mid + 1;
            }else{
                ei = mid-1;
            }
        }
        return si;
    }
}