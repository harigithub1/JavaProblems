package _04StackAndQueue._1easy;
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
        System.out.println(isValid("()"));        // true
        System.out.println(isValid("()[]{}"));    // true
        System.out.println(isValid("(]"));        // false
        System.out.println(isValid("([)]"));      // false
        System.out.println(isValid("{[]}"));      // true
    }
}
/**
 * stack Pattern (LIFO Pattern)
 * 🚀 Where This Pattern Appears (FAANG)
 *
 * This is a high-frequency pattern:
 *
 * ✅ Valid Parentheses (this problem)
 *
 * ✅ Next Greater Element
 *
 * ✅ Min stack
 *
 * ✅ Largest Rectangle in Histogram
 *
 * ✅ Daily Temperatures
 *
 * ✅ Decode String
 */