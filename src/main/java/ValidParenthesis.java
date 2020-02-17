import java.util.HashMap;
import java.util.Stack;

public class ValidParenthesis {
    public boolean isValid(String s){
        HashMap<Character, Character> workingMap = new HashMap<>();
        workingMap.put('(',')');
        workingMap.put('[',']');
        workingMap.put('{','}');

        Stack<Character> workingStack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            if (workingMap.containsKey(currentChar)) {
                workingStack.push(currentChar);
            } else if (workingMap.containsValue(currentChar)) {
                if (!workingStack.empty() && workingMap.get(workingStack.peek()) == currentChar) {
                    workingStack.pop();
                } else {
                    return false;
                }
            }
        }
        return workingStack.empty();
    }

    public static void main(String[] args) {
        ValidParenthesis validParenthesis = new ValidParenthesis();
        System.out.println(validParenthesis.isValid("()") ? "Test passed" : "Test failed");
        System.out.println(validParenthesis.isValid("()[]{}") ? "Test passed" : "Test failed");
        System.out.println(!validParenthesis.isValid("(]") ? "Test passed" : "Test failed");
        System.out.println(!validParenthesis.isValid("([)]") ? "Test passed" : "Test failed");
        System.out.println(validParenthesis.isValid("{[]}") ? "Test passed" : "Test failed");
    }
}
