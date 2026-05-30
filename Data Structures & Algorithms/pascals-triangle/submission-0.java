class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList(Arrays.asList(1)));
        if(numRows == 1) return ans;
        ans.add(new ArrayList(Arrays.asList(1,1)));
        if(numRows == 2) return ans;

        for(int i = 2; i < numRows; i++){
            List<Integer> row = new ArrayList<>();
            row.add(1);
            List<Integer> prev = ans.get(i - 1);
            for(int j = 1; j < prev.size(); j++){
                row.add(prev.get(j) + prev.get(j - 1));
            }
            row.add(1);
            ans.add(row);
        }

        return ans;
    }
}