class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        HashSet<Character> jewel = new HashSet<Character>();
        for (int i=0; i<jewels.length(); i++) {
            jewel.add(jewels.charAt(i));
        }

        for (char c : stones.toCharArray()) {
            if ( jewel.contains(c) ) {
                count++;
            }
        }
        return count;
    }
}
