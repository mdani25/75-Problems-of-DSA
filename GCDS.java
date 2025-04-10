public class GCDS {
    public static String gcd(String str1, String str2) {
        if(!(str1+str2).equals(str2+str1)){
            return "";
        }

        return str1.substring(0,gcdc(str1.length(),str2.length()));
        
    }
    private static int gcdc(int a, int b) {
        return b==0?a:gcdc(b,a%b);
    }
    public static void main(String[] args) {
        String str1="ABCABC";
        String str2="ABC";
        System.out.println(gcd(str1,str2)); //OUTPUT: ABC
    }

    
}
