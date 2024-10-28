class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            String str = String.valueOf(num);
            System.out.println("String: " + str);
            char max = '0';
            for (char i : str.toCharArray()) {
                if (i > max) {
                    max = i;
                    System.out.println("max: " + max);
                }
            }
            StringBuilder sb = new StringBuilder(str.length());
            for (int i = 0; i < str.length(); i++) {
                sb.append(max);
                System.out.println("sb: " + sb);

            }
            int digit = Integer.parseInt(sb.toString());
            sum += digit;
            System.out.println("sum" + sum);
        }
        return sum;
    }
}
