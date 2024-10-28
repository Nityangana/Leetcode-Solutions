class Solution {
    public boolean squareIsWhite(String coordinates) {
        if ( coordinates.contains("a") || coordinates.contains("c") || coordinates.contains("e") || coordinates.contains("g") ) {
            if ( Integer.valueOf(coordinates.charAt(1)-'0')%2==0) {
                return true;
            }
            else {
                return false;
            }
        }
        else {
            if ( Integer.valueOf(coordinates.charAt(1)-'0')%2==0) {
                return false;
            }
            else {
                return true;
            }
        }
    }
}
