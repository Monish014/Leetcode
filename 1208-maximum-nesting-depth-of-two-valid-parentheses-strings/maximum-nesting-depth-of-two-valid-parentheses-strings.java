class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int[] arr=new int[seq.length()];
        int depth=-1;
        for(int i=0;i<seq.length();i++){
            char c=seq.charAt(i);
            if(c=='('){
                depth++;
                arr[i]=depth%2;
            }
            if(c==')'){
                arr[i]=depth%2;
                depth--;
            }
        }
        return arr;
    }
}