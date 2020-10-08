package com.imooc.stack;

public class ValidParentheses {
    /**
     * Time: O(n)
     * Space: O(n)
     * */
    public static boolean isValid(String str) {
        if (str == null) {
            return false;
        }

        Stack<Character> stack = new ArrayStack<>();
        char[] chars = str.toCharArray();
        for (char c : chars) {
            if (c == '[' || c == '(' || c == '{') {
                stack.push(c);
            } else if (c == ']' && stack.pop() != '[') {
                return false;
            } else if (c == '}' && stack.pop() != '{') {
                return false;
            } else if (c == ')' && stack.pop() != '(') {
                return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String str = "(()){}[]";
        boolean res = isValid(str);
        System.out.println(res);
    }
}
