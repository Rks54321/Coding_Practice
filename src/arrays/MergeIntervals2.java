package arrays;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
public class MergeIntervals2 {
    static void main(String[] args) {
        int[][] intervals = {
                {1,3},
                {2,6},
                {8,10},
                {15,18}
        };
        int[][] ans = mergeIntervals(intervals);
        for(int i = 0; i < ans.length; i++) {
            System.out.print(Arrays.toString(ans[i]));
            if(i != ans.length-1) {
                System.out.print(",");
            }
        }
    }
    
    public static int[][] mergeIntervals(int[][] intervals) {
        if(intervals.length <= 1) return intervals;
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));
        List<int[]> result = new ArrayList<>();
        int[] curr = intervals[0];
        for(int i = 1; i < intervals.length; i++) {
            if(curr[1] >= intervals[i][0]) {
                curr[1] = Math.max(curr[1], intervals[i][1]);
            } else {
                result.add(curr);
                curr = intervals[i];
            }
        }
        result.add(curr);
        return result.toArray(new int[result.size()][]);
    }
}
