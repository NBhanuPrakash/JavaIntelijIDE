import java.util.ArrayDeque;
import java.util.Deque;

public class IsValidParentasis {
    public static void main(String[] args) {
        System.out.println(isValid("(]"));

    }
    public static boolean isValid(String s){
        Deque<Character> dque = new ArrayDeque<>();
        for (char c: s.toCharArray()) {
            if (c =='('){
                dque.push(')');
            }else if (c == '['){
                dque.push(']');
            }else if (c == '{'){
                dque.push('}');
            }else if (dque.isEmpty() || dque.pop()!=c){
                return false;
            }
        }
        return dque.isEmpty();
    }
}
