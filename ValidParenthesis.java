import java.util.Map;
import java.util.Stack;

public class ValidParenthesis {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> charMap = Map.of(')', '(', '}', '{', ']', '[');
        char current = ' ';
        for(int i = 0; i < s.length(); i++) {
            current = s.charAt(i);
            if (current == '{' || current == '(' || current == '[') {
                stack.push(current);
            }
            else if(current == '}' || current == ')' || current == ']') {
                if(stack.isEmpty()) {
                    return false;
                }
                else if(charMap.get(current) != stack.pop()) {
                        return  false;
                }
            }
        }
        return stack.isEmpty();
    }
}
