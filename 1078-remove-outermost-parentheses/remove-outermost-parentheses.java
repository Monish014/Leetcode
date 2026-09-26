class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> stack=new Stack<>();
        String a="";
        int count=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(count==0 && c=='('){
                stack.push(c);
                count++;
            }
            else if(count==1 && c==')'){
                stack.pop();
                count--;
            }
            else{
                a+=String.valueOf(c);
                if(c=='('){
                    count++;
                }
                else{
                    count--;
                }
            }
        }
        return a;
    }
}