class Solution {
    public String removeDuplicates(String s) {
        Stack<String> stack=new Stack<>();
        String a="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(stack.isEmpty()){
                stack.push(String.valueOf(c));
            }
            else{
                if(stack.peek().equals(String.valueOf(c))){
                    stack.pop();
                }
                else{
                    stack.push(String.valueOf(c));
                }
            }
        }
        for(String b:stack){
            a+=b;
        }
        return a;
    }
}