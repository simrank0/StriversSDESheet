public class CountInversions {
    static long res = 0;
    public static long getInversions(long arr[], int n) {
        // Write your code here.
        mergeSort(arr, 0, n-1);
        return res;
    }

    static void mergeSort(long [] arr, long l, long r){
        if(l >= r)
            return;

        long m = (l+r)/2;
        mergeSort(arr, l, m);
        mergeSort(arr, m+1, r);
        merge(arr, l, m, r);
    }

    static void merge(long arr[], long l,  long m, long r)
    {
        long n1 = m-l+1, n2 = r-m;
        long[] left = new long[(int)n1];
        long[] right = new long[(int)n2];
        for( long i = 0; i < n1; i++)
            left[(int)i] = arr[(int)(l+i)];
        for( long i = 0; i < n2; i++)
            right[(int)i] = arr[(int)(m+i+1)];

        int i = 0, j = 0, k =(int) l;
        while(i < n1 && j < n2)
        {
            if(left[i] <= right[j])
                arr[k++] = left[i++];
            else
            {
                arr[k++] = right[j++];
                res += (n1-i);
            }
        }
        while(i < n1)
        {
            arr[k++] = left[i++];
        }
        while(j < n2)
        {
            arr[k++] = right[j++];
        }
    }
}
