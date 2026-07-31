package Infosys;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ConstArray {

    static final long MOD = 1_000_000_007L;
    static final long P = 2L; // (10^9 + 9) mod (10^9 + 7)

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine().trim());
        int x = Integer.parseInt(br.readLine().trim());
        int k = Integer.parseInt(br.readLine().trim());

        List<Long> primeFactors = new ArrayList<>();
        int value = x;

        for (int d = 2; (long) d * d <= value; d++) {
            while (value % d == 0) {
                primeFactors.add((long) d);
                value /= d;
            }
        }
        if (value > 1) {
            primeFactors.add((long) value);
        }

        if (k > primeFactors.size()) {
            System.out.println(-1);
            return;
        }

        while (primeFactors.size() > k) {
            int last = primeFactors.size() - 1;
            long merged = primeFactors.get(last) * primeFactors.get(last - 1);
            primeFactors.remove(last);
            primeFactors.set(last - 1, merged);
        }

        long answer = 0;
        long power = 1;

        int blocks = n / k;
        for (int b = 0; b < blocks; b++) {
            for (long num : primeFactors) {
                answer = (answer + (num % MOD) * power) % MOD;
                power = (power * P) % MOD;
            }
        }

        System.out.println(answer);
    }
}
