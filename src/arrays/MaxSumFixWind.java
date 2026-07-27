package arrays;

public class MaxSumFixWind {
    static void main(String[] args) {
        int[] arr = {4, 2, 1, 7, 8, 1, 2, 8};
        int k = 3;
        System.out.println(maxSumFixWind(arr, k));
    }
    public static int maxSumFixWind(int[] arr, int k) {
        int windowSum = 0;
        for(int i = 0; i < k; i++) {
            windowSum += arr[i];
        }
        int maxSum = windowSum;
        for(int i = k; i < arr.length; i++) {
            windowSum = windowSum - arr[i-k] + arr[i];
            maxSum = Math.max(maxSum, windowSum);
        }
        return maxSum;
    }
}
