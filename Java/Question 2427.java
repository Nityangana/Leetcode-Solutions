class Solution {
    public int commonFactors(int a, int b) {
        int minimum = Math.min(a,b);
        HashSet<Integer> num_a = new HashSet<>();
        HashSet<Integer> num_b = new HashSet<>();
        int count = 0;

        for (int i=1; i<=minimum; i++) {
            if (a%i==0) {
                num_a.add(i);
            }
        }

        for (int i=1; i<=minimum; i++) {
            if (num_a.contains(i) && b%i==0) {
                num_b.add(i);
                count++;
            }
        }
        return count;
    }
}

/* BY LOOP

class Solution {
    public int commonFactors(int a, int b) {
        int count = 0;

        if (a<b) {
            for (int i=1; i<=a; i++) {
                if (a%i==0 && b%i==0) {
                    count++;
                }
            }
        }
        else {
            for (int i=1; i<=b; i++) {
                if (a%i==0 && b%i==0) {
                    count++;
                }
            }
        }
        return count;
    }
}

*/
