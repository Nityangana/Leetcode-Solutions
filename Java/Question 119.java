class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> triangle = new ArrayList<List<Integer>>();

        for (int i=0; i<rowIndex+1; i++) {
            List<Integer> k = new ArrayList<Integer>();
            for (int j=0; j<i; j++) {
                if (j==0) {
                    k.add(1);
                }
                else {
                    List<Integer> m = triangle.get(i-1);
                    k.add( (m.get(j-1) + m.get(j)) );
                }
            }
            k.add(1);
            triangle.add(k);
        }
        return triangle.get(rowIndex);
    }
}
