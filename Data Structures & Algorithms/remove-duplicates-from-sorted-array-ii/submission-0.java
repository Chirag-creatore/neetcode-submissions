class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int i = 2, j = 2;

        while(j < n){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;

            if(nums[i] != nums[i - 2]) i++;
            j++;
        }

        return i;
    }
}
