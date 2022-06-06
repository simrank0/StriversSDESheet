import java.util.ArrayList;
import java.util.Collections;

public class NextPermutation {
    public static ArrayList<Integer> nextPermutation(ArrayList<Integer> permutation)
    {
        int i = permutation.size()-1;
        while(i>0 && permutation.get(i)<permutation.get(i-1)) i--;

        if(i <= 0) {
            Collections.sort(permutation);
            return permutation;
        }
        int j = permutation.size()-1;
        i--;
        while(j>i && permutation.get(j)<=permutation.get(i)) j--;
        int temp = permutation.get(i);
        permutation.set(i, permutation.get(j));
        permutation.set(j, temp);
        Collections.sort(permutation.subList(i+1, permutation.size()));
        return permutation;
    }
}
