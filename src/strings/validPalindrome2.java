package strings;

public class validPalindrome2 {
    static void main(String[] args) {
        String s = "raca     a car";
        System.out.println(validPalindrome(s));
    }
    public static boolean validPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while( i < j) {
            while(i < j && !Character.isLetterOrDigit(s.charAt(i))) i++;
            while(i < j && !Character.isLetterOrDigit(s.charAt(j))) j--;
            if(Character.toLowerCase(s.charAt(i++)) != Character.toLowerCase(s.charAt(j--))) {
                return false;
            }
        }
        return true;
    }
}
