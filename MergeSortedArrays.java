public class MergeSortedArrays {
    public static int[] ninjaAndSortedArrays(int nums1[], int nums2[], int m, int n) {
        // Write your code here.
        int j = n-1, k = m-1;;
        for(int i = m+n-1; i>=0; i--) {
            if(k<0) nums1[i] = nums2[j--];
            else if(j<0) nums1[i] = nums1[k--];
            else nums1[i] = nums1[k]>nums2[j] ? nums1[k--] : nums2[j--];
        }
        return nums1;
    }
}
