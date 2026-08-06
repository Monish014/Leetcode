class Solution {
    public double findMaxAverage(int[] nums, int k) {
        // int a=0;
        // for(int i=0;i<k;i++){
        //     a+=nums[i];
        // }
        // int max=a;
        // for(int j=k;j<nums.length;j++){
        //     a+=nums[j]-nums[j-k];
        //     int max1=a;
        //     max=Math.max(max,max1);
        // }
        // return (double)max/k;
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(i>=k){
                sum-=nums[i-k];
            }
            if(i>=k-1){
                max=Math.max(sum,max);
            }
        }
        return (double)max/k;
    }
}