class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] pos = new int[n / 2];
        int[] neg = new int[n / 2];
        int i1 = 0, i2 = 0;
        for(int num: nums){
            if(num > 0) pos[i1++] = num;
            else neg[i2++] = num;
        }

        int[] ans = new int[n];
        for(int i = 0; i < n; i++){
            if(i % 2 == 0){
                ans[i] = pos[i / 2];
            }else{
                ans[i] = neg[(i - 1) / 2];
            }
        }

        return ans;
    }
}