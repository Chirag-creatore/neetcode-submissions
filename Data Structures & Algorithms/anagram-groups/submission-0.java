class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<List<Integer>, List<String>> map = new HashMap<>();
        for(String s : strs){
            Integer[] freq = new Integer[26];
            for(int i = 0; i < 26; i++) freq[i] = 0;
            for(int i = 0; i < s.length(); i++){
                freq[s.charAt(i) - 'a']++;
            }
            List<Integer> key = List.of(freq);
            if(map.containsKey(key)){
                map.get(key).add(s);
            }else{
                List<String> val = new ArrayList<>();
                val.add(s);
                map.put(key, val);
            }
        }

        List<List<String>> ans = new ArrayList<>();
        Set<List<Integer>> set = map.keySet();
        for(List<Integer> key : set){
            ans.add(map.get(key));
        }

        return ans;
    }
}
