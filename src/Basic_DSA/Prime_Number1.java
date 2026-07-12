package Basic_DSA;
import java.util.Scanner;
public class Prime_Number1 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n <= 1) {
            System.out.println("Not Prime");
            return;
        }
        boolean isPrime = true;
        for(int i = 2; i < Math.sqrt(n); i++) {
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
