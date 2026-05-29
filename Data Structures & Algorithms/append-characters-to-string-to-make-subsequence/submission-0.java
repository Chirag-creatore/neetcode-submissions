class Solution {
    public int appendCharacters(String s, String t) {
        int idx = 0; 
        int n = s.length();
        for(int i = 0; i < n; i++){
            if(idx == t.length()) break;
            if(s.charAt(i) == t.charAt(idx)){
                idx++;
            }
        }
        return t.length() - idx;
    }
}