
import java.util.Scanner;
import java.util.Stack;

public class BalancedString {
    static boolean isBalanced(String exp){
        Stack<Character> stk = new Stack<>();
        String open="{[(";

        for(int i=0 ; i < exp.length() ; i++){
            char ch = exp.charAt(i);
            if(open.contains(ch+""))
                stk.push(ch);
            else{
                if(stk.isEmpty())
                    return false;
                else if(ch == '}' && stk.peek() != '{')
                    return false;
                else if(ch == ']' && stk.peek() != '[')
                    return false;
                else if(ch == ')' && stk.peek() != '(')
                    return false;
                else
                    stk.pop();
            }
        }
        return stk.isEmpty();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String exp = sc.next();

        System.out.println(isBalanced(exp));
    }
}
