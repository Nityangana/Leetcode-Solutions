class Solution {
    public boolean equalFrequency(String word) {
        //enter values in Hashmap
        HashMap <Character, Integer> map = new HashMap<>();
        for (char i: word.toCharArray()) {
            if (map.containsKey(i)) {
                map.put(i,map.get(i)+1);
            }
            else {
                map.put(i,1);
            }
        }

        for (char i: map.keySet()) {
            int x = map.get(i)-1;
            int count = 0;
            for (char j: map.keySet()) {
                if (j==i) {
                    continue;
                }
                else if (x==0) {
                    x = map.get(j);
                    count++;
                }
                else if ( map.get(j)==x ) {
                    count++;
                }
            }
            if ( count==map.size()-1 ) {
                return true;
            }
        }
         return false;
    }
}
