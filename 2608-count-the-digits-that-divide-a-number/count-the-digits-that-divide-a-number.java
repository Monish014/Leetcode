class Solution {
    public int countDigits(int num) {
        int count=0;
        int digit=num;
        while(digit!=0){
            int rem=digit%10;
            if(num%rem==0){
                count++;
            }
            digit/=10;
        }
        return count;
    }
}