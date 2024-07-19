class Solution {
    public String simplifyPath(String path) {
        Stack<String> s = new Stack<>();
        String[] components = path.split("/");
        for(String dir : components){
            if(dir.equals("..")){
                if(!s.isEmpty()){
                    s.pop();
                }
            } else if(!dir.equals("") && !dir.equals(".")){
                s.push(dir);
            }
        }
        StringBuilder res = new StringBuilder();
        for(String dir : s){
            res.append("/").append(dir);
        }
        return res.length() > 0? res.toString() : "/";
    }
}