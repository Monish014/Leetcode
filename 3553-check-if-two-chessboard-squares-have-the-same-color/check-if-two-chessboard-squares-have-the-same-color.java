class Solution {
    public boolean checkTwoChessboards(String c1, String c2) {
        char a=c1.charAt(0);
        int b=a+c1.charAt(1);
        char c=c2.charAt(0);
        int d=c+c2.charAt(1);
        if(b%2==0 && d%2==0 || b%2!=0 && d%2!=0){
            return true;
        }
        return false;
    }
}