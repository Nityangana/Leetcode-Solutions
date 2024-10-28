import java.util.HashMap;
import java.util.*;

class Solution {
    public int romanToInt(String s) {
        HashMap<String, Integer> d = new HashMap<String, Integer>();
        d.put("IV", 4);
        d.put("IX", 9);
        d.put("XL", 40);
        d.put("XC", 90);
        d.put("CD", 400);
        d.put("CM", 900);
        HashMap<String, Integer> single = new HashMap<String, Integer>();
        single.put("I", 1);
        single.put("V", 5);
        single.put("X", 10);
        single.put("L", 50);
        single.put("C", 100);
        single.put("D", 500);
        single.put("M",1000);
        System.out.println(single);
        int count =0;

        for (int i=0;i<s.length();i++) {
            if (i < s.length()-1){
            if (  d.containsKey(s.substring(i,i+2)) ) {
                count = count + d.get(s.substring(i,i+2));
                System.out.println("D=>"+s.substring(i,i+2));
                i+=1;

            }
            else {
                count = count + single.get(String.valueOf(s.charAt(i)));
                System.out.println("S=>"+s.charAt(i));
            }}
            else{
                count = count + single.get(String.valueOf(s.charAt(i)));
                System.out.println(s.charAt(i));
            }
        }
        return count;
    }
}
