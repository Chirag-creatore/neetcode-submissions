class Solution {
    public int removeElement(int[] nums, int val) {
        int lastVal = 0;
        for(int idx = 0; idx < nums.length; idx++){
            if(lastVal == idx){
                if(nums[idx] != val){
                    lastVal++;
                }
            }else if(nums[idx] != val){
                nums[lastVal] = nums[idx];
                nums[idx] = val;
                while(lastVal <= idx && nums[lastVal] != val){
                    lastVal++;
                }
            }
        }
        return lastVal;
    }
}