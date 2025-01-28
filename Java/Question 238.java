class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        answer[0]=1;
        // Calculate prefix product for each element
        for (int i=1; i<nums.length; i++) {
            answer[i] = answer[i-1]*nums[i-1];
        }

        //Calculte suffix product for each element
        int temp = 1;
        for (int i=nums.length-2; i>=0; i--) {
            temp*=nums[i+1];
            answer[i]*=temp;
        }

        return answer;
    }
}
