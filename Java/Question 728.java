class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<Integer>();

        for (int i=left; i<=right; i++) {
            int length = String.valueOf(i).length();
            //System.out.println("length" + length);
            int num = i;
            //System.out.println("i"+i);
            int count = 0;
            for (int j=0; j<length; j++) {
                int div = 0;

                if (num<10) {
                    div = num;
                }
                else {
                    div = num%10;
                    num = num/10;
                    //System.out.println("div" + div);
                    //System.out.println("num" + num);
                }
                
                if ( div!=0 && i%div==0 ) {
                    count++;
                    //System.out.println("count" + count);
                }
                else {
                    break;
                }
            }
            if (count == length) {
                list.add(i);
            }
        }
        return list;
    }
}
