class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int max=Integer.MIN_VALUE;
        int low=0;
        int mid=1;
        int high=nums.length-1;
        int pro=1;
        while(mid<high){
           pro=nums[low]*nums[mid]*nums[high];
            max=Math.max(max,pro);
            low++;
            mid++;
        }
        return max;
        // Arrays.sort(nums);
        // int product1=nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];
        // int product2=nums[0]*nums[1]*nums[nums.length-1];
        // return Math.max(product1,product2);
    }
}