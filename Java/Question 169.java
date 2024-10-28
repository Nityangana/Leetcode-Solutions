class Solution {
    public int majorityElement(int[] nums) {
        int k = 0;
        float n = (float)nums.length/2;
        //System.out.println(n);

        for (int i=0; i<nums.length; i++) {
            float count = 0;

            if (i==0) {
                for (int j=0; j<nums.length; j++) {
                    if (nums[i]==nums[j]) {
                            count++;
                    }
                }
            }

            else if (nums[i]!=nums[i-1]) {
                for (int j=i; j<nums.length; j++) {
                    if (nums[i]==nums[j]) {
                        count++;
                    }
                }
            }
            //System.out.println(count);
            //System.out.println(n.length/2);
            if ( count > n ) {
                k = nums[i];
                break;
            }
        }

        return k;
    }
}
