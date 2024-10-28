class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i: arr) {
            if ( map.containsKey(i) ) {
                map.put(i,map.get(i)+1);
            }
            else {
                map.put(i,1);
            }
        }

        HashSet<Integer> count = new HashSet<>();

        for ( int i: map.values() ) {
            if (count.contains(i)) {
                return false;
            }
            else {
                count.add(i);
            }
        }
        return true;
    }
}
