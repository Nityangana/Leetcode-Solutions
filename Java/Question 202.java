class Solution {
    public boolean isHappy(int n) {
        ArrayList<Integer> num = new ArrayList<Integer>();
        //num.add(n);

        while (true) {
            String s = String.valueOf(n);
            char[] ch = s.toCharArray();
            //System.out.println(ch);
            n = 0;
            for (int i=0; i<ch.length; i++) {
                n = n + ( ((int)ch[i]-48) * ((int)ch[i]-48) );
            }
            //System.out.println(n);
            if (n==1) {
                return true;
            }
            else if (num.contains(n)) {
                return false;
            }
            else {
                num.add(n);
            }
        }

    }
}
