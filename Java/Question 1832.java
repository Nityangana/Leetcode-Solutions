class Solution {
    public boolean checkIfPangram(String sentence) {
        if (sentence.length()<26) {
            return false;
        }
        HashSet<Character> letters = new HashSet<>();
        for (char i: sentence.toCharArray()) {
            letters.add(i);
        }
        //System.out.println(letters.size());
        if (letters.size()==26) {
            return true;
        }
        else {
            return false;
        }
        
    }
}
