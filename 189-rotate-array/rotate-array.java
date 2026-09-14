class Solution {
    public void rotate(int[] nums, int k) {
        // //int a=k%nums.length;
        // //int[] arr=new int[nums.length];
        // //int b=0;
        // List<Integer> arr=new ArrayList<>();
        // for(int i=nums.length-(k%nums.length);i<nums.length;i++){
        //     // arr[b]=nums[i];
        //     // b++;
        //     arr.add(nums[i]);
        // }
        // for(int j=0;j<nums.length-(k%nums.length);j++){
        //     // arr[b]=nums[j];
        //     // b++;
        //     arr.add(nums[j]);
        // }
        // for(int i=0;i<nums.length;i++){
        //     nums[i]=arr.get(i);
        // }
        k=k%nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
        }
        public void reverse(int[] nums,int start,int end){
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
}