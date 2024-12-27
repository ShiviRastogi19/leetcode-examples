import java.util.Stack;

public class ValidParentheses20 {

    public boolean isValid(String s) {

        Stack<Character> characterStack = new Stack<>();

        for(char ch : s.toCharArray()) {
            if( ch == '{')
                characterStack.push('}');
            else if( ch == '[')
                characterStack.push(']');
            else if( ch == '(')
                characterStack.push(')');
            else if ( characterStack.empty() || characterStack.pop() != ch )
                return false;
        }
        return characterStack.empty();
    }

    public static void main(String[] args){
        ValidParentheses20 validParentheses20 = new ValidParentheses20();
        System.out.println("(((()}))) is valid " + validParentheses20.isValid("(((()})))"));
        System.out.println("()[]{} is valid " + validParentheses20.isValid("()[]{}"));
        System.out.println("(] is valid " + validParentheses20.isValid("(]"));
    }
}
