import java.math.BigInteger;
class Solution {
    public String addBinary(String a, String b) {

        BigInteger first = new BigInteger(a, 2);
        //System.out.println(first);
        BigInteger second = new BigInteger(b, 2);
        //System.out.println(second);
        BigInteger result = first.add(second);
        String binResult = result.toString(2);
        //System.out.println(binResult);
        return binResult;
    }
    //int num1 = Integer.parseInt(a,2);
    //int num2 = Integer.parseInt(b,2);
    //int sum = num1 + num2;

    //return Integer.toBinaryString(sum);
}
