class Solution {
    public int addDigits(int num) {
        while (true) {
            String s = String.valueOf(num);
            char[] ch = s.toCharArray();
            num = 0;
            for (int i=0; i<ch.length; i++) {
            num = num + ((int)ch[i]-48);
            }
            //System.out.println(num);
            if (num<10) {
                return num;
            }
        }    
    }
}
