import java.util.ArrayList;

class Solution {
    public boolean isAnagram(String s, String t) {
        int[] char_counts = new int[26];

        if (s.length() != t.length()) {
            return false;
        }

        for (int i=0; i<s.length(); i++) {
            char_counts[s.charAt(i)-'a']++;
            char_counts[t.charAt(i)-'a']--;
        }

        for (int count: char_counts) {
            if(count!=0) {
                return false;
            }
        }
        return true;
    }
}
