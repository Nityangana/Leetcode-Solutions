class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;

        for( int i = low; i<high+1; i++) {
            int n = String.valueOf(i).length();
            //System.out.println("n: "+num);
            int num = i;
            //System.out.println("i"+i);
            int num1 = 0;
            int num2 = 0;

            if (n%2==0 && num>10) {
                
                for (int j=0; j<n/2; j++) {
                    int temp = num%10;
                    //System.out.println("temp: "+temp);
                    num2 = num2 + temp;
                    //System.out.println("num2: "+num2);
                    num = num/10;
                    //System.out.println("num: "+num);
                }

                for (int j=0; j<n/2; j++) {
                    int temp = num%10;
                    //System.out.println("temp: "+temp);
                    num1 = num1 + temp;
                    //System.out.println("num1: "+num1);
                    num = num/10;
                    //System.out.println("num: "+num);
                }

                if (num1==num2) {
                count++;
                //System.out.println("i: "+i);
            }

            }

            
        }
        return count;
    }
}
