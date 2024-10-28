class Solution {
    public int climbStairs(int n) {
        int a = 1;
        int b = 2;
        int c = 0;
        if (n==1 || n==2) {
            return n;
        }
        else {
            for (int i=3; i<=n; i++) {
            c = a + b;
            a = b;
            b = c;
            //System.out.println(i+": "+ c);
            }
        }
        
        return c;
    }
}
