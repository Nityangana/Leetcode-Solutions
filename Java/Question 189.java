
class Solution {
    public void rotate(int[] nums, int k) {
        k = k% nums.length;
        int[] rotate = new int[k];
        int index = 0;
        // copy the elements to be rotated
        for (int i=nums.length-k; i<nums.length;i++) {
            rotate[index] = nums[i];
            index++;
        }

        index = nums.length-k-1;
        // Shift values to end
        for (int i=nums.length-1; i>=k; i--) {
            nums[i] = nums[index];
            index--;
        }

        //fill values of rotate into nums
        for (int i=0; i<k; i++) {
            nums[i]=rotate[i];
        }

    }
}