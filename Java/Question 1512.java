//BY HASHING
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        Map<Integer, Integer> num = new HashMap<Integer, Integer>();
        for (int i=0; i<nums.length; i++) {
            num.putIfAbsent(nums[i], nums[i]);
        }
        for (int i=0; i<nums.length; i++) {
            for (int j=i+1; j<nums.length; j++) {
                if ( num.get(nums[i]) == num.get(nums[j]) ) {
                    count++;
                }
            }
        }
        return count;
    }
}
// BY LOOP
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        for (int i=0; i<nums.length; i++) {
            for (int j=i+1; j<nums.length; j++) {
                if (nums[i]==nums[j] && i<j) {
                    count++;
                }
            }
        }
        return count;
    }
}
