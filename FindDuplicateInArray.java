import java.util.ArrayList;
import java.util.HashSet;

public class FindDuplicateInArray {
    public static int findDuplicate(ArrayList<Integer> arr, int n){
        // Write your code here.
        HashSet<Integer> set = new HashSet<>();
        for(int i : arr) {
            if(set.contains(i)) return i;
            set.add(i);
        }
        return -1;
    }
}
