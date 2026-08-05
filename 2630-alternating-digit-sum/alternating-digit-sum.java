class Solution {
    public int alternateDigitSum(int n) {
        int sum=0;
        ArrayList<Integer> array=new ArrayList<>();
        while(n!=0){
            int rem=n%10;
            n/=10;
            array.add(rem);
        }
        int a=0;
        for(int i=array.size()-1;i>=0;i--){
            if(a%2==0){
                sum+=array.get(i);
            }
            else{
                sum-=array.get(i);
            }
            a++;
        }
        return sum;
    }
}