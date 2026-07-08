package arrays;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public class TwoSum {
    static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};
        int target = 9;

        int[] result = twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ; i  < nums.length; i++) {
            int complement = target - nums[i];
            if(map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1,-1};
    }
}

//Completed Program
