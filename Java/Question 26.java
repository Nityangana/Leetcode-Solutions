class Solution {
    public int removeDuplicates(int[] nums) {
        //ArrayList<Integer> numlist = Arrays.asList(nums);
        int k = 0;
        for (int i=0; i < nums.length; i++) {
            //System.out.println("i: " + nums[i]);
            for (int j=i+1; j < nums.length; j++) {
                //System.out.println("j: " + nums[j]);
                if (nums[i]==nums[j]) {
                    nums[j]=101;
                }
            }
            Arrays.sort(nums);
            if (nums[i]!=101) {
                k=k+1;
            }
            //System.out.println(k);
        }
        return k;
    }
}
