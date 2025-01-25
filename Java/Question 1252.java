class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] odd = new int[m][n];
        int count = 0;

        for (int[] i: indices) {
            for (int j=0; j<n; j++) {
                (odd[i[0]][j])+=1;
            }

            for (int z=0; z<m; z++) {
                odd[z][i[1]]+=1;
            }
            
        }

        for (int[] i : odd) {
            for (int j: i) {
                if (j==1 || j%2==1) {
                    count++;
                }
            }
        }

    return count;

    }
}
