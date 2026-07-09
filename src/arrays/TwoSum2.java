package arrays;
import java.util.HashMap;
public class TwoSum2 {
    static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};
        int target = 9;

        twoSum(nums, target);
    }
    public static void twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for
        (int i = 0 ; i < nums.length; i++) {
            int complement = target - nums[i];
            if(map.containsKey(complement)) {
                System.out.println("[" + (map.get(complement)+1) + "," + (i+1) + "]");
                break;
            }
            map.put(nums[i], i);
        }
    }
}
