class Solution {
    public int countEven(int num) {
        int n=num;
        int sum=0;
        while(n!=0){
            int rem=n%10;
            n/=10;
            sum+=rem;
        }
        if(sum%2==0){
            return num/2;
        }
        return (num-1)/2;
    }
}