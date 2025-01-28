class Solution {
    public void setZeroes(int[][] matrix) {
        List<Integer> index = new ArrayList<>();
        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix[0].length; j++) {
                if (matrix[i][j]==0) {
                    index.add(i);
                    index.add(j);
                }
            }
        }

        for (int i=0; i<index.size(); i+=2) {
            for (int j=0; j<matrix[0].length; j++) {
                matrix[index.get(i)][j] = 0;
            }

            for (int j=0; j<matrix.length; j++) {
                matrix[j][index.get(i+1)] = 0;
            }
        }
    }
}
