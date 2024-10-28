class Solution {
    public int distinctAverages(int[] nums) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i: nums) {
            numbers.add(i);
        }
        HashSet <Double> set = new HashSet<>();
        //System.out.println(numbers);
        while (true) {
            if (numbers.size()<=1) {
                break;
            }
            int m = 100;
            int n = 0;
            for (int j: numbers) {
                m = Math.min(m,j);
                n = Math.max(n, j);
            }
            set.add( (m+n)/2.0 );
            //System.out.println( (m+n)/2.0);
            numbers.remove(numbers.indexOf(m));
            numbers.remove(numbers.indexOf(n));
        }
        return set.size();
    }
}
