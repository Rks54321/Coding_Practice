package arrays;
import java.util.Arrays;
import java.util.ArrayList;
public class MergeIntervals7 {
    static void main(String[] args) {
        int[][] intervals = {
                {1,3},
                {2,8},
                {10,13},
                {14,18}
        };
        int[][] result = mergeIntervals(intervals);
        System.out.println(Arrays.deepToString(result));
    }
    public static int[][] mergeIntervals(int[][] intervals) {
        if(intervals.length <= 1) return intervals;
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));
        ArrayList<int[]> result = new ArrayList<>();
        int[] current = intervals[0];
        result.add(current);
        for(int i = 1; i < intervals.length; i++) {
            if(current[1] > intervals[i][0]) {
                current[1] = Math.max(current[1], intervals[i][1]);
            } else {
                current = intervals[i];
                result.add(current);
            }
        }

        result.add(current);
        return result.toArray(new int[result.size()][]);
    }
}
