class Solution {
    public int[] dailyTemperatures(int[] temp) {
        Stack<Integer> s = new Stack<>();
        int n = temp.length;

        int[] ans = new int[n];
        for(int i = 0; i < n; i++){
            while(!s.isEmpty() && temp[s.peek()] < temp[i]){
                ans[s.peek()] = i - s.peek();
                s.pop();
            }
            s.push(i);
        }

        return ans;
    }
}
