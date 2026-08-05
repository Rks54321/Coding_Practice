package Kodnest;
import java.util.Scanner;
public class MaxLenSubStrWithTwoOccr {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] freq = new int[256];
        int left = 0, maxLen = 0;
        for(int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            freq[ch]++;
            while(freq[ch] > 2) {
                freq[s.charAt(left)]--;
                left++;
            }
            maxLen = Math.max(maxLen, right-left+1);
        }

        System.out.println(maxLen);
    }
}
