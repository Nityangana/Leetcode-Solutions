class Solution {
    public int countCompleteDayPairs(int[] hours) {
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        for (int i=0; i<hours.length; i++) {
            map.putIfAbsent(Math.abs(24-hours[i]), new ArrayList<Integer>());
            map.get(Math.abs(24-hours[i])).add(i);
        }

        ArrayList<Integer> values = new ArrayList<>(hours.length);
        for (int i: map.keySet()) {
            for (int j: map.get(i)) {
                values.add(j);
            }
        }
        //System.out.println(values);
        
        int count = 0;
        for (int i: values) {
            for (int j : values) {
                int sum = hours[i] + hours[j];
                if ( i<j && sum%24==0) {
                    count++;
                }
            }
        }
        return count;

    }
}
