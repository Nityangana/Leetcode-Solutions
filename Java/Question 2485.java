class Solution {
    public int pivotInteger(int n) {
        int r = 0;
        int sum = (n*(n+1))/2;
        System.out.println(sum);

        for (int i=n/2; i<=n; i++) {
            int sumOfr = (i*(i+1))/2;
            int sumOfn = sum - sumOfr + i;
            if (sumOfr==sumOfn) {
                r = i;
                return r;
            }
        }
        return -1;
    }
}
