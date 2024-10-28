class Solution {
    public int sumOfUnique(int[] nums) {
        HashSet<Integer> num = new HashSet<>();
        HashSet<Integer> duplicate = new HashSet<>();
        for (int i: nums) {
            if (!num.contains(i)) {
                num.add(i);
            }
            else {
                duplicate.add(i);
            }
        }

        int count = 0;
        for (int i: num) {
            if ( !duplicate.contains(i) ) {
                count+=i;
            }
        }
        return count;
    }
}
