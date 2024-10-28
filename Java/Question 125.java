class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^A-Za-z0-9]", "");
        int j = s.length() - 1;
        for (int i=0; i<s.length()/2;i++) {
            if (s.charAt(i)!=s.charAt(j)) {
                return false;
            }
        j--;
        }
        return true;
    }
}
