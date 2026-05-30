class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int count = 0;
        boolean oneFound = false;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                if(!oneFound){
                    oneFound = true;
                }
                count++;
            }else if(oneFound){
                maxCount = Math.max(maxCount, count);
                count = 0;
            }
        }
        maxCount = Math.max(maxCount, count);
        return maxCount;
    }
}