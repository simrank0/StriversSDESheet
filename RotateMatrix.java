import java.util.ArrayList;
import java.util.Scanner;

public class RotateMatrix {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mat = new ArrayList<>();
        ArrayList<Integer> l = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        for(int i = 0; i<m; i++) {
            for(int j = 0; j<n; j++) {
                l.add(in.nextInt());
            }
            mat.add(new ArrayList<>(l));
            l.clear();
        }

        rotateMatrix(mat, m, n);
        for(int i = 0; i<m; i++) {
            System.out.println(mat.get(i));
        }
    }

    public static void rotateMatrix(ArrayList<ArrayList<Integer>> mat, int m, int n) {
        // Write your code here.
        int row = 0, col = 0;
        int prev, curr;

        while (row < m && col < n)
        {

            if (row + 1 == m || col + 1 == n)
                break;

            prev = mat.get(row + 1).get(col);

            for (int i = col; i < n; i++)
            {
                curr = mat.get(row).get(i);
                mat.get(row).set(i, prev);
                prev = curr;
            }
            row++;

            for (int i = row; i < m; i++)
            {
                curr = mat.get(i).get(n-1);
                mat.get(i).set(n-1,prev);
                prev = curr;
            }
            n--;

            if (row < m)
            {
                for (int i = n-1; i >= col; i--)
                {
                    curr = mat.get(m-1).get(i);
                    mat.get(m-1).set(i, prev);
                    prev = curr;
                }
            }
            m--;

            if (col < n)
            {
                for (int i = m-1; i >= row; i--)
                {
                    curr = mat.get(i).get(col);
                    mat.get(i).set(col, prev);
                    prev = curr;
                }
            }
            col++;
        }
    }
}

