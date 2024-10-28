class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i=0; i<nums.length; i++) {
            if (nums[i]==val) {
                nums[i]=101;
            }
            if (nums[i]!=101) {
                k++;
            }
        }
        Arrays.sort(nums);
        return k;
    }
}
