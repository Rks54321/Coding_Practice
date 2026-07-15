package strings;

public class ValidAnagram {
    static void main(String[] args) {
        String s = "";
        System.out.println(validAnagram(s));
    }
    public static boolean validAnagram(String s) {
        if(s.length() == 0) return false;
        int[] arr = new int[256];
        for(int i = 0 ; i < arr.length; i++) {
            char ch = s.charAt(i);
            if()
        }
    }
}
