class Solution {
    public int countDigits(int num) {
        int count = 0;
        int val = 0;
        int num1 = num;
        //System.out.println(num1);
        for (int i=0; i<String.valueOf(num).length(); i++) {

            if (num<10) {
                return 1;
            }
            else {
                val = num1 % 10;
                //System.out.println("val"+val);
                if (num%val==0) {
                    count++;
                    //System.out.println(count);
                }
                //System.out.println("num1"+num1);
                num1 = num1/10;
                //System.out.println("num"+num1);
            }  

        }

        return count;
    }
}
