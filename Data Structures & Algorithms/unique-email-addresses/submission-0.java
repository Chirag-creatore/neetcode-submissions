class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> set = new HashSet<>();
        for(String s: emails){
            StringBuilder str = new StringBuilder();
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) == '.') continue;
                if(s.charAt(i) == '+'){
                    while(s.charAt(i) != '@'){
                        i++;
                    }
                    str.append(s.substring(i));
                    break;
                }else{
                    str.append(s.charAt(i));
                }
            }
            set.add(str.toString());
        }

        return set.size();
    }
}