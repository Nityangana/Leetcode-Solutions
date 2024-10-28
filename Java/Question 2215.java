class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> num1 = new HashSet<>();
        HashSet<Integer> num2 = new HashSet<>();
        for (int i: nums1) {
            num1.add(i);
        }
        for (int i: nums2) {
            num2.add(i);
        }

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i: num1) {
            if ( !num2.contains(i) ) {
                list1.add(i);
            }
        }
        for (int i: num2) {
            if ( !num1.contains(i) ) {
                list2.add(i);
            }
        }

        List<List<Integer>> output = new ArrayList<>();
        output.add(list1);
        output.add(list2);
        return output;
    }
}
