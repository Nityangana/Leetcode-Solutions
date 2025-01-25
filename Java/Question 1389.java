// USING ARRAYLIST
class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];
        List<Integer> ans = new ArrayList<>();

        for (int i=0; i<nums.length; i++) {
            ans.add( index[i],nums[i] );
        }

        for (int i=0; i<nums.length; i++) {
            target[i] = ans.get(i);
        }

        return target;
    }
}



// BY BRUTE FORCE
class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];
        Arrays.fill(target, -1);

        for (int i=0; i<index.length; i++) {

            if ( target[ index[i] ]== -1 ) {
                target[ index[i] ] = nums[i];
            }

            else if ( target[ index[i] ]!= -1 ) {

                int num = target[ index[i] ];
                target[ index[i] ] = nums[i];

                for (int j = (index[i]+1); j<nums.length; j++) {

                    if ( target[j]!= -1 ) {
                        int temp = target[j];
                        target[j] = num;
                        num = temp;
                    }
                    else {
                        target[j] = num;
                        break;
                    }

                }
            }
                

        }
        return target;
    }
}