class Solution {
    public int sumOfPrimesInRange(int n) {
        int a=n;
        int b=0;
        int sum=0;
        while(a!=0){
            int rem=a%10;
            a/=10;
            b=b*10+rem;
        }
        for(int i=Math.min(b,n);i<=Math.max(b,n);i++){
            if(prime(i)){
                sum+=i;
            }
        }
        return sum;
    }
    public boolean prime(int n){
        if(n==0 || n==1){
            return false;
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}