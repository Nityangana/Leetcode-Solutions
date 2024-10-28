class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int lowest = 100000;

        for (int i=0; i<nums.length-k+1; i++) {
            int x = Math.abs(nums[i]-nums[i+k-1]);
            if (x<lowest) {
                lowest = x;
            }
            if (lowest==0) {
                return 0;
            }
        }
        return lowest;
    }
}
