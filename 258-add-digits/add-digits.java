class Solution {
    public int add(int num){
        int a=0;
        while(num!=0){
            int rem=num%10;
            num/=10;
            a+=rem;
        }
        return a;
    } 
    public int addDigits(int num) {
        int a=num;
        while(a>9){
            a=add(a);
        }
       return a; 
    }
}