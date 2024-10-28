class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i: arr) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i)+1);
            }
            else {
                map.put(i,1);
            }
        }

        int x = 0;
        for (int i: map.keySet()) {
            if (i==map.get(i) && i>x) {
                x = i;
            }
        }

        if (x!=0) {
            return x;
        }
        else{
            return -1;
        }
    }
}
