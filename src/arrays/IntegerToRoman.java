package arrays;
import java.util.Scanner;
public class IntegerToRoman {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(IntToRom(num));
    }
    public static String IntToRom(int num) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbol = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < values.length; i++) {
            while(num >= values[i]) {
                result.append(symbol[i]);
                num -= values[i];
            }
        }
        return result.toString();
    }
}
