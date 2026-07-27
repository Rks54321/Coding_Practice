package arrays;

public class MaxSubArrLenDW {
    static void main(String[] args) {
    int[] nums = {1, 2, 1, 1, 1};
    int target = 3;
    System.out.println(maxSubArrayLen(nums, target));
    }
    public static int maxSubArrayLen(int[] nums, int target) {
        int left = 0;
        int windowSum = 0;
        int maxLength = Integer.MIN_VALUE;
        for(int right = 0; right < nums.length; right++) {
//            Expand the windoww
            windowSum += nums[right];

//            Condition
            while(windowSum >= target) {
//                Shrink window
                windowSum = windowSum - nums[left];
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength == Integer.MIN_VALUE ? 0 : maxLength;
    }
}






