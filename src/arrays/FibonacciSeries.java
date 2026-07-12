package arrays;

public class FibonacciSeries {
    static void main(String[] args) {
        int a = 0;
        int b = 1;
        int N = 10;

        for(int i = 0; i < N; i++) {
            System.out.print(a + " ");

            int c = a + b;
            a = b;
            b = c;
        }
    }
}
