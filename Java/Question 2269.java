class Solution {
    public int divisorSubstrings(int num, int k) {
        String s = String.valueOf(num);
        int count =0;
        int j=k;
        for (int i=0; i<s.length()-k+1; i++) {
            //System.out.println("i: "+s.charAt(i));
            if (Integer.valueOf(s.substring(i,j))!=0) {
                //System.out.println(Integer.valueOf(s.substring(i,j)));
                if ( num % Integer.valueOf( s.substring(i,j) ) == 0 ) {
                    count++;
                }
            }
            j++;
        }
        return count;
    }
}
