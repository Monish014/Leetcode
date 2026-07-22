import java.util.Arrays;

class Solution {
    public int[] numberOfPairs(int[] nums) {
        int[] arr = new int[2];
        Arrays.sort(nums);

        int i = 0;

        while (i < nums.length - 1) {
            if (nums[i] == nums[i + 1]) {
                arr[0]++;
                i += 2;
            } else {
                arr[1]++;
                i++;
            }
        }

        if (i == nums.length - 1) {
            arr[1]++;
        }

        return arr;
    }
}