class StockSpanner {
    Stack<Integer> s;
    List<Integer> arr;
    public StockSpanner() {
        s = new Stack<>();
        arr = new ArrayList<>();
    }
    
    public int next(int price) {
        int ans = 1;
        while(!s.isEmpty() && arr.get(s.peek()) <= price){
            s.pop();
        }
        if(!s.isEmpty()) ans = arr.size() - s.peek();
        else ans = arr.size() + 1;
        arr.add(price);
        s.add(arr.size() - 1);
        return ans;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */