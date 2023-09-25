// AMI DESAI - 60009210122
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Overlapping_Intervals {

    public static int[][] merge(int[][] intervals) {
        if (intervals == null || intervals.length <= 1) {
            return intervals;
        }
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> mergedIntervals = new ArrayList<>();
        int[] currentInterval = intervals[0];
        for (int i = 1; i < intervals.length; i++) {
            int[] nextInterval = intervals[i];
            if (currentInterval[1] >= nextInterval[0]) {
                currentInterval[1] = Math.max(currentInterval[1], nextInterval[1]);
            }
            else {
                mergedIntervals.add(currentInterval);
                currentInterval = nextInterval;
            }
        }
        mergedIntervals.add(currentInterval);
        return mergedIntervals.toArray(new int[mergedIntervals.size()][]);
    }
    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {2, 6}, {8,10}, {15,18}};
        int[][] merged = merge(intervals);
        System.out.println("Merged Intervals:");
        for (int[] interval : merged) {
            System.out.println(Arrays.toString(interval));
        }
    }
}