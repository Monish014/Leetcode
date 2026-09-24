class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack=new Stack<>();
        for(String s:operations){
            if(s.equals("C")){
                stack.pop();
            }
            else if(s.equals("D")){
                stack.push(2*stack.peek());
            }
            else if(s.equals("+")){
                int top=stack.pop();
                int second=stack.peek();
                stack.push(top);
                stack.push(top+second); 
            }
            else{
                int num=Integer.parseInt(s);
                stack.push(num);
            }
        }
        int sum=0;
        while(!stack.isEmpty()){
            sum+=stack.pop();
        }
        return sum;
    }
}