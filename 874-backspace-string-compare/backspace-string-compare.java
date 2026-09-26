class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stack=new Stack<>();
        Stack<Character> stack1=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c!='#'){
                stack.push(c);
            }
            else if(!stack.isEmpty()){
                stack.pop();
            }
        }
        for(int i=0;i<t.length();i++){
            char c=t.charAt(i);
            if(c!='#'){
                stack1.push(c);
            }
            else if(!stack1.isEmpty()){
                stack1.pop();
            }
        }
        if(stack.equals(stack1)){
            return true;
        }
        return false;
    }
}