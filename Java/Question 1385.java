class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count = 0;
        boolean trigger = true;
        for (int i: arr1) {
            trigger = true;
            for (int j: arr2) {
                if (Math.abs(i-j)<=d) {
                    trigger = false;
                    break;
                }
            }
            if (trigger) {
                count++;
            }
        }

        return count;
    }
}
