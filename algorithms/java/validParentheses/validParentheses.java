//
// Source          : https://leetcode.com/problems/valid-parentheses/
// Name            : Matthew Hernandez
// Date            : 2025-06-10
// Data Structure  : Stack
// Algorithm       : Open-closed brackets, no initial closed, stack empty at the end
// Time            : O(n) — only loop through the len(s) once
// Space           : O(n) - worst case only appends all strings

import java.util.Stack;
import java.util.HashMap;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> mapping = new HashMap<>();

        mapping.put('{', '}');
        mapping.put('[', ']');
        mapping.put('(', ')');

        for (char c : s.toCharArray()) {
            if (mapping.containsKey(c)) {
                stack.push(c);
            }
            else if (!stack.empty() && mapping.get(stack.peek()) == c) {
                stack.pop();
            }
            else {
                return false;
            }
        }

        return stack.empty();

    }
}
