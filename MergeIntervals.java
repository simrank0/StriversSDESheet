import java.util.*;

public class MergeIntervals {
    static class Interval {
        int start, finish;

        Interval(int start, int finish) {
            this.start = start;
            this.finish = finish;
        }

        @Override
        public String toString() {
            return "(" + start + "," + finish + ')';
        }
    }

    public static List<Interval> mergeIntervals(Interval[] intervals) {
        Arrays.sort(intervals, Comparator.<Interval>
                        comparingInt(character1 -> character1.start)
                .thenComparingInt(character2 -> character2.finish));
        ArrayList<Interval> ans = new ArrayList<>();
        for (Interval in : intervals) {
            if (ans.isEmpty()) ans.add(in);
            else {
                Interval alin = ans.get(ans.size() - 1);
                if (alin.finish < in.start) ans.add(in);
                else {
                    int end = Math.max(alin.finish, in.finish);
                    ans.set(ans.size() - 1, new Interval(alin.start, end));
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Interval[] intervals = new Interval[2];
        intervals[0] = new Interval(1, 5);
        intervals[1] = new Interval(2, 3);
        System.out.println(mergeIntervals(intervals));
    }

}

