class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        HashSet <Integer> num1 = new HashSet<>();
        HashSet <Integer> num2 = new HashSet<>();
        for (int i=0; i<nums1.length; i++) {
            num1.add(nums1[i]);
        }
        for (int i=0; i<nums2.length; i++) {
            num2.add(nums2[i]);
        }

        int count = 0;
        int total = 0;
        for (int i=0; i<nums1.length; i++) {
            if (num2.contains(nums1[i])) {
                count++;
            }
        }
        for (int i=0; i<nums2.length; i++) {
            if (num1.contains(nums2[i])) {
                total++;
            }
        }
        int[] values = new int[]{count, total};
        
        return values;
    }
}

/* BY LOOP

class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        //HashMap <String, Integer> nums = new HashMap<>();
        int[] values = new int[2];
        int count = 0;
        int total = 0;
        for (int i=0; i<nums1.length; i++) {
            for (int j=0; j<nums2.length; j++) {
                if (nums1[i]==nums2[j]) {
                    count++;
                    break;
                }
            }
        }
        //System.out.println(count);

        for (int i=0; i<nums2.length; i++) {
            for (int j=0; j<nums1.length; j++) {
                if (nums2[i]==nums1[j]) {
                    total++;
                    break;
                }
            }
        }
        //System.out.println(total);


        //nums.put("answer1",count);
        //nums.put("answer2", total);
        values[0] = count;
        values[1]= total;
        /*
        int j =0;
        for (int i: nums.values()) {
            values[j]=i;
            j++;
        }
        */
        return values;
    }
}

*/
