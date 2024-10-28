class Solution {
    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        int k = s.length()-1;
        for (int i=0; i<(s.length()/2); i++) {
            if ( s.charAt(i)!=s.charAt(k)) {
                return false;
            }
            else {
                k--;
            }
        }
        return true;
    }
}
