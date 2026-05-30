class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;
        Map<Character, Character> map = new HashMap<>();
        Map<Character, Character> map2 = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            map.putIfAbsent(s.charAt(i), t.charAt(i));
            if(map.get(s.charAt(i)) != t.charAt(i)){
                return false;
            }
        }

        for(int i = 0; i < s.length(); i++){
            map2.putIfAbsent(t.charAt(i), s.charAt(i));
            if(map2.get(t.charAt(i)) != s.charAt(i)){
                return false;
            }
        }
        return true;
    }
}