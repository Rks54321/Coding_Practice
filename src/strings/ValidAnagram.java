package strings;

public class ValidAnagram {
    static void main(String[] args) {
        String s = "anagrame";
        System.out.println(validAnagram(s));
    }
    public static boolean validAnagram(String s) {
        if(s.length() == 0) return false;
        int[] arr = new int[256];
        for(char c : s.toCharArray()) arr[c - 'a']++;
        for(char c : s.toCharArray()) arr[c - 'a']--;
        for(int x : arr) {
            if(x != 0) return false;
        }
        return true;
    }
}
