class Solution {
    public int findPermutationDifference(String s, String t) {
        int count = 0;
        HashMap<Character, Integer> sail = new HashMap <Character, Integer>();
        HashMap<Character, Integer> tail = new HashMap <Character, Integer>();
    
        for (int i=0; i<s.length(); i++) {
            sail.put(s.charAt(i), i);
            tail.put(t.charAt(i), i);
        }

        for (char ch : sail.keySet()){
            count += Math.abs(sail.get(ch) - tail.get(ch));
        }

        return count;
    }
}
