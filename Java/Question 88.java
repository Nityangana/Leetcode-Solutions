class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j =0;
        for (int i=m; i<m+n; i++) {
            //System.out.println("i:" + i);
            if (n>0 && j<n) {
                nums1[i]=nums2[j];
                //System.out.println(i+" :" + nums1[i]);
                j++;
            }  
        }
        Arrays.sort(nums1);
    }
}
