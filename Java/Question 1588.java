class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        for (int i=0; i<arr.length; i++) {
            //System.out.println("");
            for (int j=i; j<arr.length; j++) {
                if (i==j) {
                    sum+=arr[i];
                    //System.out.println(arr[i]);
                    //System.out.println("");
                }
                else if ((j-i)%2==0) {
                    for (int k=i; k<j+1; k++) {
                        sum+=arr[k];
                        //System.out.println(arr[k]);
                    }
                    //System.out.println("");
                }
            }
        }
        return sum;
    }
}
