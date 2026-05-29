class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length() == 0) return true;
        int idx = 0;
        int n = t.length();
        for(int i = 0; i < n; i++){
            if(t.charAt(i) == s.charAt(idx)){
                idx++;
                if(idx == s.length()) return true;
            }
        }

        return false;
    }
}