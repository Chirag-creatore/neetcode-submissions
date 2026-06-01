class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();
        for(String str : tokens){
            if(str.equals("+")){
                int y = s.pop();
                int x = s.pop();
                s.push(x + y);
            }else if(str.equals("-")){
                int y = s.pop();
                int x = s.pop();
                s.push(x - y);
            }else if(str.equals("*")){
                int y = s.pop();
                int x = s.pop();
                s.push(x * y);
            }else if(str.equals("/")){
                int y = s.pop();
                int x = s.pop();
                s.push(x / y);
            }else{
                s.push(Integer.parseInt(str));
            }
        }

        return s.peek();
    }
}
