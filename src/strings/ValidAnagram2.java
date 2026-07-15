package strings;

public class ValidAnagram2 {
    static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(validAnagram(s, t));
    }
    public static boolean validAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] freq = new int[26];
        for(char c : s.toCharArray()) freq[c - 'a']++;
        for(char c : t.toCharArray()) freq[c - 'a']--;
        for(int x : freq) if(x != 0) return false;
        return true;
    }
}
