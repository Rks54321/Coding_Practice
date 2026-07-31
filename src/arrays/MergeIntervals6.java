package arrays;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
public class MergeIntervals6 {
    static void main(String[] args) {
        int[][] intervals = {
                {1,3},
                {2,8},
                {10,13},
                {14,18}
        };
        int[][] result = mergeIntervals(intervals);
        System.out.print(Arrays.deepToString(result));
    }
    public static int[][] mergeIntervals(int[][] intervals) {
        if(intervals.length <= 1) return intervals;
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));
        List<int[]> result = new ArrayList<>();
        int[] curr = intervals[0];
        for(int i = 1 ; i < intervals.length; i++) {
            if(curr[1] > intervals[i][0]) {
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
