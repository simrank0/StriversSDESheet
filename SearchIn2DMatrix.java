import java.util.ArrayList;

public class SearchIn2DMatrix {
    static boolean findTargetInMatrix(ArrayList<ArrayList<Integer>> mat, int m, int n, int target) {
        // Write your code here.
        int row = -1;
        for (int i = 0; i < m; i++) {
//             System.out.println(mat.get(i).get(n-1));
            if (mat.get(i).get(n - 1) >= target) {
                row = i;
                break;
            }
        }
        if (row == -1) return false;
        int mid, l = 0, r = n - 1;
        while (l <= r) {
            mid = (l + r) / 2;
            if (mat.get(row).get(mid) == target) return true;
            else if (mat.get(row).get(mid) > target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return false;
    }
}
