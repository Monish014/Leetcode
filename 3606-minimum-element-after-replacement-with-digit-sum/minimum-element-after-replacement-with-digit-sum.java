class Solution {
    public int minElement(int[] nums) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            int num=0;
            while(nums[i]!=0){
                int rem=nums[i]%10;
                nums[i]=nums[i]/10;
                num+=rem;
            }
            nums[i]=num;
            if(num<min){
                min=num;
            }
        }
        return min;
    }
}