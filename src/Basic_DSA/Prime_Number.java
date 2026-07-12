package Basic_DSA;

public class Prime_Number {
    static void main(String[] args) {
        int n = 1;
        boolean isPrime = true;
        if(n <= 1) {
            System.out.println("Not Prime");
            return;
        }
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                isPrime = false;
                break;
            }
        }
        if(isPrime) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
