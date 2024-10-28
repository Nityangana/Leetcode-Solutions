class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int count = 0;
        char[] ch = s.toCharArray();
        for (int i = ch.length-1; i>=0; i--) {
            if (Character.isWhitespace(ch[i])) {
                break;
            }
            else {
                count = count + 1;
            }
        }
        return count;
    }
}
