class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int[][] invert = new int[image.length][image.length];

        // flip the image horizontally
        for (int i=0; i<image.length; i++) {
            int k = 0;
            for (int j=image.length-1; j>=0; j--) {
                invert[i][k] = image[i][j];
                k++;
            }
        }

        // invert the image
        for (int[] i: invert) {
            for (int j=0; j<i.length; j++) {
                if (i[j]==1) {
                    i[j]=0;
                }
                else {
                    i[j]=1;
                }
            }
        }

        return invert;
    }
}
