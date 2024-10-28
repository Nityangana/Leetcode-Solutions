class Solution {
    public int countKDifference(int[] nums, int k) {
        HashMap<Integer, Integer>  set = new HashMap<>();
        for (int i=0; i<nums.length; i++) {
            if (set.containsKey(nums[i])) {
                set.put( nums[i], set.get(nums[i])+1 );
            }
            else {
                set.put(nums[i], 1);
            }
        }
        HashSet<Integer> keys = new HashSet<>(set.keySet());
        int count = 0;
        for ( int i: keys) {
            if ( keys.contains((i-k)) ) {
                count = count + (set.get(i)*set.get(i-k));
            }
        }
        //System.out.println(set);
        return count;
    }
}
