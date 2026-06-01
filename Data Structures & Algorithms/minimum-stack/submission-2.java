class MinStack {
    long min;
    Stack<Long> s;
    public MinStack() {
        this.s = new Stack<>();
    }
    
    public void push(int val) {
        if(s.isEmpty()){
            min = val;
            s.push(0L);
        }else{
            s.push(val - min);
            if(val - min < 0){
                min = val;
            }
        }
    }
    
    public void pop() {
        if(s.peek() < 0){
            min = min - s.peek();
        }
        s.pop();
    }
    
    public int top() {
        if(s.peek() < 0){
            return (int) min;
        }else{
            return (int) (s.peek() + min);
        }
    }
    
    public int getMin() {
        return (int) min;
    }
}
