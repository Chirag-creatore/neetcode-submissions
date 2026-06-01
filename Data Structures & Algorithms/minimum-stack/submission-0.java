class MinStack {
    List<List<Integer>> s;
    public MinStack() {
        this.s = new ArrayList<>();
    }
    
    public void push(int val) {
        if(s.size() == 0){
            s.add(Arrays.asList(val, val));
        }else{
            s.add(Arrays.asList(val, Math.min(getMin(), val)));
        }
    }
    
    public void pop() {
        s.removeLast();
    }
    
    public int top() {
        return s.get(s.size() - 1).get(0);
    }
    
    public int getMin() {
        return s.get(s.size() - 1).get(1);
    }
}
