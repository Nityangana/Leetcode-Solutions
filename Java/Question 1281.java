// Subtract the Product and Sum of Digits of an Integer
class Solution {
    public int subtractProductAndSum(int n) {
        String num = String.valueOf(n);
        int sum = 0;
        int product = 1;
        for (int i=0; i<num.length(); i++) {
            int digit = Integer.valueOf(num.charAt(i)-'0');
            //System.out.println(digit);
            sum = sum + digit;
            product = product * digit;
        }
        return product - sum;
    }
}