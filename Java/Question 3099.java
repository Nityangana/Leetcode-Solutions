class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int num = 0;
        String s = Integer.toString(x);

        for (int i=0; i<s.length(); i++) {
            num = num + s.charAt(i)-48;
        }
        
        if (x%num==0) {
            return num;
        }
        return -1;
    }
}
