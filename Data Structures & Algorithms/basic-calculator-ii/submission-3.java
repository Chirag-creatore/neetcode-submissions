class Solution {
    public int calculate(String s) {
        int n = s.length();
        Stack<StringBuilder> stack = new Stack<>();
        stack.push(new StringBuilder());
        boolean operate = false;
        for(int i = 0; i < n; i++){
            char c = s.charAt(i);
            if(c == ' '){
                if(stack.peek().length() > 0){
                    stack.push(new StringBuilder());
                }
            }else if(c == '+' || c == '-' || c == '*' || c == '/'){
                if(stack.peek().length() > 0) stack.push(new StringBuilder());
                stack.peek().append(c);
                stack.push(new StringBuilder());
                if(c == '*' || c == '/') operate = true;
            }else{
                stack.peek().append(c);
                if(i != n - 1) c = s.charAt(i + 1);
                if(operate && (i == n - 1 || c == '+' || c == '-' || c == '*' || c == '/' || c == ' ')){
                    int y = Integer.parseInt(stack.pop().toString());
                    StringBuilder op = stack.pop();
                    int x = Integer.parseInt(stack.pop().toString());
                    if("*".contentEquals(op)){
                        stack.push(new StringBuilder(String.valueOf(x * y)));
                    }else{
                        stack.push(new StringBuilder(String.valueOf(x / y)));
                    }
                    operate = false;
                }
            }
        }
        if(stack.peek().length() == 0) stack.pop();
        int ans = Integer.parseInt(stack.get(0).toString());
        for(int i = 2; i < stack.size(); i += 2){
            int x = Integer.parseInt(stack.get(i).toString());
            if("+".contentEquals(stack.get(i - 1))){
                ans += x;
            }else{
                ans -= x;
            }
        }

        return ans;
    }
}