import java.util.ArrayList;
import java.util.Arrays;

public class MissingAndRepeatingNumbers {
    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        // Write your code here
        int xor = 0;
        for(int i = 0; i<arr.size(); i++) {
            xor ^= (i+1);
            xor ^= arr.get(i);
        }
        int first = xor & ~(xor - 1);
        int x=0, y=0;
        for(int i = 0; i<arr.size(); i++) {
            int num = arr.get(i);
            if((num & first) != 0) {
                x^=arr.get(i);
            }else {
                y^=arr.get(i);
            }
            if(((i+1) & first) != 0) {
                x^=(i+1);
            } else {
                y^=(i+1);
            }
        }
        int[] ans = {-1, -1};
        for(int i = 0; i<arr.size(); i++) {
            if(arr.get(i)==x) {
                ans[0] = y;
                ans[1] = x;
                return ans;
            } else if(arr.get(i)==y) {
                ans[0] = x;
                ans[1] = y;
                return ans;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(3);
        arr.add(5);
        arr.add(4);
        arr.add(4);
        System.out.println(Arrays.toString(missingAndRepeating(arr, arr.size())));

    }
}
