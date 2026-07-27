package arrays;

public class MaxSumFixedWindow {
    static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;
        System.out.println(subArrFixedWind(arr, k));
    }
    public static int subArrFixedWind(int[] arr, int k) {
        int windowSum = 0;
        for(int i = 0 ; i < k; i++) {
            windowSum += arr[i];
        }
        int maxSum = windowSum;
        for(int i = k; i < arr.length; i++) {
            windowSum = windowSum - arr[i-k] + arr[i];
            maxSum = Math.max(windowSum, maxSum);
        }
        return maxSum;
    }
}
