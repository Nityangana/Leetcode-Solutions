class Solution {
    public int maxProduct(int[] nums) {
        int max_value = 0;
        for (int i=0; i<nums.length; i++) {
            for (int j=i+1; j<nums.length; j++) {
                if ( (nums[i]-1)*(nums[j]-1) > max_value) {
                    max_value = (nums[i]-1)*(nums[j]-1);
                }
            }
        }
        return max_value;
        
    }
}
