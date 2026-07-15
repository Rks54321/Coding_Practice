package strings;
import java.util.Stack;
public class ValidParenthesis4 {
    static void main(String[] args) {
        String s = "()()";
        System.out.println(validParenthesis(s));
    }
    public static boolean validParenthesis(String s) {
        if(s.length() == 0) return false;
        Stack<Character> st = new Stack();
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else {
                if(st.isEmpty()) {
                    return false;
                } else {
                    char top = st.pop();
                    if(ch == ')' && top != '(' ||
                    ch == '}' && top != '{' ||
                    ch == ']' && top != '[') {
                        return false;
                    }
                }
            }
        }
        return st.isEmpty();
    }
}
