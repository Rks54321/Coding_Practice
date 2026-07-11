package backtracking;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class GenerateBalancedParenthesis {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> result = generateBalancedParenthesis(n);
        for(String item : result) {
            System.out.println(item);
        }
    }
    public static List<String> generateBalancedParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backTrack(result, "", 0, 0, n);
        return result;
    }
    public static void backTrack(List<String> result, String current, int open, int close, int n) {

        if(current.length() == 2 * n) {
            result.add(current);
            return;
        }

        if(open < n) {
            backTrack(result, current + "(" , open + 1, close, n);
        }

        if(close < open) {
            backTrack(result, current + ")", open, close  +1, n);
        }
    }
}
