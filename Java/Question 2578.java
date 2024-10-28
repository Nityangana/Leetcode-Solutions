class Solution {
    public int splitNum(int num) {
        char[] numbers = String.valueOf(num).toCharArray();
        Arrays.sort(numbers);
        String num1 = "";
        String num2 = "";
        for (int i=0; i<numbers.length; i+=2) {
            num1+=numbers[i];
            //System.out.println(num1);
        }
        for (int i=1; i<numbers.length; i+=2){
            num2+=numbers[i];
            //System.out.println(num2);
        }
        return (Integer.parseInt(num1)+Integer.parseInt(num2));
    }
}
