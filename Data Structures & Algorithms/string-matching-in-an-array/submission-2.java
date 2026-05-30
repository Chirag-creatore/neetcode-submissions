class Solution {
    private boolean isSubstring(String main, String check){
        if(main.length() < check.length()) return false;
        for(int i = 0; i <= main.length() - check.length(); i++){
            int idx = 0;
            for(int j = i; j < i + check.length(); j++){
                if(check.charAt(idx) == main.charAt(j)){
                    idx++;
                }else{
                    break;
                }
            }
            if(idx == check.length()) return true;
        }
        return false;
    }

    public List<String> stringMatching(String[] words) {
        int n = words.length;
        Set<String> set = new HashSet<>();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(j == i) continue;
                if(isSubstring(words[j], words[i])){
                    set.add(words[i]);
                    break;
                }
            }
        }

        return new ArrayList(set);
    }
}