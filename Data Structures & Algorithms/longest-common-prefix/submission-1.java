class Solution {
    public String longestCommonPrefix(String[] strs) {
        int len = 0;
        while(true){
            boolean flag = false;
            for(int i = 0; i < strs.length; i++){
                if(strs[i].length() == len || i > 0 && strs[i].charAt(len) != strs[i - 1].charAt(len)){
                    flag = true;
                    break;
                }
            }
            if(flag) break;
            len++;
        }

        return strs[0].substring(0,len);
    }
}