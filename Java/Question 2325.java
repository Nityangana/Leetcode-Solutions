class Solution {
    public String decodeMessage(String key, String message) {
        char[] k = key.toCharArray();
        char[] m = message.toCharArray();
        HashMap <Character, Character> decode = new HashMap<Character, Character>();
        decode.put(' ', ' ');
        int count = 97;
        for (int i=0; i<key.length(); i++) {
            if ( !decode.containsKey(k[i]) ) {
                decode.put(k[i], (char)count);
                count++;
            }
        }
        
        String s = "";
        for (int i=0; i<message.length(); i++) {
            s+=decode.get(m[i]);
        }
        return s;
    }
}
