package arrays;

public class Longestsubstrarrlen {
    static void main(String[] args) {
        int[] arr = {2, 3, 1, 2, 4, 3};
        int target = 7;
        System.out.println(longestSubStrarrLen(arr, target));
    }
    public static int longestSubStrarrLen(int[] arr, int target) {
        int left = 0, sum = 0;
        int minLength = Integer.MAX_VALUE;
        for(int right = 0; right < arr.length; right++) {
            sum += arr[right];
            while(sum >= target) {
                minLength = Math.min(minLength, right - left + 1) ;
                    sum -= arr[left];
                    left++;
                }
            }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}
