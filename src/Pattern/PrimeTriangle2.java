package Pattern;

public class PrimeTriangle2 {
    static void main(String[] args) {
        int row = 5;
        int num = 2;
        for(int i = 0; i < row; i++) {
            for(int j = 0; j <= i; j++) {
                while(!isPrime(num)) {
                    num++;
                }
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
        }
    public static boolean isPrime(int num) {
        if(num < 2) return false;
        for(int i = 2; i < Math.sqrt(num); i++) {
            if(num % i == 0) return false;
        }
        return true;
    }
}
