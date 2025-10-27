"""
Problem				https://leetcode.com/problems/decode-string/
Data Structure			Stack
Time				O(n) ~approx. (string concatenatoin may be n^2)
Space				O(n)
"""

class Solution:
    def decodeString(self, s: str) -> str:
        stack = []

        for char in s:
            if char != "]":
                stack.append(char)
            else:
                substr = ""
                while stack and stack[-1] != "[":
                    substr = stack.pop() + substr
                stack.pop() # popping the left bracket [
                
                k = ""
                while stack and stack[-1].isdigit():
                    k = stack.pop() + k
                
                stack.append(int(k) * substr)
        print(stack)
        return "".join(stack)
