package test;

import java.util.HashMap;
import java.util.Stack;

/**
 * Created by Marcin Gumkowski on 2017-05-16.
 */
public class AmazonTest2 {

    public static void main(String[] args) {


        Solution sol = new Solution();

        System.out.println(sol.hasBalancedBrackets("(h[e{l]o}!~)()()()("));

    }

    public static class Solution {
        // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
        public int hasBalancedBrackets(String str) {
            HashMap<Character, Character> characters = new HashMap<Character, Character>();
            characters.put(')', '(');
            characters.put(']', '[');
            characters.put('}', '{');
            characters.put('>', '<');

            Stack<Character> stack = new Stack<Character>();

            for (int i = 0; i < str.length(); i++) {
                Character c = str.charAt(i);
                if (isOpenBracket(str.charAt(i))) {
                    stack.push(str.charAt(i));

                } else if (isCloseBracket(str.charAt(i))) {
                    if (stack.empty()) {
                        return 0;
                    }
                    Character last = stack.pop();
                    if (!last.equals(characters.get(c))) {
                        return 0;
                    }
                }
            }
            if (stack.empty())
                return 1;
            else return 0;

        }

        private boolean isOpenBracket(Character c) {
            return "({[<".contains(c.toString());
        }

        private boolean isCloseBracket(Character c) {
            return ")}]>".contains(c.toString());
        }
        // METHOD SIGNATURE ENDS
    }


}
