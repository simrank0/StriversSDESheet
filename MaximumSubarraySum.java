public class MaximumSubarraySum {
    public static long maxSubarraySum(int[] arr, int n) {
        long max = 0L, temp = 0L;
        for (int j : arr) {
            temp += j;
            if (temp < 0) temp = 0;
            if (temp > max) max = temp;
        }
        return max;
    }
}
