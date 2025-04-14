public class RW {
    public static String reverseWords(String s) {
        s = s.trim();
        int i = s.length() - 1;
        int j = i;
        StringBuilder result = new StringBuilder();

        while (i >= 0) {
            while (i >= 0 && s.charAt(i) != ' ') i--;
            result.append(s.substring(i + 1, j + 1)).append(" ");
            while (i >= 0 && s.charAt(i) == ' ') i--;
            j = i;
        }

        return result.toString().trim();
    }

    public static void main(String[] args) {
        String input = "  Hello   world  this is   Java  ";
        System.out.println("Reversed: '" + reverseWords(input) + "'"); //OUTPUT: Reversed: 'Java is this world Hello'
    }
}
