class Solution {
    public int smallestNumber(int n, int t) {
        int num=n;
        int pro=1;
        while(pro%t!=0){
            int rem=num%10;
            pro*=rem;
            num/=10;
            if(num==0 && pro%t!=0){
                n++;
                num=n;
                pro=1;
            }

        }
        return n;
    }
}