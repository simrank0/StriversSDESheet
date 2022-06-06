import java.util.ArrayList;

public class PascalsTriangle {
    public static ArrayList<ArrayList<Long>> printPascal(int n) {
        ArrayList<ArrayList<Long>> ans= new ArrayList<>();
        ArrayList<Long> l = new ArrayList<>();
        l.add(1L);
        ans.add(new ArrayList<>(l));
        if(n==1) return ans;
        l.add(1L);
        ans.add(new ArrayList<>(l));
        for(int i = 2; i<n; i++) {
            l.clear();
            l.add(1L);
            for(int j = 0; j<i-1; j++) {
                l.add(ans.get(ans.size()-1).get(j) + ans.get(ans.size()-1).get(j+1));
            }
            l.add(1L);
            ans.add(new ArrayList<>(l));
        }
        return ans;
    }
}
