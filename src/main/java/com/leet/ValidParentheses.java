package com.leet;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/*
 * 20. Valid Parentheses
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * */
public class ValidParentheses {
    public boolean isValid1(String s) {
        if (s.length() % 2 != 0) return false;
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    if (ch == ')') {
                        if (stack.peek() == '(') {
                            stack.pop();
                        } else {
                            return false;
                        }
                    }
                    if (ch == ']') {
                        if (stack.peek() == '[') {
                            stack.pop();
                        } else {
                            return false;
                        }
                    }
                    if (ch == '}') {
                        if (stack.peek() == '{') {
                            stack.pop();
                        } else {
                            return false;
                        }
                    }
                }
            }
        }
        return stack.empty();
    }

    public boolean isValid2(String s) {
        if (s.length() % 2 != 0) return false;

        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');

        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (map.containsValue(ch)) {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    Character val = map.get(ch);
                    if (stack.peek() == val) {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
            }
        }
        return stack.empty();
    }
}
