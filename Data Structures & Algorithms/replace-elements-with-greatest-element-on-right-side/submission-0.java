class Solution {
    public int[] replaceElements(int[] arr) {
        int[] ans = new int[arr.length];
        ans[arr.length - 1] = -1;

        for(int i = arr.length - 2; i >= 0; i--){
            ans[i] = Math.max(ans[i + 1], arr[i + 1]);
        }

        return ans;
    }
}