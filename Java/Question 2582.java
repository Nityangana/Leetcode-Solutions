class Solution {
    public int passThePillow(int n, int time) {
        int r =0;
        if (time > 2*(n-1) ) {
            r = time % (2*(n-1));
        }  
        else {
            r = time;
        }  

        if ( r > (n-1) ) {
            r = r - (n-1);
            return n-r;
        }
        else {
            return r+1;
        }
    }
}
