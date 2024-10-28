class Solution {
    public int numberOfPairs(int[] nums1, int[] nums2, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<nums1.length; i++) {
            for (int j=0; j<nums2.length; j++) {
                if ( nums1[i]%(nums2[j]*k)==0 && !map.containsKey(nums1[i]) ) {
                    map.put(nums1[i],1);
                }
                else if ( nums1[i]%(nums2[j]*k)==0 ) {
                    map.put( nums1[i], map.get(nums1[i])+1 );
                }
            }
        }
        int count = 0;
        for ( int i:map.values() ) {
            count+=i;
        }
        return count;
    }
}
