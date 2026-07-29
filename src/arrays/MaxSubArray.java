package arrays;

public class MaxSubArray {
    static void main(String[] args) {
        int[] arr = {5,4,-1,10,8};
        System.out.println(maxSubArray(arr));
    }
    public static int maxSubArray(int[] arr) {
        int currentSum = arr[0];
        int maxSum = arr[0];
        for(int i = 1;  i < arr.length; i++) {
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;

    }
}
