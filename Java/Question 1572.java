class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;

        // if matrix is 1x1
        if (mat.length==1) {
            return mat[0][0];
        }

        // if matrix is 2x2 or greater
        int j = mat.length-1;
        for (int i=0; i<mat.length; i++) {
            if (i==j) {
                sum+=mat[i][i];
            }
            else {
                sum+=mat[i][i];
                sum+=mat[i][j];
            }
            j--;
        }
        return sum;
    }
}