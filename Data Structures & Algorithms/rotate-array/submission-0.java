class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        for(int i = 0; i < n / 2; i++){
            int temp = nums[i];
            nums[i] = nums[n - i - 1];
            nums[n - i - 1] = temp;
        }

        int pivot = k % n;
        for(int i = 0; i < pivot / 2; i++){
            int temp = nums[i];
            nums[i] = nums[pivot - i - 1];
            nums[pivot - i - 1] = temp;
        }

        for(int i = pivot; i < (n + pivot) / 2; i++){
            int temp = nums[i];
            nums[i] = nums[n + pivot - i - 1];
            nums[n + pivot - i - 1] = temp;
        }
    }
}