class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int top = 0;
        int bottom = n;
        int left = 0;
        int right = n;
        int num = 1;

        while ( num<=(n*n) ) {
            for (int i = left; i<right; i++) {
                matrix[top][i] = num;
                num++;
            }
            top++;

            for (int i = top; i<bottom; i++) {
                matrix[i][right-1] = num;
                num++;
            }
            right--;

            for (int i =right-1; i>=left; i--) {
                matrix[bottom-1][i] = num;
                num++;
            }
            bottom--;

            for (int i = bottom-1; i>=top; i--) {
                matrix[i][left] = num;
                num++;
            }
            left++;
        }

        return matrix;
    }
}