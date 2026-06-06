class Solution {
    public String removeDuplicates(String s, int k) {
        int n = s.length();
        char[] str = s.toCharArray();
        int[] count = new int[n];
        int i = 0;

        for(int j = 0; j < n; j++){
            str[i] = str[j];
            count[i] = 1;
            if(i != 0 && str[i - 1] == str[i]){
                count[i] += count[i - 1];
            }
            if(count[i] == k){
                i -= k;
            }
            i++;
        }

        return new String(str,0,i);
    }
}