class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> s = new Stack<>();
        for(int num : asteroids){
            if(num > 0){
                s.push(num);
            }else{
                if(s.isEmpty() || s.peek() < 0) s.push(num);
                else{
                    while(!s.isEmpty() && s.peek() > 0 && s.peek() + num < 0){
                        s.pop();
                    }
                    if(!s.isEmpty()){
                        if(s.peek() < 0){
                            s.push(num);
                        }else if(s.peek() + num == 0){
                            s.pop();
                        }
                    }else{
                        s.push(num);
                    }
                }
            }
        }

        int[] ans = new int[s.size()];
        int i = 0;
        for(int num : s){
            ans[i++] = num;
        }

        return ans;
    }
}