import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            // Push expected matching closing bracket onto the stack
            if (c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } 
            // If stack is empty or character doesn't match top element
            else if (stack.isEmpty() || stack.pop() != c) {
                return false;
            }
        }

        // If stack is completely empty, all brackets were matched correctly
        return stack.isEmpty();
    }
}