class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<int[]> stack = new Stack<>();
        int n = s.length();
        for(int i = 0; i < n; i++){
            char c = s.charAt(i);
            if(stack.isEmpty() || stack.peek()[0] != c - 'a'){
                stack.push(new int[] {c - 'a', 1});
            }else{
                stack.peek()[1]++;
                if(stack.peek()[1] == k){
                    stack.pop();
                }
            }
        }

        StringBuilder sb = new StringBuilder();

        for(int[] pair: stack){
            for(int i = 0; i < pair[1]; i++){
                sb.append((char)(pair[0] + 'a'));
            }
        }

        return sb.toString();
    }
}