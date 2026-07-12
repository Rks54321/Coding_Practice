package Basic_DSA;

public class Palindrome_Number {
    static void main(String[] args) {
        int num = 121;
        int original = num;
        int reverse = 0;
        while(num > 0) {
            int digit = num % 10;
            reverse = reverse *  10 + digit;
            num /= 10;
        }
        if(reverse == original) {
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not Palindrome Number");
        }
    }
}
