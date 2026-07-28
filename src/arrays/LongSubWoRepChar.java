package arrays;
import java.util.HashSet;
public class LongSubWoRepChar {
    static void main(String[] args) {
        String s = "abcabc";
        System.out.println(longestSubWoRepChar(s));
    }
    public static int longestSubWoRepChar(String s) {
        int maxSub = 0;
        int left = 0;
        HashSet<Character> set = new HashSet<>();
        for(int right = 0; right < s.length(); right++) {
            if(set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxSub = Math.max(maxSub, right-left + 1);
        }
        return maxSub;
    }
}
