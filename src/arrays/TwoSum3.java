package arrays;
import java.util.HashMap;
import java.util.Arrays;
public class TwoSum3 {
    static void main(String[] args) {
        int[] arr = {2,3,4,5,6};
        int target = 9;
        int[] result = twoSum(arr, target);
        System.out.println(Arrays.toString(result));
    }
    public static int[] twoSum(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ; i < arr.length; i++) {
            int complement = target - arr[i];
            if(map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(arr[i], i);
        }
        return new int[]{-1,-1};
    }
}
