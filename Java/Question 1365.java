class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = nums.clone();
        Arrays.sort(result);
        HashMap<Integer, Integer> num = new HashMap<Integer, Integer>();
        for (int i=0; i<nums.length; i++) {
            num.putIfAbsent(result[i], i);
        }

        for (int i=0; i<nums.length; i++) {
            result[i] = num.get(nums[i]);
        }

        return result;
    }
}
