class Solution {
    public String simplifyPath(String path) {
        Stack<Character> s = new Stack<>();
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < path.length(); i++){
            char c = path.charAt(i);
            if(c == '/'){
                if(str.length() > 0){
                    if("..".contentEquals(str) || ".".contentEquals(str)){
                        while(s.size() > 1 && s.peek() != '/'){
                            s.pop();
                        }
                        if(s.size() > 1) s.pop();
                    }
                    if("..".contentEquals(str)){
                        while(s.size() > 1 && s.peek() != '/'){
                            s.pop();
                        }
                        if(s.size() > 1) s.pop();
                    }
                    str.setLength(0);
                }
                if(s.isEmpty() || s.peek() != '/'){
                    s.push('/');
                }
            }else{
                str.append(c);
                s.push(c);
            }
        }
        if(str.length() > 0){
            if("..".contentEquals(str) || ".".contentEquals(str)){
                while(s.size() > 1 && s.peek() != '/'){
                    s.pop();
                }
                if(s.size() > 1) s.pop();
            }
            if("..".contentEquals(str)){
                while(s.size() > 1 && s.peek() != '/'){
                    s.pop();
                }
                if(s.size() > 1) s.pop();
            }
            str.setLength(0);
        }

        if(s.size() > 1 && s.peek() == '/') s.pop();

        for(char c : s){
            str.append(c);
        }

        return str.toString();
    }
}