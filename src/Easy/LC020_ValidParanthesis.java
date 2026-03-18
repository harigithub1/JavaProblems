package Easy;
import java.util.Stack;

public class LC020_ValidParanthesis {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            // Push opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            // Handle closing brackets
            else {
                if (stack.isEmpty()) return false;

                char top = stack.pop();

                if (ch == ')' && top != '(') return false;
                if (ch == '}' && top != '{') return false;
                if (ch == ']' && top != '[') return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String args[]) {
        String s = "()";//s = "()[]{}" true//s = "(]" false//s = "([])" true//s = "([)]" false
        System.out.println(isValid(s));
    }
}