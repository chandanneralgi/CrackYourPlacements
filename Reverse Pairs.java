class Solution {
    public int reversePairs(int[] nums) {
        return mergeSort(nums, 0, nums.length-1);
    }
    public int mergeSort(int nums[], int si, int ei){
        int rev = 0;
        if(si >= ei){
            return rev;
        }
        int mid = si + ((ei - si)/2);
        rev += mergeSort(nums, si, mid);
        rev += mergeSort(nums, mid+1, ei);
        rev += merge(nums, si, mid, ei);
        return rev;
    }
    public int merge(int nums[], int si, int mid, int ei){
        int rev = 0;
        int temp[] = new int[ei-si+1];
        int i = si, j = mid + 1, k = 0;
        while (i <= mid && j <= ei) {
            if ((long) nums[i] > 2 * (long) nums[j]) {
                rev += mid - i + 1;
                j++;
            } else {
                i++;
            }
        }
        i = si;
        j = mid + 1;
        while(i <= mid && j <= ei){
            if(nums[i] < nums[j]){
                temp[k] = nums[i];
                i++;
            }else{
                temp[k] = nums[j];
                j++;
            }
            k++;
        }
        while(i <= mid){
            temp[k] = nums[i];
            i++;
            k++;
        }
        while(j <= ei){
            temp[k] = nums[j];
            j++;
            k++;
        }
        for(i=si, k=0; k<temp.length; k++, i++){
            nums[i] = temp[k];
        }
        return rev;
    }
}