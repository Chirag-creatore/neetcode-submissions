class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] dup = new int[n];
        for(int i = 0; i < n; i++) dup[i] = nums[i];
        Arrays.sort(nums);
        int i = 0, j = n - 1;
        int[] ans = {-1, -1};
        while(i < j){
            int k = nums[i] + nums[j];
            if(k < target){
                i++;
            }else if(k > target){
                j--;
            }else{
                ans = new int[] {nums[i], nums[j]};
                break;
            }
        }
        int i1 = -1, i2 = -1;
        for(i = 0; i < n; i++){
            if(i1 == -1){
                if(dup[i] == ans[0]){
                    i1 = i;
                    ans[0] = -1;
                }else if(dup[i] == ans[1]){
                    i1 = i;
                    ans[1] = -1;
                }
            }else if(i2 == -1){
                if(dup[i] == ans[0] || dup[i] == ans[1]){
                    i2 = i;
                    break;
                }
            }
        }

        return new int[] {i1, i2};
    }
}
