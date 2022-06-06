public class Sort012 {
    public static void sort012(int[] arr)
    {
        int low = 0, mid = 0, high = arr.length-1;
        while(mid<=high) {
            switch (arr[mid]) {
                case 0 -> {
                    int temp = arr[mid];
                    arr[mid] = arr[low];
                    arr[low] = temp;
                    low++;
                    mid++;
                }
                case 1 -> mid++;
                case 2 -> {
                    int temp = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp;
                    high--;
                }
            }
        }
    }
}
