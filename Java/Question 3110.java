import static java.lang.Math.abs;
class Solution {
    public int scoreOfString(String s) {
        int value = 0;
        for (int i=0; i<s.length()-1; i++) {
            value = value + abs( s.charAt(i) - s.charAt(i+1) );
        }
        return value;
    }
}
