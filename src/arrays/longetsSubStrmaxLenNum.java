package arrays;

public class longetsSubStrmaxLenNum {
    static void main(String[] args) {
        int[] nums = {2, 3, 1, 2, 4, 3};
        int target = 7;
        longestSubStrArrLenNum(nums, target);
    }
    public static void longestSubStrArrLenNum(int[] nums, int target) {
        int left = 0, sum = 0;
        int maxlength = 0;
        int start = -1, end = -1;
        for(int right = 0; right < nums.length; right++) {
            sum += nums[right];
            while(sum > target) {
                sum -= nums[left];
                left++;
            }
            if(right - left + 1 > maxlength) {
                maxlength = Math.max(maxlength, right - left + 1);
                start = left;
                end = right;
            }
        }
        if(start != -1) {
            System.out.println("AubArray: ");
            for(int i = start; i <= end; i++) {
                System.out.print(nums[i] + " " );
            }
        }

    }
}
