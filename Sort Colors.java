class Solution {
    public void sortColors(int[] nums) {
        int arr[] = new int[3];
        for(int i=0; i<nums.length; i++){
            arr[nums[i]]++;
        }
        int j = 0;
        for(int i=0; i<3; i++){
            while(arr[i]>0){
                nums[j] = i;
                j++;
                arr[i]--;
            }
        }
        return;
    }
}