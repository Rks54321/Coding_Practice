package arrays;

public class FibonacciSeries {
    static void main(String[] args) {
        int a = 0, b = 1;
        int N = 8;
        for(int i =  0; i < N; i++) {
            System.out.print(a + " ");

            int c = a + b;
            a = b;
            b = c;

        }
    }
}
