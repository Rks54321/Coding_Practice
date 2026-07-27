package arrays;
import java.util.HashSet;
public class ContainsDuplicate {
    static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(containsDp(nums));
    }
    public static boolean containsDp(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums) {
            if(set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }
}
