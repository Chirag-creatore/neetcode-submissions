class Solution {
    public int lengthOfLastWord(String s) {
        int len = 0;
        int n = s.length();
        boolean begin = false;
        for(int i = n - 1; i >= 0; i--){
            if(!begin){
                if(s.charAt(i) != ' '){
                    begin = true;
                    len++;
                }
            }else{
                if(s.charAt(i) == ' ') break;
                len++;
            }
        }

        return len;
    }
}