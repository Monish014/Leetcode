class Solution {
    public int pivotIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int pivot=i;
            int sum=0;
            int sum1=0;
            for(int j=0;j<pivot;j++){
                sum+=nums[j];
            }
            for(int k=pivot+1;k<nums.length;k++){
                sum1+=nums[k];
            }
            if(sum==sum1){
                return pivot;
            }
            sum=0;
            sum1=0;
        }
        return -1;
    }
}