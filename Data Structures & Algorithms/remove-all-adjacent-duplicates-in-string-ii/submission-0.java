class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<StringBuilder> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(stack.isEmpty() || stack.peek().charAt(0) != c){
                StringBuilder sb = new StringBuilder();
                sb.append(c);
                stack.push(sb);
            }else{
                if(stack.peek().length() == k - 1) stack.pop();
                else stack.peek().append(c);
            }
        }

        StringBuilder ans = new StringBuilder();
        for(StringBuilder sb : stack){
            ans.append(sb);
        }

        return ans.toString();
    }
}