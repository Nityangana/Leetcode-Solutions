class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<List<Integer>>();

        for (int i=0; i<numRows; i++) {
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
        return triangle;
    }
}
