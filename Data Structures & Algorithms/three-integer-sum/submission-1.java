class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i < n; i++){
            if(i > 0 && nums[i - 1] == nums[i]) continue;
            for(int j = i + 1; j < n; j++){
                if(j > i + 1 && nums[j - 1] == nums[j]) continue;
                int k = n - 1;
                while(j < k){
                    int num = nums[i] + nums[j] + nums[k];
                    if(num > 0){
                        k--;
                    }else if(num < 0){
                        j++;
                    }else{
                        List<Integer> arr = new ArrayList(Arrays.asList(nums[i],nums[j],nums[k]));
                        ans.add(arr);
                        break;
                    }
                }
            }
        }

        return ans;
    }
}
