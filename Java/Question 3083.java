class Solution {
    public boolean isSubstringPresent(String s) {
        StringBuilder r = new StringBuilder(s);
        r.reverse();
        for (int i=0; i<s.length()-1; i++) {
            for (int j=0;j<r.length()-1;j++) {
                if ( s.charAt(i)==r.charAt(j) && s.charAt(i+1)==r.charAt(j+1) ) {
                    return true;
                }
            }

        }
        return false;
    }
}
