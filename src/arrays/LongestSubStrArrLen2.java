package arrays;

public class LongestSubStrArrLen2 {
    static void main(String[] args) {
        int[] nums = {2, 3, 1, 2, 4, 3};
        int target = 7;
        System.out.println(longestSubStrArrLen(nums, target));
    }
    public static int longestSubStrArrLen(int[] nums, int target) {
        int left = 0, sum = 0;
        int maxLength = Integer.MIN_VALUE;

        for(int right = 0; right < nums.length; right++) {
            sum += nums[right];
            while(sum > target) {
                sum -= nums[left];
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}
