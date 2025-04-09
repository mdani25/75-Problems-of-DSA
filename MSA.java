public class MSA {
    public static String mergeAlternately(String word1, String word2) {
        String merged = "";
        int i = 0, j = 0;

        while (i < word1.length() || j < word2.length()) {
            if (i < word1.length()) {
                merged += word1.charAt(i++);
            }
            if (j < word2.length()) {
                merged += word2.charAt(j++);
            }
        }

        return merged;
    }
    public static void main(String[] args) {
        String word1="hello";
        String word2="world";
        System.out.println(mergeAlternately(word1,word2));  //OUTPUT: hweolrllod
    }
}