class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        HashMap<String,String> morse = new HashMap<>() 
        {{ put("a",".-");
        put("b","-...");
        put("c","-.-.");
        put("d","-..") ;
        put("e",".");
        put("f","..-.");
        put("g","--.");
        put("h","....");
        put("i","..");
        put("j",".---");
        put("k","-.-");
        put("l",".-..");
        put("m","--");
        put("n","-.");
        put("o","---");
        put("p",".--.");
        put( "q","--.-");
        put("r",".-.");
        put("s","...");
        put("t","-");
        put("u","..-");
        put("v","...-");
        put("w",".--");
        put("x","-..-");
        put("y","-.--");
        put("z","--.."); }};

        HashSet<String> set = new HashSet<>();

        for (String word : words) {
            String s = "";
            for (int i=0; i<word.length(); i++) {
                s+= morse.get( String.valueOf(word.charAt(i)) );
                //System.out.println(s);
            }
            //System.out.println(s);
            set.add(s);
        }
        //System.out.println(set);
        return set.size();
    }
}
