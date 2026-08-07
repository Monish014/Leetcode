class Solution {
    public int numberOfSteps(int num) {
        int count=0;
        if(num%2!=0){
            count++;
        }
        int num1=num;
        while(num1!=0){
            num1/=2;
            count++;
            if(num1%2!=0){
                num1-=1;
                count++;
            }
        }
        return count;
    }
}