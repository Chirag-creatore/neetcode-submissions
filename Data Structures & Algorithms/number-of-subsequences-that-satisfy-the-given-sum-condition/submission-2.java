class Solution {
    private final int M = 1000000007;

    private static int[] pow = new int[100000];
    Solution(){
        pow[0] = 1;
        for(int i = 1; i < 100000; i++){
            pow[i] = pow[i - 1] * 2 % M;
        }
    }
    public int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);
        int j = 0;
        int n = nums.length;
        while(j < n && nums[0] + nums[j] <= target){
            j++;
        }
        j--;

        int ans = 0;
        int i = 0;
        while(i <= j){
            if(nums[i] + nums[j] <= target){
                ans += pow[j - i];
                ans %= M;
                i++;
            }else{
                j--;
            }
        }

        return ans;
    }
}