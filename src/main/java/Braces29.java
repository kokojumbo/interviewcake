import java.util.Stack;

/**
 * Created by Marcin Gumkowski on 2016-11-28.
 */
public class Braces29 {


    public static void main(String[] args) {


        String test = "{[(])}";
        System.out.println(checkString(test));
    }


    public static boolean isOpener(char c) {
        return c == '(' || c == '{' || c == '[';
    }

    public static boolean isCloser(char c) {
        return c == ')' || c == '}' || c == ']';
    }

    public static boolean areParenthesses(char o, char c) {
        return (o == '(' && c == ')') || (o == '{' && c == '}') || (o == '[' && c == ']');
    }

    public static boolean checkString(String text) {
        if (text.length() % 2 != 0)
            return false;
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (isOpener(c)) {
                stack.push(c);
                //push
            } else if (isCloser(c)) {
                char o = stack.pop();
                if (!areParenthesses(o, c)) {
                    return false;
                }

            } else {
                return false;
            }
        }
        if (stack.empty())
            return true;
        else return false;
    }
}
