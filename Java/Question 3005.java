class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i: nums) {
            if ( map.containsKey(i) ) {
                map.put(i,map.get(i)+1);
            }
            else {
                map.put(i,1);
            }
        }

        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int i: map.values()) {
            if (freq.containsKey(i)) {
                freq.put(i, freq.get(i)+1);
            }
            else {
                freq.put(i,1);
            }
        }

        ArrayList<Integer> list = new ArrayList<Integer>(map.size());
        list.addAll(map.values());
        int max =  Collections.max(list);
        int count = max*freq.get(max);
        /*for (int i: map.values()) {
            if (i==max) {
                count+=i;
            }
        }*/
        return count;
    }
}
