class Solution {
    public int mirrorDistance(int n) {
        int m=0;
        int o=n;
        while(n!=0){
            int rem=n%10;
            n/=10;
            m=(m*10)+rem;
        }
        return Math.abs(o-m);
    }
}