class Solution {
    public boolean canJump(int[] nums) {
        int jump = 0;
        for (int i: nums) {
            if (jump<0) {
                return false;
            }
            else if (i>jump) {
                jump = i;
            }
            jump-=1;
        }
        return true;
    }
}
