import java.util.Arrays;

public class SetMatrixZero {
    public static void setZeros(int[][] matrix) {
        int ind0 = -1, ind1 = -1;
        for (int[] ints : matrix) {
            if (ints[0] == 0) {
                ind0 = 0;
                break;
            }
        }

        for(int i = 0; i<matrix[0].length; i++) {
            if(matrix[0][i]==0) {
                ind1 = 0;
                break;
            }
        }

        for(int i = 0; i<matrix.length; i++)
            for(int j = 0; j<matrix[0].length; j++){
                if(matrix[i][j]==0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }

        for(int i = matrix.length - 1; i>0; i--)
            for(int j = matrix[0].length - 1; j>0; j--) {
                if(matrix[0][j]==0 || matrix[i][0]==0) {
                    matrix[i][j] = 0;
                }
            }
        if(ind0 == 0) {
            for(int i = 0; i<matrix.length; i++) {
                matrix[i][0] = 0;
            }
        }

        if(ind1 == 0) {
            Arrays.fill(matrix[0], 0);
        }

    }
}
