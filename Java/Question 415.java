class Solution {
    public String addStrings(String num1, String num2) {
        String num3 = "";
        int i = num1.length()-1;
        int j = num2.length()-1;
        int m = 0;
        int n = 0;
        int carry = 0;
        while (i>=0 || j>=0 || carry>0) {
            if (i<0) {
                n = 0;
                //System.out.println(n);
            }
            else {
                n = num1.charAt(i) - '0';
                //System.out.println(n);
            }
            if (j<0) {
                m = 0;
                //System.out.println(m);
            }
            else {
                m = num2.charAt(j) - '0';
                //System.out.println(m);
            }

            int sum = n + m + carry;
            if (sum>9) {
                num3+=String.valueOf(sum%10);
                carry = sum/10;
            }
            else {
                num3+=String.valueOf(sum);
                carry = 0;
            }
            i--;
            j--;
        }
        
        String result = new StringBuilder(num3).reverse().toString();
        return result;
    }
}
